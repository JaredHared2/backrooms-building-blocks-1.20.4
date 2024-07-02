package com.gera.backrooms.datagen;


import com.gera.backrooms.block.ModBlocks;
import com.gera.backrooms.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //FULL BLOCKS

        BlockStateModelGenerator.BlockTexturePool pool_black_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POOL_BLACK);
        BlockStateModelGenerator.BlockTexturePool pool_white_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POOL_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_VOID);
        BlockStateModelGenerator.BlockTexturePool arrow_wallpaper_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ARROW_WALLPAPER);
        BlockStateModelGenerator.BlockTexturePool dot_wallpaper_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DOT_WALLPAPER);
        BlockStateModelGenerator.BlockTexturePool backrooms_carpet_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BACKROOMS_CARPET);
        BlockStateModelGenerator.BlockTexturePool white_brick_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ARROW_WALLPAPER_BOTTOM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DOT_WALLPAPER_BOTTOM);


        //SLABS

        arrow_wallpaper_pool.slab(ModBlocks.ARROW_WALLPAPER_SLAB);
        dot_wallpaper_pool.slab(ModBlocks.DOT_WALLPAPER_SLAB);
        backrooms_carpet_pool.slab(ModBlocks.BACKROOMS_CARPET_SLAB);
        white_brick_pool.slab(ModBlocks.WHITE_BRICK_SLAB);
        pool_black_pool.slab(ModBlocks.POOL_BLACK_SLAB);
        pool_white_pool.slab(ModBlocks.POOL_WHITE_SLAB);

        //STAIRS

        backrooms_carpet_pool.stairs(ModBlocks.BACKROOMS_CARPET_STAIRS);
        white_brick_pool.stairs(ModBlocks.WHITE_BRICK_STAIRS);
        pool_black_pool.stairs(ModBlocks.POOL_BLACK_STAIRS);
        pool_white_pool.stairs(ModBlocks.POOL_WHITE_STAIRS);

        //ITEMS


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.ITEM_NAME_HERE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALMOND_WATER, Models.GENERATED);
    }
}