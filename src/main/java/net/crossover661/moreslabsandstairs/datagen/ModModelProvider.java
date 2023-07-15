package net.crossover661.moreslabsandstairs.datagen;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.*;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {super(output);}
    private void genSlabStairModels(BlockStateModelGenerator blockStateModelGenerator, Block block, Block slab, Block stairs)
    {
        BlockStateModelGenerator.BlockTexturePool pool = blockStateModelGenerator.registerCubeAllModelTexturePool(block);
        pool.stairs(stairs);
        pool.slab(slab);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        genSlabStairModels(blockStateModelGenerator, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, ModBlocks.IRON_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, ModBlocks.GOLD_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB, ModBlocks.COAL_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB, ModBlocks.NETHERITE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_SLAB, ModBlocks.OBSIDIAN_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BEDROCK, ModBlocks.BEDROCK_SLAB, ModBlocks.BEDROCK_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.END_STONE, ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.CALCITE, ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        genSlabStairModels(blockStateModelGenerator, Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}
