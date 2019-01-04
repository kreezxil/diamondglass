package com.kreezcraft.diamondglass;

import net.minecraft.block.Block;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Config(modid = DiamondGlass.MODID, category = "")
public class DiamondConfig {

	@Config.Comment({ "Diamond Level Settings" })
	@Config.Name("Diamond Type")
	@Config.RequiresMcRestart
	public static DiamondClass diamondLevel = new DiamondClass();

	public static class DiamondClass {
		@Config.Comment({ "Set the hardness of diamond glass"})
		@Config.Name("Glass Hardness")
		public float diamondHardness = 25f;

		@Config.Comment({ "Set the explosion resistance of diamond glass",
				"6000 will protect against a nuke, but 12000 will protect against the wither!" })
		@Config.Name("Glass Resistance")
		public float diamondResitance = 12000f;
		
		@Config.Comment({"Make Diamond Glass Invulnerable to all attacks"})
		@Config.Name("Invulnerable")
		public boolean isInvulnerable = false;

		@Config.Comment({ "Set diamond sand hardness aka digging difficulty" })
		@Config.Name("Sand Hardness")
		public float diamondsandHardness = 3f;
	}

	@Config.Comment({ "Non-Diamond Level Settings" })
	@Config.Name("Other Type")
	@Config.RequiresMcRestart
	public static NondiamondLevel nondiamondLevel = new NondiamondLevel();

	public static class NondiamondLevel {
		@Config.Comment({ "Set the hardness of the non-diamond blocks in the mod" })
		@Config.Name("Standard Hardness")
		public float standardHardness = 3f;

		@Config.Comment({ "Set the explosion resistance of the non-diamond blocks in the mod" })
		@Config.Name("Standard Resistance")
		public float standardResistance = 5f;
	}

	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(DiamondGlass.MODID)) {
			ConfigManager.sync(DiamondGlass.MODID, Config.Type.INSTANCE);
		}
	}

}
