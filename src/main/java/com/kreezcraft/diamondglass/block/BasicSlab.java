package com.kreezcraft.diamondglass.block;

import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.ResourceLocation;

public class BasicSlab extends SlabBlock {

	public BasicSlab(Block base, String name) {
		super(Properties.from(base).notSolid());
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, name+"slab"));
	}
}
