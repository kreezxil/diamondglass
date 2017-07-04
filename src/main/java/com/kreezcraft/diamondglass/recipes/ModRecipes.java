package com.kreezcraft.diamondglass.recipes;

import com.kreezcraft.diamondglass.blocks.ModBlocks;
import com.kreezcraft.diamondglass.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DIAMONIUM), Items.DIAMOND, Items.FLINT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SAND),
				"SSS",
				"SDS",
				"SSS",
				'S', Blocks.SAND,
				'D', Items.DIAMOND
		);
		GameRegistry.addSmelting(ModBlocks.DIAMOND_SAND, new ItemStack(ModBlocks.DIAMOND_GLASS), 10f);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE, 4),
				"SS",
				"SS",
				'S', ModBlocks.DIAMOND_SAND
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE, 4),
				"SS",
				"SS",
				'S', ModBlocks.DIAMOND_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE, 2),
				"S",
				"S",
				'S', ModBlocks.DIAMOND_SMOOTH_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE_SLAB, 16),
				"SSS",
				'S', ModBlocks.DIAMOND_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_SLAB, 16),
				"SSS",
				'S', ModBlocks.DIAMOND_SMOOTH_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE_SLAB, 16),
				"SSS",
				'S', ModBlocks.DIAMOND_CHISELED_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE_STAIRS, 32),
				"  S",
				" SS",
				"SSS",
				'S', ModBlocks.DIAMOND_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_STAIRS, 32),
				"  S",
				" SS",
				"SSS",
				'S', ModBlocks.DIAMOND_SMOOTH_SANDSTONE
		);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE_STAIRS, 32),
				"  S",
				" SS",
				"SSS",
				'S', ModBlocks.DIAMOND_CHISELED_SANDSTONE
		);

		
	}

}
