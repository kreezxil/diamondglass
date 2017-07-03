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
	}

}
