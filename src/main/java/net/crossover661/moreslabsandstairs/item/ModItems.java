package net.crossover661.moreslabsandstairs.item;

import net.crossover661.moreslabsandstairs.MoreSlabsAndStairs;
import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreSlabsAndStairs.MOD_ID, name), item);
    }
    private static void itemGroupBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.IRON_SLAB);
        entries.add(ModBlocks.IRON_STAIRS);
        entries.add(ModBlocks.GOLD_SLAB);
        entries.add(ModBlocks.GOLD_STAIRS);
        entries.add(ModBlocks.DIAMOND_SLAB);
        entries.add(ModBlocks.DIAMOND_STAIRS);
        entries.add(ModBlocks.EMERALD_SLAB);
        entries.add(ModBlocks.EMERALD_STAIRS);
        entries.add(ModBlocks.COAL_SLAB);
        entries.add(ModBlocks.COAL_STAIRS);
        entries.add(ModBlocks.NETHERITE_SLAB);
        entries.add(ModBlocks.NETHERITE_STAIRS);
        entries.add(ModBlocks.LAPIS_SLAB);
        entries.add(ModBlocks.LAPIS_STAIRS);
        entries.add(ModBlocks.END_STONE_SLAB);
        entries.add(ModBlocks.END_STONE_STAIRS);
        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
        entries.add(Blocks.OBSIDIAN);
        entries.add(ModBlocks.OBSIDIAN_SLAB);
        entries.add(ModBlocks.OBSIDIAN_STAIRS);
        entries.add(Blocks.BEDROCK);
        entries.add(ModBlocks.BEDROCK_SLAB);
        entries.add(ModBlocks.BEDROCK_STAIRS);
        entries.add(Blocks.CALCITE);
        entries.add(ModBlocks.CALCITE_SLAB);
        entries.add(ModBlocks.CALCITE_STAIRS);
    }
    private static void itemGroupColoredBlocks(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
        entries.add(ModBlocks.RED_CONCRETE_SLAB);
        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        entries.add(ModBlocks.PINK_CONCRETE_SLAB);
        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
        entries.add(ModBlocks.TERRACOTTA_SLAB);
        entries.add(ModBlocks.TERRACOTTA_STAIRS);
        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);
        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
    }
    public static void registerModItems() {
        MoreSlabsAndStairs.LOGGER.info("Registering Mod Items for " + MoreSlabsAndStairs.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::itemGroupBuildingBlocks);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::itemGroupColoredBlocks);
    }
}
