package net.crossover661.moreslabsandstairs.item;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;

public class ModItemGroup {
    public static void registerItemGroups()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content ->
        {
            content.addAfter(Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB);
            content.addAfter(ModBlocks.IRON_SLAB, ModBlocks.IRON_STAIRS);
            content.addAfter(Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB);
            content.addAfter(ModBlocks.GOLD_SLAB, ModBlocks.GOLD_STAIRS);
            content.addAfter(Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB);
            content.addAfter(ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_STAIRS);
            content.addAfter(Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB);
            content.addAfter(ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_STAIRS);
            content.addAfter(Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB);
            content.addAfter(ModBlocks.COAL_SLAB, ModBlocks.COAL_STAIRS);
            content.addAfter(Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB);
            content.addAfter(ModBlocks.NETHERITE_SLAB, ModBlocks.NETHERITE_STAIRS);
            content.addAfter(Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB);
            content.addAfter(ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_STAIRS);
            content.addAfter(Blocks.END_STONE, ModBlocks.END_STONE_SLAB);
            content.addAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_STAIRS);
            content.addAfter(Blocks.CALCITE, ModBlocks.CALCITE_SLAB);
            content.addAfter(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_STAIRS);
            content.addAfter(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB);
            content.addAfter(ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_STAIRS);
            content.addAfter(Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_SLAB);
            content.addAfter(ModBlocks.OBSIDIAN_SLAB, ModBlocks.OBSIDIAN_STAIRS);
            content.addAfter(Blocks.BEDROCK, ModBlocks.BEDROCK_SLAB);
            content.addAfter(ModBlocks.BEDROCK_SLAB, ModBlocks.BEDROCK_STAIRS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content ->
        {
            content.addAfter(Blocks.PINK_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB);
            content.addAfter(ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            content.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_SLAB);
            content.addAfter(ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_SLAB);
            content.addAfter(ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_SLAB);
            content.addAfter(ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_SLAB);
            content.addAfter(ModBlocks.RED_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_SLAB);
            content.addAfter(ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_SLAB);
            content.addAfter(ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_SLAB);
            content.addAfter(ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_SLAB);
            content.addAfter(ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_SLAB);
            content.addAfter(ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            content.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_SLAB);
            content.addAfter(ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_SLAB);
            content.addAfter(ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_SLAB);
            content.addAfter(ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_SLAB);
            content.addAfter(ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.BLACK_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.BLACK_CONCRETE_STAIRS, ModBlocks.BROWN_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.RED_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.LIME_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.CYAN_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.BLUE_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_STAIRS);
            content.addAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS, ModBlocks.PINK_CONCRETE_STAIRS);
            content.addAfter(Blocks.PINK_TERRACOTTA, ModBlocks.TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_SLAB);
            content.addAfter(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            content.addAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_STAIRS);
        });
    }
}
