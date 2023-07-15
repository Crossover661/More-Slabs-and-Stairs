package net.crossover661.moreslabsandstairs.util;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerUtilities()
    {
        registerFuels();
    }
    private static void registerFuels()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.COAL_SLAB, 8000); // 1 coal slab can heat 8000/200 = 40 items in a furnace, blast furnace, or smoker.
        registry.add(ModBlocks.COAL_STAIRS, 12000); // 1 coal stair can heat 12000/200 = 60 items in a furnace, blast furnace, or smoker.
    }
}
