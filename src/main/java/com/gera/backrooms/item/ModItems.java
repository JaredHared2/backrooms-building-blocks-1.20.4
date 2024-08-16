package com.gera.backrooms.item;


import com.gera.backrooms.BackroomsBuildingBlocks;
import com.gera.backrooms.item.custom.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //public static final Item ITEM_NAME_HERE = registerItem("ITEM_ID", new Item(new FabricItemSettings()));

    public static final Item ALMOND_WATER = registerItem("almond_water", new Item(new FabricItemSettings().food(ModFoodComponents.ALMOND_WATER)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BackroomsBuildingBlocks.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BackroomsBuildingBlocks.LOGGER.info("Registering Mod Items for " + BackroomsBuildingBlocks.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

