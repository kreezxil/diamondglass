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

	public static final Block DIAMOND_GLASS_STAIRS = new GlassStairs("diamond_glass_stairs", DIAMOND_GLASS).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_GLASS_SLAB = new GlassSlab("diamond_glass_slab", DIAMOND_GLASS).setCreativeTab(CreativeTabs.MATERIALS);

	public static final Block DIAMOND_SANDSTONE = new BlockStandard("diamond_sandstone").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE = new BlockStandard("diamond_sandstone_smooth").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE = new BlockStandard("diamond_sandstone_chisel").setCreativeTab(CreativeTabs.MATERIALS);

	public static final Block DIAMOND_SANDSTONE_STAIRS = new ModStairs("diamond_sandstone_stairs", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_STAIRS = new ModStairs("diamond_sandstone_smooth_stairs", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE_STAIRS = new ModStairs("diamond_sandstone_chisel_stairs", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);

	public static final Block DIAMOND_SANDSTONE_SLAB = new ModSlab("diamond_sandstone_slab", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_SLAB = new ModSlab("diamond_sandstone_smooth_slab", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);
	public static final Block DIAMOND_CHISELED_SANDSTONE_SLAB = new ModSlab("diamond_sandstone_chisel_slab", DIAMOND_SANDSTONE).setCreativeTab(CreativeTabs.MATERIALS);

}