package com.kreezcraft.diamondglass;

import com.kreezcraft.diamondglass.blocks.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DiamondGlassTab extends CreativeTabs {

	public DiamondGlassTab(String label) {
		super(DiamondGlass.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitBlocks.DIAMOND_GLASS_STAIRS);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}