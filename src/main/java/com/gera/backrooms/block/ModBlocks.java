package com.gera.backrooms.block;

import com.gera.backrooms.BackroomsBuildingBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    //FULL BLOCKS

    public static final Block POOL_WHITE = registerBlock("pool_white",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block POOL_BLACK = registerBlock("pool_black",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block WHITE_VOID = registerBlock("white_void",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(value -> 15).emissiveLighting(ModBlocks::always)));

    public static final Block ARROW_WALLPAPER = registerBlock("arrow_wallpaper",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));

    public static final Block DOT_WALLPAPER = registerBlock("dot_wallpaper",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));

    public static final Block BACKROOMS_CARPET = registerBlock("backrooms_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOL)));

    public static final Block WHITE_BRICK = registerBlock("white_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block ARROW_WALLPAPER_BOTTOM = registerBlock("arrow_wallpaper_bottom",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));
    public static final Block DOT_WALLPAPER_BOTTOM = registerBlock("dot_wallpaper_bottom",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));

    //SLABS

    public static final Block ARROW_WALLPAPER_SLAB = registerBlock("arrow_wallpaper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));

    public static final Block DOT_WALLPAPER_SLAB = registerBlock("dot_wallpaper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOD)));

    public static final Block BACKROOMS_CARPET_SLAB = registerBlock("backrooms_carpet_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOL)));

    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block POOL_WHITE_SLAB = registerBlock("pool_white_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block POOL_BLACK_SLAB = registerBlock("pool_black_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    //STAIRS

    public static final Block BACKROOMS_CARPET_STAIRS = registerBlock("backrooms_carpet_stairs",
            new StairsBlock(ModBlocks.BACKROOMS_CARPET.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOL)));

    public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            new StairsBlock(ModBlocks.WHITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block POOL_BLACK_STAIRS = registerBlock("pool_black_stairs",
            new StairsBlock(ModBlocks.POOL_BLACK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block POOL_WHITE_STAIRS = registerBlock("pool_white_stairs",
            new StairsBlock(ModBlocks.POOL_WHITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BEDROCK)));


    //REGISTER STUFF

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BackroomsBuildingBlocks.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BackroomsBuildingBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BackroomsBuildingBlocks.LOGGER.info("Registering ModBlocks for " + BackroomsBuildingBlocks.MOD_ID);
    }

    public static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}