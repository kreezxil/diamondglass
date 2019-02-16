package com.kreezcraft.diamondglass.blocks;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondConfig;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStandard extends BlockBase {

	public BlockStandard(String name) {
		super(Material.ROCK, name);
		setHardness(DiamondConfig.nondiamondLevel.standardHardness);
		setResistance(DiamondConfig.nondiamondLevel.standardResistance);
	}

	public BlockStandard(Material material, String name) {
		super(material, name);
	}

	@Override
	public BlockStandard setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Nullable
	@Override
	public String getHarvestTool(final IBlockState state) {
		return super.getHarvestTool(state);
	}

	@Override
	public boolean isToolEffective(final String type, final IBlockState state) {
		return super.isToolEffective(type, state);
	}
}