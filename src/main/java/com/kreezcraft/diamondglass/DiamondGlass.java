package com.kreezcraft.diamondglass;

import com.kreezcraft.diamondglass.blocks.ModBlocks;
import com.kreezcraft.diamondglass.items.ModItems;
import com.kreezcraft.diamondglass.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DiamondGlass.modId, name = DiamondGlass.name, version = DiamondGlass.version)
public class DiamondGlass {

	public static final String modId = "diamondglass";
	public static final String name = "Diamond Glass";
	public static final String version = "1.1.0";

	@Mod.Instance(modId)
	public static DiamondGlass instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		ModBlocks.init();
		ModItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@SidedProxy(serverSide = "com.kreezcraft.diamondglass.proxy.CommonProxy",clientSide="com.kreezcraft.diamondglass.proxy.ClientProxy")
	public static CommonProxy proxy;

}