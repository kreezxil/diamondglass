package com.kreezcraft.diamondglass.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item DIAMONIUM = new ItemBase("diamonium").setCreativeTab(CreativeTabs.MATERIALS);

}