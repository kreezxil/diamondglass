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

	public static final Block DIAMOND_SANDSTONE = new BlockStandard("diamond_sandstone").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE = new BlockStandard("diamond_smooth_sandstone").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE = new BlockStandard("diamond_chiseled_sandstone").setCreativeTab(CreativeTabs.MATERIALS);

	public static final Block DIAMOND_SANDSTONE_STAIRS = new ModStairs("stair_diamond_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_STAIRS = new ModStairs("stair_diamond_smooth_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE_STAIRS = new ModStairs("stair_diamond_chiseled_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);

	public static final Block DIAMOND_SANDSTONE_SLAB = new ModSlab("slab_diamond_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_SLAB = new ModSlab("slab_diamond_smooth_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE_SLAB = new ModSlab("slab_diamond_chiseled_sandstone", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);

}