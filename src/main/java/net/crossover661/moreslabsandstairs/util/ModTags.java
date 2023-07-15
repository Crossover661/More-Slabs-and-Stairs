package net.crossover661.moreslabsandstairs.util;

import net.crossover661.moreslabsandstairs.MoreSlabsAndStairs;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks
    {
        public static final TagKey<Block> CONCRETE = createBlockTag("concrete");
        public static final TagKey<Block> CONCRETE_SLABS = createBlockTag("concrete_slabs");
        public static final TagKey<Block> CONCRETE_STAIRS = createBlockTag("concrete_stairs");
        public static final TagKey<Block> TERRACOTTA_SLABS = createBlockTag("terracotta_slabs");
        public static final TagKey<Block> TERRACOTTA_STAIRS = createBlockTag("terracotta_stairs");
        private static TagKey<Block> createBlockTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreSlabsAndStairs.MOD_ID, name));
        }
    }
}
