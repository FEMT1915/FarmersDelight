package vectorwing.farmersdelight.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vectorwing.farmersdelight.utils.TextUtils;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MilkBottleItem extends ConsumableItem
{
	public MilkBottleItem(Properties properties) {
		super(properties);
	}

	@Override
	public void affectConsumer(ItemStack stack, World worldIn, LivingEntity consumer) {
		Iterator<EffectInstance> itr = consumer.getActivePotionEffects().iterator();
		ArrayList<Effect> compatibleEffects = new ArrayList<>();

		while (itr.hasNext()) {
			EffectInstance effect = itr.next();
			if (effect.isCurativeItem(new ItemStack(Items.MILK_BUCKET))) {
				compatibleEffects.add(effect.getPotion());
			}
		}

		if (compatibleEffects.size() > 0) {
			EffectInstance selectedEffect = consumer.getActivePotionEffect(compatibleEffects.get(worldIn.rand.nextInt(compatibleEffects.size())));
			if (selectedEffect != null && !net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.entity.living.PotionEvent.PotionRemoveEvent(consumer, selectedEffect))) {
				consumer.removePotionEffect(selectedEffect.getPotion());
			}
		}
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 32;
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		IFormattableTextComponent empty = TextUtils.getTranslation("tooltip.milk_bottle");
		tooltip.add(empty.mergeStyle(TextFormatting.BLUE));
	}
}
