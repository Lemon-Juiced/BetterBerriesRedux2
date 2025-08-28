package site.scalarstudios.bbr2.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.scalarstudios.bbr2.BetterBerriesRedux2;
import site.scalarstudios.bbr2.item.BBR2Items;

public class BBR2CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerriesRedux2.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BBR2_ITEMS_TAB = CREATIVE_MODE_TABS.register("bbr2_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.bbr2.items"))
            .icon(() -> new ItemStack(BBR2Items.BERRY_MEDLEY.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BBR2_ITEMS_TAB.get()) {
            event.accept(BBR2Items.BERRY_MEDLEY.get());
            event.accept(BBR2Items.BLACKBERRIES.get());
            event.accept(BBR2Items.BLUEBERRIES.get());
            event.accept(BBR2Items.CANDLEBERRIES.get());
            event.accept(BBR2Items.CRANBERRIES.get());
            event.accept(BBR2Items.MALOBERRIES.get());
            event.accept(BBR2Items.MULBERRIES.get());
            event.accept(BBR2Items.RASPBERRIES.get());
            event.accept(BBR2Items.STRAWBERRIES.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
