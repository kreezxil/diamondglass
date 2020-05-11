package com.kreezcraft.diamondglass;

import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DiamondTab extends ItemGroup {

	public DiamondTab() {
		super("diamondGlass");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Blocks.glass.get(DyeColor.CYAN.ordinal()));
	}
}
