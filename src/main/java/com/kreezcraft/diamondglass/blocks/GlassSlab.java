package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class GlassSlab extends ModSlab {

	public GlassSlab(String name, Block block) {
		super(name, block);
		setLightOpacity(0);
		useNeighborBrightness = true;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return state.getValue(VARIANT) == SlabVariant.DOUBLE;
	}

}
