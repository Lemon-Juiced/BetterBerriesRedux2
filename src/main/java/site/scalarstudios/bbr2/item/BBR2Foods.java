package site.scalarstudios.bbr2.item;

import net.minecraft.world.food.FoodProperties;

/**
 * Food properties for the foods added by Better Berries Redux 2.
 *
 * @author Lemon_Juiced
 */
public class BBR2Foods {

    public static final FoodProperties BERRY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();

    public static final FoodProperties BERRY_MEDLEY = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.3f)
            .build();

    public static final FoodProperties BERRY_JAM = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.15f)
            .build();

    public static final FoodProperties BERRY_SMOOTHIE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.2f)
            .build();
}
