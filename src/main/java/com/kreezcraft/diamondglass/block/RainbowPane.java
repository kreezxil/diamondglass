package com.kreezcraft.diamondglass.block;

import com.kreezcraft.diamondglass.Blocks;
import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class RainbowPane extends PaneBlock {

	public RainbowPane() {
		super(Block.Properties.create(Material.GLASS).hardnessAndResistance(Blocks.glassHardness).notSolid().sound(SoundType.GLASS));
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, "rainbowglasspane"));
	}

}
