package net.crossover661.moreslabsandstairs;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.crossover661.moreslabsandstairs.item.ModItemGroup;
import net.crossover661.moreslabsandstairs.item.ModItems;
import net.crossover661.moreslabsandstairs.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreSlabsAndStairs implements ModInitializer {
    public static final String MOD_ID = "more-slabs-and-stairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerUtilities();
	}
}