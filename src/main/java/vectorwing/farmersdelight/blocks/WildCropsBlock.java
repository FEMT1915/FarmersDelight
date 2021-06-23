package vectorwing.farmersdelight.blocks;

public class WildCropsBlock extends WildPatchBlock
{
	public WildCropsBlock(Properties properties) {
		super(properties);
	}

	@Override
	public OffsetType getOffsetType() {
		return OffsetType.NONE;
	}
}
