package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.items.ModItems;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PaneBase extends BlockPane implements IHasModel {

	protected String name;

	protected PaneBase(Material material, String name) {
		super(material, true);
		this.name = name;
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setRegistryName(name);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
