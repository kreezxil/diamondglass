package com.kreezcraft.diamondglass.setup;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.blocks.fullBlock;
import com.kreezcraft.diamondglass.blocks.paneBlock;
import com.kreezcraft.diamondglass.blocks.slabBlock;
import com.kreezcraft.diamondglass.blocks.stairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@ObjectHolder(DiamondGlass.MODID)
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static fullBlock DIAMOND_CHISELED_SANDSTONE = new fullBlock("diamond_chiseled_sandstone", Material.ROCK, null);
    public static slabBlock DIAMOND_CHISELED_SANDSTONE_SLAB = new slabBlock("diamond_chiseled_sandstone_slab", Material.ROCK, null);
    public static stairsBlock DIAMOND_CHISELED_SANDSTONE_STAIRS = new stairsBlock("diamond_chiseled_sandstone_stairs", Material.ROCK, null);

    public static fullBlock DIAMOND_GLASS = new fullBlock("diamond_glass", Material.GLASS, MaterialColor.CYAN);
    public static fullBlock DIAMOND_GLASS_BLACK = new fullBlock("diamond_glass_black", Material.GLASS, MaterialColor.BLACK);
    public static fullBlock DIAMOND_GLASS_BLUE = new fullBlock("diamond_glass_blue", Material.GLASS, MaterialColor.BLUE);
    public static fullBlock DIAMOND_GLASS_BROWN = new fullBlock("diamond_glass_brown", Material.GLASS, MaterialColor.BROWN);
    public static fullBlock DIAMOND_GLASS_GRAY = new fullBlock("diamond_glass_gray", Material.GLASS, MaterialColor.GRAY);
    public static fullBlock DIAMOND_GLASS_GREEN = new fullBlock("diamond_glass_green", Material.GLASS, MaterialColor.GREEN);
    public static fullBlock DIAMOND_GLASS_LIGHT_BLUE = new fullBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE);
    public static fullBlock DIAMOND_GLASS_LIGHT_GRAY = new fullBlock("diamond_glass_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY);
    public static fullBlock DIAMOND_GLASS_LIME = new fullBlock("diamond_glass_lime", Material.GLASS, MaterialColor.LIME );
    public static fullBlock DIAMOND_GLASS_MAGENTA = new fullBlock("diamond_glass_magenta", Material.GLASS, MaterialColor.MAGENTA);
    public static fullBlock DIAMOND_GLASS_ORANGE = new fullBlock("diamond_glass_orange", Material.GLASS, MaterialColor.GOLD);

    public static paneBlock DIAMOND_GLASS_PANE = new paneBlock("diamond_glass_pane", Material.GLASS, MaterialColor.CYAN);
    public static paneBlock DIAMOND_GLASS_PANE_BLACK = new paneBlock("diamond_glass_pane_black", Material.GLASS, MaterialColor.BLACK);
    public static paneBlock DIAMOND_GLASS_PANE_BLUE = new paneBlock("diamond_glass_pane_blue", Material.GLASS, MaterialColor.BLUE);
    public static paneBlock DIAMOND_GLASS_PANE_BROWN = new paneBlock("diamond_glass_pane_brown", Material.GLASS, MaterialColor.BROWN);
    public static paneBlock DIAMOND_GLASS_PANE_GRAY = new paneBlock("diamond_glass_pane_gray", Material.GLASS, MaterialColor.GRAY);
    public static paneBlock DIAMOND_GLASS_PANE_GREEN = new paneBlock("diamond_glass_pane_green", Material.GLASS, MaterialColor.GREEN);

    public static paneBlock DIAMOND_GLASS_PANE_LIGHT_BLUE = new paneBlock("diamond_glass_pane_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE);
    public static paneBlock DIAMOND_GLASS_PANE_LIGHT_GRAY = new paneBlock("diamond_glass_pane_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY);
    public static paneBlock DIAMOND_GLASS_PANE_LIME = new paneBlock("diamond_glass_pane_lime", Material.GLASS, MaterialColor.LIME);
    public static paneBlock DIAMOND_GLASS_PANE_MAGENTA = new paneBlock("diamond_glass_pane_magenta", Material.GLASS, MaterialColor.MAGENTA);
    public static paneBlock DIAMOND_GLASS_PANE_ORANGE = new paneBlock("diamond_glass_pane_orange", Material.GLASS, MaterialColor.GOLD);
    public static paneBlock DIAMOND_GLASS_PANE_PINK = new paneBlock("diamond_glass_pane_pink", Material.GLASS, MaterialColor.PINK);
    public static paneBlock DIAMOND_GLASS_PANE_PURPLE = new paneBlock("diamond_glass_pane_purple", Material.GLASS, MaterialColor.PURPLE);
    public static paneBlock DIAMOND_GLASS_PANE_RED = new paneBlock("diamond_glass_pane_red", Material.GLASS, MaterialColor.RED);
    public static paneBlock DIAMOND_GLASS_PANE_WHITE = new paneBlock("diamond_glass_pane_white", Material.GLASS, MaterialColor.QUARTZ);
    public static paneBlock DIAMOND_GLASS_PANE_YELLOW = new paneBlock("diamond_glass_pane_yellow", Material.GLASS, MaterialColor.YELLOW);
    public static fullBlock DIAMOND_GLASS_PINK = new fullBlock("diamond_glass_pink", Material.GLASS, MaterialColor.PINK);
    public static fullBlock DIAMOND_GLASS_PURPLE = new fullBlock("diamond_glass_purple", Material.GLASS, MaterialColor.PURPLE);
    public static fullBlock DIAMOND_GLASS_RED = new fullBlock("diamond_glass_red", Material.GLASS, MaterialColor.RED);
    public static slabBlock DIAMOND_GLASS_SLAB = new slabBlock("diamond_glass_slab", Material.GLASS, MaterialColor.CYAN);
    public static slabBlock DIAMOND_GLASS_SLAB_BLACK = new slabBlock("diamond_glass_slab_black", Material.GLASS, MaterialColor.BLACK);
    public static slabBlock DIAMOND_GLASS_SLAB_BLUE = new slabBlock("diamond_glass_slab_blue", Material.GLASS, MaterialColor.BLUE);
    public static slabBlock DIAMOND_GLASS_SLAB_BROWN = new slabBlock("diamond_glass_slab_brown", Material.GLASS, MaterialColor.BROWN);
    public static slabBlock DIAMOND_GLASS_SLAB_GRAY = new slabBlock("diamond_glass_slab_gray", Material.GLASS, MaterialColor.GRAY);
    public static slabBlock DIAMOND_GLASS_SLAB_GREEN = new slabBlock("diamond_glass_slab_green", Material.GLASS, MaterialColor.GREEN);
    public static slabBlock DIAMOND_GLASS_SLAB_LIGHT_BLUE = new slabBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE);
    public static slabBlock DIAMOND_GLASS_SLAB_LIGHT_GRAY = new slabBlock("diamond_glass_slab_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY);
    public static slabBlock DIAMOND_GLASS_SLAB_LIME = new slabBlock("diamond_glass_slab_lime", Material.GLASS, MaterialColor.LIME);
    public static slabBlock DIAMOND_GLASS_SLAB_MAGENTA = new slabBlock("diamond_glass_slab_magenta", Material.GLASS, MaterialColor.MAGENTA);
    public static slabBlock DIAMOND_GLASS_SLAB_ORANGE = new slabBlock("diamond_glass_slab_orange", Material.GLASS, MaterialColor.GOLD);
    public static slabBlock DIAMOND_GLASS_SLAB_PINK = new slabBlock("diamond_glass_slab_pink", Material.GLASS, MaterialColor.PINK);
    public static slabBlock DIAMOND_GLASS_SLAB_PURPLE = new slabBlock("diamond_glass_slab_purple", Material.GLASS, MaterialColor.PURPLE);
    public static slabBlock DIAMOND_GLASS_SLAB_RED = new slabBlock("diamond_glass_slab_red", Material.GLASS, MaterialColor.RED);
    public static slabBlock DIAMOND_GLASS_SLAB_WHITE = new slabBlock("diamond_glass_slab_white", Material.GLASS, MaterialColor.QUARTZ);
    public static slabBlock DIAMOND_GLASS_SLAB_YELLOW = new slabBlock("diamond_glass_slab_yellow", Material.GLASS, MaterialColor.YELLOW);
    public static stairsBlock DIAMOND_GLASS_STAIRS = new stairsBlock("diamond_glass_stairs", Material.GLASS, MaterialColor.CYAN);
    public static stairsBlock DIAMOND_GLASS_STAIRS_BLACK = new stairsBlock("diamond_glass_stairs_black", Material.GLASS, MaterialColor.BLACK);
    public static stairsBlock DIAMOND_GLASS_STAIRS_BLUE = new stairsBlock("diamond_glass_stairs_blue", Material.GLASS, MaterialColor.BLUE);
    public static stairsBlock DIAMOND_GLASS_STAIRS_BROWN = new stairsBlock("diamond_glass_stairs_brown", Material.GLASS, MaterialColor.BROWN);
    public static stairsBlock DIAMOND_GLASS_STAIRS_GRAY = new stairsBlock("diamond_glass_stairs_gray", Material.GLASS, MaterialColor.GRAY);
    public static stairsBlock DIAMOND_GLASS_STAIRS_GREEN = new stairsBlock("diamond_glass_stairs_green", Material.GLASS, MaterialColor.GREEN);
    public static stairsBlock DIAMOND_GLASS_STAIRS_LIGHT_BLUE = new stairsBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE);
    public static stairsBlock DIAMOND_GLASS_STAIRS_LIGHT_GRAY = new stairsBlock("diamond_glass_stairs_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY);
    public static stairsBlock DIAMOND_GLASS_STAIRS_LIME = new stairsBlock("diamond_glass_stairs_lime", Material.GLASS, MaterialColor.LIME);
    public static stairsBlock DIAMOND_GLASS_STAIRS_MAGENTA = new stairsBlock("diamond_glass_stairs_magenta", Material.GLASS, MaterialColor.MAGENTA);
    public static stairsBlock DIAMOND_GLASS_STAIRS_ORANGE = new stairsBlock("diamond_glass_stairs_orange", Material.GLASS, MaterialColor.GOLD);
    public static stairsBlock DIAMOND_GLASS_STAIRS_PINK = new stairsBlock("diamond_glass_stairs_pink", Material.GLASS, MaterialColor.PINK);
    public static stairsBlock DIAMOND_GLASS_STAIRS_PURPLE = new stairsBlock("diamond_glass_stairs_purple", Material.GLASS, MaterialColor.PURPLE);
    public static stairsBlock DIAMOND_GLASS_STAIRS_RED = new stairsBlock("diamond_glass_stairs_red", Material.GLASS, MaterialColor.RED);
    public static stairsBlock DIAMOND_GLASS_STAIRS_WHITE = new stairsBlock("diamond_glass_stairs_white", Material.GLASS, MaterialColor.QUARTZ);
    public static stairsBlock DIAMOND_GLASS_STAIRS_YELLOW = new stairsBlock("diamond_glass_stairs_yellow", Material.GLASS, MaterialColor.YELLOW);
    public static fullBlock DIAMOND_GLASS_WHITE = new fullBlock("diamond_glass_white",Material.GLASS,MaterialColor.WOOL);
    public static fullBlock DIAMOND_GLASS_YELLOW = new fullBlock("diamond_glass",Material.GLASS,MaterialColor.YELLOW);
    public static fullBlock DIAMOND_SAND = new fullBlock("diamond_sand",Material.SAND,MaterialColor.SAND);
    public static fullBlock DIAMOND_SANDSTONE = new fullBlock("diamond_sandstone",Material.ROCK,MaterialColor.SAND);
    public static slabBlock DIAMOND_SANDSTONE_SLAB = new slabBlock("diamond_sandstone_slab",Material.GLASS,MaterialColor.SAND);
    public static stairsBlock DIAMOND_SANDSTONE_STAIRS = new stairsBlock("diamond_sandstone_stairs",Material.GLASS,MaterialColor.SAND);
    public static fullBlock DIAMOND_SMOOTH_SANDSTONE = new fullBlock("diamond_smooth_sandstone",Material.ROCK,MaterialColor.SAND);
    public static slabBlock DIAMOND_SMOOTH_SANDSTONE_SLAB = new slabBlock("diamond_smooth_sandstone_slab",Material.GLASS,MaterialColor.SAND);
    public static stairsBlock DIAMOND_SMOOTH_SANDSTONE_STAIRS = new stairsBlock("diamond_smooth_sandstone_stairs",Material.GLASS,MaterialColor.SAND);

    public static fullBlock RAINBOW_GLASS_BLOCK = new fullBlock("rainbow_glass_block",Material.GLASS,MaterialColor.YELLOW);
    public static paneBlock RAINBOW_GLASS_PANE = new paneBlock("rainbow_glass_pane",Material.GLASS,MaterialColor.YELLOW);
    public static slabBlock RAINBOW_GLASS_SLAB = new slabBlock("rainbow_glass_slab",Material.GLASS,MaterialColor.YELLOW);
    public static stairsBlock RAINBOW_GLASS_STAIRS = new stairsBlock("rainbow_glass_stairs",Material.GLASS,MaterialColor.YELLOW);
}
