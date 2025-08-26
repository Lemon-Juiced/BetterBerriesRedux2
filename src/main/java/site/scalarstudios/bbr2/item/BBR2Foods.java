package site.scalarstudios.bbr2.item;

import net.minecraft.world.food.FoodProperties;

/**
 * Food properties for the foods added by Better Berries Redux 2.
 *
 * @author Lemon_Juiced
 */
public class BBR2Foods {

    public static final FoodProperties BERRY_FOOD = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();
}
