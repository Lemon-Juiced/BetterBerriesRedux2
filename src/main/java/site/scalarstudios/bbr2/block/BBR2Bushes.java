package site.scalarstudios.bbr2.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

/**
 * Common properties for bushes in Better Berries Redux 2.
 *
 * @author Lemon_Juiced
 */
public class BBR2Bushes {
    public static final Supplier<BlockBehaviour.Properties> BERRY_BUSH_PROPERTIES = () ->
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .randomTicks()
                    .noCollission()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.DESTROY);
}
