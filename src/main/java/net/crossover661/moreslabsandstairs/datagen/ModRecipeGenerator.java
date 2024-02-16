package net.crossover661.moreslabsandstairs.datagen;

import net.crossover661.moreslabsandstairs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    private void genRebuildingRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block, ItemConvertible slab){
        ShapedRecipeJsonBuilder.create(category, block, 2).pattern("xx").pattern("xx")
                .input('x', slab)
                .criterion(FabricRecipeProvider.hasItem(block), FabricRecipeProvider.conditionsFromItem(block))
                .offerTo(exporter);
    }
    private void genRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block, ItemConvertible slab, ItemConvertible stairs) {
        // generates crafting recipes only
        offerSlabRecipe(exporter, category, slab, block);
        createStairsRecipe(stairs, Ingredient.ofItems(block))
                .criterion(hasItem(block), conditionsFromItem(block))
                .offerTo(exporter, new Identifier(getRecipeName(stairs)));
        genRebuildingRecipe(exporter, category, block, slab);
    }
    private void genRecipesStonecutter(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block,
                                      ItemConvertible slab, ItemConvertible stairs) {
        // generates crafting and stonecutter recipes
        offerSlabRecipe(exporter, category, slab, block);
        createStairsRecipe(stairs, Ingredient.ofItems(block))
                .criterion(hasItem(block), conditionsFromItem(block))
                .offerTo(exporter, new Identifier(getRecipeName(stairs)));
        offerStonecuttingRecipe(exporter, category, slab, block, 2);
        offerStonecuttingRecipe(exporter, category, stairs, block);
        genRebuildingRecipe(exporter, category, block, slab);
    }
    private void genOnlyStonecutterRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block,
                                       ItemConvertible slab, ItemConvertible stairs) {
        // generates only stonecutter recipes
        offerStonecuttingRecipe(exporter, category, slab, block, 2);
        offerStonecuttingRecipe(exporter, category, stairs, block);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        // generate recipes for all modded blocks
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, ModBlocks.IRON_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, ModBlocks.GOLD_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB, ModBlocks.COAL_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB, ModBlocks.NETHERITE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_SLAB, ModBlocks.OBSIDIAN_STAIRS);
        genRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BEDROCK, ModBlocks.BEDROCK_SLAB, ModBlocks.BEDROCK_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE, ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CALCITE, ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_STAIRS);
        genOnlyStonecutterRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        genRecipesStonecutter(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_STAIRS);

        // generate re-crafting recipes for all vanilla slabs
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, Blocks.OAK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE, Blocks.STONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRANITE, Blocks.GRANITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DIORITE, Blocks.DIORITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, Blocks.ANDESITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BRICKS, Blocks.BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE, Blocks.PRISMARINE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACKSTONE, Blocks.BLACKSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER, Blocks.CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DEEPSLATE_TILES, Blocks.DEEPSLATE_TILE_SLAB);
        genRebuildingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, Blocks.MUD_BRICK_SLAB);
    }
}
