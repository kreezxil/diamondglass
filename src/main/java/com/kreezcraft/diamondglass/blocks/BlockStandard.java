package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStandard extends BlockBase {

	public BlockStandard(String name) {
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}

	public BlockStandard(Material material, String name) {
		super(material, name);
	}

	@Override
	public BlockStandard setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}