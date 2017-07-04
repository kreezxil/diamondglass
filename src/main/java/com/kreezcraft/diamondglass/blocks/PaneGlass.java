package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class PaneGlass extends PaneBase {

	public PaneGlass(String name) {
		super(Material.GLASS, name);
		setHardness(25f);
		setResistance(6000f);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

}
