package com.kreezcraft.diamondglass.block;

import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.ResourceLocation;

public class BasicStair extends StairsBlock {

	public BasicStair(Block base, String name) {
		super(() -> (base.getDefaultState()), Properties.from(base).notSolid());
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, name+"stair"));
	}
}
