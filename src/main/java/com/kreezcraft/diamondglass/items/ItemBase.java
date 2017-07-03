package com.kreezcraft.diamondglass.items;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setRegistryName(name);
		ModItems.ITEMS.add(this);
	}

	public void registerItemModel() {
		DiamondGlass.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(this, 0, "inventory");
	}

}