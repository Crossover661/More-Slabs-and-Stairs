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
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    private void genRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block, ItemConvertible slab, ItemConvertible stairs)
    {
        offerSlabRecipe(exporter, category, slab, block);
        createStairsRecipe(stairs, Ingredient.ofItems(block))
                .criterion(hasItem(block), conditionsFromItem(block))
                .offerTo(exporter, new Identifier(getRecipeName(stairs)));
    }
    private void genRecipesStonecutter(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block,
                                      ItemConvertible slab, ItemConvertible stairs)
    {
        offerSlabRecipe(exporter, category, slab, block);
        createStairsRecipe(stairs, Ingredient.ofItems(block))
                .criterion(hasItem(block), conditionsFromItem(block))
                .offerTo(exporter, new Identifier(getRecipeName(stairs)));
        offerStonecuttingRecipe(exporter, category, slab, block, 2);
        offerStonecuttingRecipe(exporter, category, stairs, block);
    }
    private void genOnlyStonecutterRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible block,
                                       ItemConvertible slab, ItemConvertible stairs)
    {
        offerStonecuttingRecipe(exporter, category, slab, block, 2);
        offerStonecuttingRecipe(exporter, category, stairs, block);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
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
    }
}
