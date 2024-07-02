package com.gera.backrooms.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ALMOND_WATER = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1)
            .build();
}
