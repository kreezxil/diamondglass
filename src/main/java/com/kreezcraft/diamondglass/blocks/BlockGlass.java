package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGlass extends BlockBase {

	public BlockGlass(String name) {
		super(Material.GLASS, name);

		setHardness(125f);
		setResistance(6000f);
	}

	@Override
	public BlockGlass setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}