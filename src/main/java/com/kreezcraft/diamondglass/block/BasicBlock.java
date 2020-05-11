package com.kreezcraft.diamondglass.block;

import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BasicBlock extends Block {

	public BasicBlock(String name, float hard, float rest) {
		super(Properties.create(Material.SAND).hardnessAndResistance(hard, rest));
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, name));
	}
	
	public BasicBlock(String name, float both) {
		super(Properties.create(Material.SAND).hardnessAndResistance(both));
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, name));
	}
}
