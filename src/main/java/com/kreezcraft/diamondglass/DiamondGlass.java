package com.kreezcraft.diamondglass;

import com.kreezcraft.diamondglass.proxy.CommonProxy;
import com.kreezcraft.diamondglass.recipes.ModRecipes;
import com.kreezcraft.diamondglass.world.gen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DiamondGlass.MODID, name = DiamondGlass.NAME, version = DiamondGlass.VERSION)
public class DiamondGlass {

	public static final String MODID = "diamondglass";
	public static final String NAME = "Diamond Glass";
	public static final String VERSION = "@VERSION@";

	@Mod.Instance(MODID)
	public static DiamondGlass instance;

	public static final DiamondGlassTab creativeTab = new DiamondGlassTab("Diamond Glass");

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new gen(), 0);
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