package com.kreezcraft.diamondglass.blocks;

import java.util.Random;

import com.kreezcraft.diamondglass.DiamondConfig;
import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

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
