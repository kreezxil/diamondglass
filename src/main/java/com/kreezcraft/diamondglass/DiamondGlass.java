package com.kreezcraft.diamondglass;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("diamondglass")
public class DiamondGlass
{
    public static final Logger LOGGER = LogManager.getLogger();
    
    public static final String ModId = "diamondglass";
    
    public static ItemGroup diamondTab = new DiamondTab();

    public DiamondGlass() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        
    	Blocks.register();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	Blocks.setupRenderLayers();
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class Registry {
    	
    	static List<Block> blocks = new ArrayList<Block>();
    	static List<Item> items = new ArrayList<Item>();
    	
        @SubscribeEvent
        public static void blocks(final RegistryEvent.Register<Block> e) {
        	LOGGER.debug("Registering blocks...");
            e.getRegistry().registerAll(blocks.toArray(new Block[] {}));
        }
        
        @SubscribeEvent
        public static void items(final RegistryEvent.Register<Item> e) {
        	LOGGER.debug("Registering items...");
        	e.getRegistry().registerAll(items.toArray(new Item[] {}));
        	
        	LOGGER.debug("Registering blockitems...");
        	blocks.forEach(block ->  {
        		BlockItem item = new BlockItem(block, new Item.Properties().group(diamondTab));
        		item.setRegistryName(block.getRegistryName());
        		e.getRegistry().register(item);
        	});
        }
        
        public static void register(Item item) {
        	items.add(item);
        }
        public static void register(Block block) {
        	blocks.add(block);
        }
        
        public static void registerItems(List<Item> item) {
        	items.addAll(item);
        }
        public static void registerBlocks(List<Block> block) {
        	blocks.addAll(block);
        }
    }
}
