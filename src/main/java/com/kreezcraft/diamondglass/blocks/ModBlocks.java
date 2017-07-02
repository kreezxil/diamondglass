package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BlockGlass blockDiamondGlass;
	public static BlockStandard blockDiamondSand;
	
	public static void init() {
		blockDiamondGlass = register(new BlockGlass("blockdiamondglass").setCreativeTab(CreativeTabs.MATERIALS));
		blockDiamondSand = register(new BlockStandard("blockdiamondsand").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}