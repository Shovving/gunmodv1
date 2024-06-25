package net.shoving.gunmod;

import net.fabricmc.api.ModInitializer;

import net.shoving.gunmod.block.ModBlocks;
import net.shoving.gunmod.item.ModItemGroups;
import net.shoving.gunmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GunMod implements ModInitializer {
	public static String MOD_ID = "gunmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Calls all Items and Groups on Initial Launch of Game.
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}