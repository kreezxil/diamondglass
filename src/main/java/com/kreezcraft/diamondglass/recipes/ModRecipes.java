package com.kreezcraft.diamondglass.recipes;

import com.kreezcraft.diamondglass.blocks.InitBlocks;
import com.kreezcraft.diamondglass.items.InitItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(InitBlocks.DIAMOND_SAND, new ItemStack(InitBlocks.DIAMOND_GLASS), 10f);
	}

}
