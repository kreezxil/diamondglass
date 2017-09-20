package com.kreezcraft.diamondglass.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block DIAMOND_GLASS = new GlassBlock("diamond_glass");
	public static final Block DIAMOND_SAND = new DiamondSand("diamond_sand");
	public static final Block DIAMOND_GLASS_PANE = new PaneGlass("diamond_glass_pane");

	public static final Block DIAMOND_GLASS_STAIRS = new GlassStairs("diamond_glass_stairs", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB = new GlassSlab("diamond_glass_slab", DIAMOND_GLASS);

	public static final Block DIAMOND_SANDSTONE = new BlockStandard("diamond_sandstone");
	public static final Block DIAMOND_SMOOTH_SANDSTONE = new BlockStandard("diamond_smooth_sandstone");
	public static final Block DIAMOND_CHISELED_SANDSTONE = new BlockStandard("diamond_chiseled_sandstone");

	public static final Block DIAMOND_SANDSTONE_STAIRS = new ModStairs("diamond_sandstone_stairs", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_STAIRS = new ModStairs("diamond_smooth_sandstone_stairs", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_CHISELED_SANDSTONE_STAIRS = new ModStairs("diamond_chiseled_sandstone_stairs", DIAMOND_SANDSTONE);

	public static final Block DIAMOND_SANDSTONE_SLAB = new ModSlab("diamond_sandstone_slab", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_SLAB = new ModSlab("diamond_smooth_sandstone_slab", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_CHISELED_SANDSTONE_SLAB = new ModSlab("diamond_chiseled_sandstone_slab", DIAMOND_SANDSTONE);

}