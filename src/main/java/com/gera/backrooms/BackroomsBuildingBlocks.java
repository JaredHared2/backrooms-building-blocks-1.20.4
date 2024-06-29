package com.gera.backrooms;

import com.gera.backrooms.block.ModBlocks;
import com.gera.backrooms.item.ModItemGroups;
import com.gera.backrooms.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackroomsBuildingBlocks implements ModInitializer {
	public static final String MOD_ID = "backrooms_building_blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//first attempt at making a minecraft mod :3
	}
}