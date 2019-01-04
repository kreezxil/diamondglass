package com.kreezcraft.diamondglass.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.diamondglass.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item DIAMONIUM = new ItemBase("diamonium").setCreativeTab(CreativeTabs.MATERIALS);

}