package site.scalarstudios.bbr2.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.scalarstudios.bbr2.BetterBerriesRedux2;
import site.scalarstudios.bbr2.block.BBR2Blocks;
import site.scalarstudios.bbr2.item.blockitem.BerryItemNameBlockItem;

public class BBR2Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterBerriesRedux2.MODID);

    // Berry Medley
    public static final DeferredItem<Item> BERRY_MEDLEY = ITEMS.register("berry_medley", () -> new Item(new Item.Properties().food(BBR2Foods.BERRY_MEDLEY)));

    // Overworld Berries
    public static final DeferredItem<Item> BLACKBERRIES = ITEMS.register("blackberries", () -> new BerryItemNameBlockItem(BBR2Blocks.BLACKBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new BerryItemNameBlockItem(BBR2Blocks.BLUEBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> CANDLEBERRIES = ITEMS.register("candleberries", () -> new BerryItemNameBlockItem(BBR2Blocks.CANDLEBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new BerryItemNameBlockItem(BBR2Blocks.CRANBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> MALOBERRIES = ITEMS.register("maloberries", () -> new BerryItemNameBlockItem(BBR2Blocks.MALOBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> MULBERRIES = ITEMS.register("mulberries", () -> new BerryItemNameBlockItem(BBR2Blocks.MULBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> RASPBERRIES = ITEMS.register("raspberries", () -> new BerryItemNameBlockItem(BBR2Blocks.RASPBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));
    public static final DeferredItem<Item> STRAWBERRIES = ITEMS.register("strawberries", () -> new BerryItemNameBlockItem(BBR2Blocks.STRAWBERRY_BUSH.get(), new Item.Properties().food(BBR2Foods.BERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
