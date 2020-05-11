package com.kreezcraft.diamondglass.block;

import com.kreezcraft.diamondglass.Blocks;
import com.kreezcraft.diamondglass.DiamondGlass;

import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;

public class DiamondGlassPane extends StainedGlassPaneBlock {
	public DiamondGlassPane(DyeColor color) {
		super(color, Properties.create(Material.GLASS, color).hardnessAndResistance(Blocks.glassHardness, 1200.0F).notSolid().sound(SoundType.GLASS));
		this.setRegistryName(new ResourceLocation(DiamondGlass.ModId, "diamondglasspane_" + color.toString()));
	}
}
