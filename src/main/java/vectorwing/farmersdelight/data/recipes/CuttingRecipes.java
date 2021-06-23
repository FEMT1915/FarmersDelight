package vectorwing.farmersdelight.data.recipes;

import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;
import vectorwing.farmersdelight.crafting.ingredients.ToolIngredient;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.registry.ModItems;
import vectorwing.farmersdelight.utils.tags.ForgeTags;

import java.util.function.Consumer;

public class CuttingRecipes
{
	public static void register(Consumer<IFinishedRecipe> consumer) {
		// Knife
		chopMeats(consumer);
		chopPlants(consumer);
		chopPastries(consumer);

		// Pickaxe
		salvageBricks(consumer);

		// Axe
		stripWood(consumer);
		salvageWoodenFurniture(consumer);

		// Shovel
		digSediments(consumer);

		// Shears
		salvageUsingShears(consumer);
	}

	private static void chopMeats(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BEEF), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.MINCED_BEEF.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.PORKCHOP), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.BACON.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CHICKEN), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.CHICKEN_CUTS.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COOKED_CHICKEN), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.COOKED_CHICKEN_CUTS.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COD), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.COD_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COOKED_COD), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.COOKED_COD_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SALMON), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.SALMON_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COOKED_SALMON), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.COOKED_SALMON_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.HAM.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), Items.PORKCHOP, 2)
				.addResult(Items.BONE)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.MUTTON), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.MUTTON_CHOPS.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COOKED_MUTTON), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.COOKED_MUTTON_CHOPS.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.SMOKED_HAM.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), Items.COOKED_PORKCHOP, 2)
				.addResult(Items.BONE)
				.build(consumer);
	}

	private static void chopPlants(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.CABBAGE.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.CABBAGE_LEAF.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.RICE_PANICLE.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.RICE.get(), 1)
				.addResult(ModItems.STRAW.get())
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.MELON), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), Items.MELON_SLICE, 9)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.PUMPKIN), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.PUMPKIN_SLICE.get(), 4)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.BROWN_MUSHROOM_COLONY.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), Items.BROWN_MUSHROOM, 5)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.RED_MUSHROOM_COLONY.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), Items.RED_MUSHROOM, 5)
				.build(consumer);
	}

	private static void chopPastries(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CAKE), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.CAKE_SLICE.get(), 7)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.APPLE_PIE.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.APPLE_PIE_SLICE.get(), 4)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.SWEET_BERRY_CHEESECAKE.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get(), 4)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.CHOCOLATE_PIE.get()), Ingredient.fromTag(ForgeTags.TOOLS_KNIVES), ModItems.CHOCOLATE_PIE_SLICE.get(), 4)
				.build(consumer);
	}

	private static void salvageBricks(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BRICKS), new ToolIngredient(ToolType.PICKAXE), Items.BRICK, 4)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.NETHER_BRICKS), new ToolIngredient(ToolType.PICKAXE), Items.NETHER_BRICK, 4)
				.build(consumer);
	}

	private static void stripWood(Consumer<IFinishedRecipe> consumer) {
		// Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_OAK_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_OAK_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Birch
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_BIRCH_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_BIRCH_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Spruce
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_SPRUCE_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_SPRUCE_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Jungle
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_JUNGLE_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_JUNGLE_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Acacia
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_ACACIA_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_ACACIA_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_LOG), new ToolIngredient(ToolType.AXE), Items.STRIPPED_DARK_OAK_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_WOOD), new ToolIngredient(ToolType.AXE), Items.STRIPPED_DARK_OAK_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_STEM), new ToolIngredient(ToolType.AXE), Items.STRIPPED_CRIMSON_STEM)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_HYPHAE), new ToolIngredient(ToolType.AXE), Items.STRIPPED_CRIMSON_HYPHAE)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_STEM), new ToolIngredient(ToolType.AXE), Items.STRIPPED_WARPED_STEM)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_HYPHAE), new ToolIngredient(ToolType.AXE), Items.STRIPPED_WARPED_HYPHAE)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
	}

	private static void salvageWoodenFurniture(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_DOOR), new ToolIngredient(ToolType.AXE), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_SIGN), new ToolIngredient(ToolType.AXE), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_DOOR), new ToolIngredient(ToolType.AXE), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_SIGN), new ToolIngredient(ToolType.AXE), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_DOOR), new ToolIngredient(ToolType.AXE), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_SIGN), new ToolIngredient(ToolType.AXE), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_DOOR), new ToolIngredient(ToolType.AXE), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_SIGN), new ToolIngredient(ToolType.AXE), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_DOOR), new ToolIngredient(ToolType.AXE), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_SIGN), new ToolIngredient(ToolType.AXE), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_DOOR), new ToolIngredient(ToolType.AXE), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_SIGN), new ToolIngredient(ToolType.AXE), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_DOOR), new ToolIngredient(ToolType.AXE), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_SIGN), new ToolIngredient(ToolType.AXE), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_DOOR), new ToolIngredient(ToolType.AXE), Items.WARPED_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_TRAPDOOR), new ToolIngredient(ToolType.AXE), Items.WARPED_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_SIGN), new ToolIngredient(ToolType.AXE), Items.WARPED_PLANKS).build(consumer);
	}

	private static void digSediments(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CLAY), new ToolIngredient(ToolType.SHOVEL), Items.CLAY_BALL, 4)
				.build(consumer);
	}

	private static void salvageUsingShears(Consumer<IFinishedRecipe> consumer) {
		// Saddle
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SADDLE), Ingredient.fromTag(Tags.Items.SHEARS), Items.LEATHER, 2)
				.addResult(Items.IRON_NUGGET, 2)
				.build(consumer);
		// Book
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_HELMET), Ingredient.fromTag(Tags.Items.SHEARS), Items.LEATHER, 1)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_CHESTPLATE), Ingredient.fromTag(Tags.Items.SHEARS), Items.LEATHER, 1)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_LEGGINGS), Ingredient.fromTag(Tags.Items.SHEARS), Items.LEATHER, 1)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_BOOTS), Ingredient.fromTag(Tags.Items.SHEARS), Items.LEATHER, 1)
				.build(consumer);
	}
}
