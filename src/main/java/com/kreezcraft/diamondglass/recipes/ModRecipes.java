package com.kreezcraft.diamondglass.recipes;

import com.kreezcraft.diamondglass.blocks.InitBlocks;
import com.kreezcraft.diamondglass.items.InitItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(InitItems.DIAMONIUM), Items.DIAMOND, Items.FLINT);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SAND, 8), "SSS", "SDS", "SSS", 'S', Blocks.SAND, 'D', Items.DIAMOND);
		GameRegistry.addSmelting(InitBlocks.DIAMOND_SAND, new ItemStack(InitBlocks.DIAMOND_GLASS), 10f);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_GLASS_PANE, 16), "SSS", "SSS", 'S', InitBlocks.DIAMOND_GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SANDSTONE, 4), "SS", "SS", 'S', InitBlocks.DIAMOND_SAND);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SMOOTH_SANDSTONE, 4), "SS", "SS", 'S', InitBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_CHISELED_SANDSTONE), "S", "S", 'S', InitBlocks.DIAMOND_SANDSTONE_SLAB);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SANDSTONE_SLAB, 6), "SSS", 'S', InitBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SMOOTH_SANDSTONE_SLAB, 6), "SSS", 'S', InitBlocks.DIAMOND_SMOOTH_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_CHISELED_SANDSTONE_SLAB, 6), "SSS", 'S', InitBlocks.DIAMOND_CHISELED_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', InitBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_SMOOTH_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', InitBlocks.DIAMOND_SMOOTH_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_CHISELED_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', InitBlocks.DIAMOND_CHISELED_SANDSTONE);

		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_GLASS_SLAB, 6), "SSS", 'S', InitBlocks.DIAMOND_GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocks.DIAMOND_GLASS_STAIRS, 6), "  S", " SS", "SSS", 'S', InitBlocks.DIAMOND_GLASS);

	}

}
