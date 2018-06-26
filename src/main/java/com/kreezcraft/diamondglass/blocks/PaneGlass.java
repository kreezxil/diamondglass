package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.DiamondConfig;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class PaneGlass extends PaneBase {

	public PaneGlass(String name) {
		super(Material.GLASS, name);
		setHardness(DiamondConfig.diamondLevel.diamondHardness);
		setResistance(DiamondConfig.diamondLevel.diamondResitance);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

}
