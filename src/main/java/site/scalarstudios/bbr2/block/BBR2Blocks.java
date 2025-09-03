package site.scalarstudios.bbr2.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.scalarstudios.bbr2.BetterBerriesRedux2;
import site.scalarstudios.bbr2.block.custom.BerryBushBlock;
import site.scalarstudios.bbr2.item.BBR2Items;

import java.util.function.Supplier;

public class BBR2Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterBerriesRedux2.MODID);

    // Bushes
    public static final DeferredBlock<Block> BLACKBERRY_BUSH = registerBlockWithoutBlockItem("blackberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.BLACKBERRIES));
    public static final DeferredBlock<Block> BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.BLUEBERRIES));
    public static final DeferredBlock<Block> CANDLEBERRY_BUSH = registerBlockWithoutBlockItem("candleberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.CANDLEBERRIES));
    public static final DeferredBlock<Block> CRANBERRY_BUSH = registerBlockWithoutBlockItem("cranberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.CRANBERRIES));
    public static final DeferredBlock<Block> CRIMSONBERRY_BUSH = registerBlockWithoutBlockItem("crimsonberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.CRIMSONBERRIES, BBR2Bushes.PLACEABLE_ON_CRIMSON));
    public static final DeferredBlock<Block> MALOBERRY_BUSH = registerBlockWithoutBlockItem("maloberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.MALOBERRIES));
    public static final DeferredBlock<Block> MULBERRY_BUSH = registerBlockWithoutBlockItem("mulberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.MULBERRIES));
    public static final DeferredBlock<Block> RASPBERRY_BUSH = registerBlockWithoutBlockItem("raspberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.RASPBERRIES));
    public static final DeferredBlock<Block> SOULBERRY_BUSH = registerBlockWithoutBlockItem("soulberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.SOULBERRIES, BBR2Bushes.PLACEABLE_ON_SOUL));
    public static final DeferredBlock<Block> STRAWBERRY_BUSH = registerBlockWithoutBlockItem("strawberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.STRAWBERRIES));
    public static final DeferredBlock<Block> WARPEDBERRY_BUSH = registerBlockWithoutBlockItem("warpedberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.WARPEDBERRIES, BBR2Bushes.PLACEABLE_ON_WARPED));
    public static final DeferredBlock<Block> WASTEBERRY_BUSH = registerBlockWithoutBlockItem("wasteberry_bush", () -> new BerryBushBlock(BBR2Bushes.BERRY_BUSH_PROPERTIES.get(), BBR2Items.WASTEBERRIES, BBR2Bushes.PLACEABLE_ON_NETHERRACK));

    private static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<Block> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return BBR2Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
