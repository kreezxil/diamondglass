package com.kreezcraft.diamondglass;

import com.kreezcraft.diamondglass.proxy.CommonProxy;
import com.kreezcraft.diamondglass.recipes.ModRecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DiamondGlass.MODID, name = DiamondGlass.NAME, version = DiamondGlass.VERSION)
public class DiamondGlass {

	public static final String MODID = "diamondglass";
	public static final String NAME = "Diamond Glass";
	public static final String VERSION = "1.1.0";

	@Mod.Instance(MODID)
	public static DiamondGlass instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@SidedProxy(serverSide = "com.kreezcraft.diamondglass.proxy.CommonProxy", clientSide = "com.kreezcraft.diamondglass.proxy.ClientProxy")
	public static CommonProxy proxy;

}