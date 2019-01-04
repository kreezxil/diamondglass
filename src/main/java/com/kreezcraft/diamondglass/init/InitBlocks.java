package com.kreezcraft.diamondglass.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.diamondglass.blocks.BlockStandard;
import com.kreezcraft.diamondglass.blocks.DiamondSand;
import com.kreezcraft.diamondglass.blocks.GlassBlock;
import com.kreezcraft.diamondglass.blocks.GlassSlab;
import com.kreezcraft.diamondglass.blocks.GlassStairs;
import com.kreezcraft.diamondglass.blocks.ModSlab;
import com.kreezcraft.diamondglass.blocks.ModStairs;
import com.kreezcraft.diamondglass.blocks.PaneGlass;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block DIAMOND_GLASS = new GlassBlock("diamond_glass"); // cyan
	public static final Block DIAMOND_GLASS_BLACK = new GlassBlock("diamond_glass_black");
	public static final Block DIAMOND_GLASS_RED = new GlassBlock("diamond_glass_red");
	public static final Block DIAMOND_GLASS_GREEN = new GlassBlock("diamond_glass_green");
	public static final Block DIAMOND_GLASS_BROWN = new GlassBlock("diamond_glass_brown");
	public static final Block DIAMOND_GLASS_BLUE = new GlassBlock("diamond_glass_blue");
	public static final Block DIAMOND_GLASS_PURPLE = new GlassBlock("diamond_glass_purple");
	public static final Block DIAMOND_GLASS_lIGHT_GRAY = new GlassBlock("diamond_glass_light_gray");
	public static final Block DIAMOND_GLASS_GRAY = new GlassBlock("diamond_glass_gray");
	public static final Block DIAMOND_GLASS_PINK = new GlassBlock("diamond_glass_pink");
	public static final Block DIAMOND_GLASS_LIME = new GlassBlock("diamond_glass_lime");
	public static final Block DIAMOND_GLASS_YELLOW = new GlassBlock("diamond_glass_yellow");
	public static final Block DIAMOND_GLASS_LIGHT_BLUE = new GlassBlock("diamond_glass_light_blue");
	public static final Block DIAMOND_GLASS_MAGENTA = new GlassBlock("diamond_glass_magenta");
	public static final Block DIAMOND_GLASS_ORANGE = new GlassBlock("diamond_glass_orange");
	public static final Block DIAMOND_GLASS_WHITE = new GlassBlock("diamond_glass_white");

	public static final Block DIAMOND_SAND = new DiamondSand("diamond_sand");

	public static final Block DIAMOND_GLASS_PANE = new PaneGlass("diamond_glass_pane");
	public static final Block DIAMOND_GLASS_PANE_BLACK = new PaneGlass("diamond_glass_pane_black");
	public static final Block DIAMOND_GLASS_PANE_RED = new PaneGlass("diamond_glass_pane_red");
	public static final Block DIAMOND_GLASS_PANE_GREEN = new PaneGlass("diamond_glass_pane_green");
	public static final Block DIAMOND_GLASS_PANE_BROWN = new PaneGlass("diamond_glass_pane_brown");
	public static final Block DIAMOND_GLASS_PANE_BLUE = new PaneGlass("diamond_glass_pane_blue");
	public static final Block DIAMOND_GLASS_PANE_PURPLE = new PaneGlass("diamond_glass_pane_purple");
	public static final Block DIAMOND_GLASS_PANE_lIGHT_GRAY = new PaneGlass("diamond_glass_pane_light_gray");
	public static final Block DIAMOND_GLASS_PANE_GRAY = new PaneGlass("diamond_glass_pane_gray");
	public static final Block DIAMOND_GLASS_PANE_PINK = new PaneGlass("diamond_glass_pane_pink");
	public static final Block DIAMOND_GLASS_PANE_LIME = new PaneGlass("diamond_glass_pane_lime");
	public static final Block DIAMOND_GLASS_PANE_YELLOW = new PaneGlass("diamond_glass_pane_yellow");
	public static final Block DIAMOND_GLASS_PANE_LIGHT_BLUE = new PaneGlass("diamond_glass_pane_light_blue");
	public static final Block DIAMOND_GLASS_PANE_MAGENTA = new PaneGlass("diamond_glass_pane_magenta");
	public static final Block DIAMOND_GLASS_PANE_ORANGE = new PaneGlass("diamond_glass_pane_orange");
	public static final Block DIAMOND_GLASS_PANE_WHITE = new PaneGlass("diamond_glass_pane_white");

	public static final Block DIAMOND_GLASS_STAIRS = new GlassStairs("diamond_glass_stairs", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_BLACK = new GlassStairs("diamond_glass_stairs_black", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_RED = new GlassStairs("diamond_glass_stairs_red", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_GREEN = new GlassStairs("diamond_glass_stairs_green", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_BROWN = new GlassStairs("diamond_glass_stairs_brown", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_BLUE = new GlassStairs("diamond_glass_stairs_blue", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_PURPLE = new GlassStairs("diamond_glass_stairs_purple",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_lIGHT_GRAY = new GlassStairs("diamond_glass_stairs_light_gray",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_GRAY = new GlassStairs("diamond_glass_stairs_gray", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_PINK = new GlassStairs("diamond_glass_stairs_pink", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_LIME = new GlassStairs("diamond_glass_stairs_lime", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_YELLOW = new GlassStairs("diamond_glass_stairs_yellow",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_LIGHT_BLUE = new GlassStairs("diamond_glass_stairs_light_blue",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_MAGENTA = new GlassStairs("diamond_glass_stairs_magenta",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_ORANGE = new GlassStairs("diamond_glass_stairs_orange",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_STAIRS_WHITE = new GlassStairs("diamond_glass_stairs_white", DIAMOND_GLASS);

	public static final Block DIAMOND_GLASS_SLAB = new GlassSlab("diamond_glass_slab", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_BLACK = new GlassSlab("diamond_glass_slab_black", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_RED = new GlassSlab("diamond_glass_slab_red", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_GREEN = new GlassSlab("diamond_glass_slab_green", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_BROWN = new GlassSlab("diamond_glass_slab_brown", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_BLUE = new GlassSlab("diamond_glass_slab_blue", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_PURPLE = new GlassSlab("diamond_glass_slab_purple", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_lIGHT_GRAY = new GlassSlab("diamond_glass_slab_light_gray",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_GRAY = new GlassSlab("diamond_glass_slab_gray", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_PINK = new GlassSlab("diamond_glass_slab_pink", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_LIME = new GlassSlab("diamond_glass_slab_lime", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_YELLOW = new GlassSlab("diamond_glass_slab_yellow", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_LIGHT_BLUE = new GlassSlab("diamond_glass_slab_light_blue",
			DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_MAGENTA = new GlassSlab("diamond_glass_slab_magenta", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_ORANGE = new GlassSlab("diamond_glass_slab_orange", DIAMOND_GLASS);
	public static final Block DIAMOND_GLASS_SLAB_WHITE = new GlassSlab("diamond_glass_slab_white", DIAMOND_GLASS);

	public static final Block DIAMOND_SANDSTONE = new BlockStandard("diamond_sandstone");
	public static final Block DIAMOND_SMOOTH_SANDSTONE = new BlockStandard("diamond_smooth_sandstone");
	public static final Block DIAMOND_CHISELED_SANDSTONE = new BlockStandard("diamond_chiseled_sandstone");

	public static final Block DIAMOND_SANDSTONE_STAIRS = new ModStairs("diamond_sandstone_stairs", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_STAIRS = new ModStairs("diamond_smooth_sandstone_stairs",
			DIAMOND_SANDSTONE);
	public static final Block DIAMOND_CHISELED_SANDSTONE_STAIRS = new ModStairs("diamond_chiseled_sandstone_stairs",
			DIAMOND_SANDSTONE);

	public static final Block DIAMOND_SANDSTONE_SLAB = new ModSlab("diamond_sandstone_slab", DIAMOND_SANDSTONE);
	public static final Block DIAMOND_SMOOTH_SANDSTONE_SLAB = new ModSlab("diamond_smooth_sandstone_slab",
			DIAMOND_SANDSTONE);
	public static final Block DIAMOND_CHISELED_SANDSTONE_SLAB = new ModSlab("diamond_chiseled_sandstone_slab",
			DIAMOND_SANDSTONE);

}