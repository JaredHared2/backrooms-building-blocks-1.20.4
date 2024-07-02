package com.gera.backrooms.item;

import com.gera.backrooms.BackroomsBuildingBlocks;

import com.gera.backrooms.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BackroomsBuildingBlocks.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.backrooms"))
                    .icon(() -> new ItemStack(ModBlocks.POOL_WHITE)).entries((displayContext, entries) -> {
                        //BUILDING BLOCKS
                        entries.add(ModBlocks.POOL_BLACK);
                        entries.add(ModBlocks.POOL_BLACK_SLAB);
                        entries.add(ModBlocks.POOL_BLACK_STAIRS);
                        entries.add(ModBlocks.POOL_WHITE);
                        entries.add(ModBlocks.POOL_WHITE_SLAB);
                        entries.add(ModBlocks.POOL_WHITE_STAIRS);
                        entries.add(ModBlocks.ARROW_WALLPAPER);
                        entries.add(ModBlocks.ARROW_WALLPAPER_BOTTOM);
                        entries.add(ModBlocks.ARROW_WALLPAPER_SLAB);
                        entries.add(ModBlocks.DOT_WALLPAPER);
                        entries.add(ModBlocks.DOT_WALLPAPER_BOTTOM);
                        entries.add(ModBlocks.DOT_WALLPAPER_SLAB);
                        entries.add(ModBlocks.BACKROOMS_CARPET);
                        entries.add(ModBlocks.BACKROOMS_CARPET_SLAB);
                        entries.add(ModBlocks.BACKROOMS_CARPET_STAIRS);
                        entries.add(ModBlocks.WHITE_BRICK);
                        entries.add(ModBlocks.WHITE_BRICK_SLAB);
                        entries.add(ModBlocks.WHITE_BRICK_STAIRS);

                        //ITEMS
                        entries.add(ModItems.ALMOND_WATER);


                        //FUNCTIONAL BLOCKS
                        entries.add(ModBlocks.WHITE_VOID);


                    }).build());




    public static void registerItemGroups() {
        BackroomsBuildingBlocks.LOGGER.info("Registering Item Groups for " + BackroomsBuildingBlocks.MOD_ID);
    }
}
