package net.crossover661.moreslabsandstairs.datagen;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) { super(dataOutput);}
    private void addDrops(Block slab, Block stairs)
    {
        addDrop(stairs);
        addDrop(slab,slabDrops(slab));
    }
    @Override
    public void generate()
    {
        addDrops(ModBlocks.IRON_SLAB, ModBlocks.IRON_STAIRS);
        addDrops(ModBlocks.GOLD_SLAB, ModBlocks.GOLD_STAIRS);
        addDrops(ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_STAIRS);
        addDrops(ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_STAIRS);
        addDrops(ModBlocks.COAL_SLAB, ModBlocks.COAL_STAIRS);
        addDrops(ModBlocks.NETHERITE_SLAB, ModBlocks.NETHERITE_STAIRS);
        addDrops(ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_STAIRS);
        addDrops(ModBlocks.OBSIDIAN_SLAB, ModBlocks.OBSIDIAN_STAIRS);
        // no drops for bedrock slab or stairs - they are indestructible
        addDrops(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_STAIRS);
        addDrops(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_STAIRS);
        addDrops(ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrops(ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrops(ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrops(ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrops(ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrops(ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_STAIRS);
        addDrops(ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrops(ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrops(ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_STAIRS);
        addDrops(ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrops(ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrops(ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrops(ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrops(ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrops(ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_STAIRS);
        addDrops(ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS);
        addDrops(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrops(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_STAIRS);
    }
}
