package com.kreezcraft.diamondglass.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block DIAMOND_GLASS = new BlockGlass("diamond_glass").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SAND = new BlockStandard("diamond_sand").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_GLASS_PANE = new PaneGlass("diamond_glass_pane").setCreativeTab(CreativeTabs.MATERIALS);

}