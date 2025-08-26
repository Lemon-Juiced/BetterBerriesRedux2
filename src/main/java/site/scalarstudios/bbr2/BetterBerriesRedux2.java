package site.scalarstudios.bbr2;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import site.scalarstudios.bbr2.block.BBR2Blocks;
import site.scalarstudios.bbr2.creativetab.BBR2CreativeTabs;
import site.scalarstudios.bbr2.item.BBR2Items;

@Mod(BetterBerriesRedux2.MODID)
public class BetterBerriesRedux2 {
    public static final String MODID = "bbr2";

    public BetterBerriesRedux2(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        // Register Items and Blocks
        BBR2Items.register(modEventBus);
        BBR2Blocks.register(modEventBus);

        // Register Creative Tabs
        BBR2CreativeTabs.register(modEventBus);
        modEventBus.addListener(BBR2CreativeTabs::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
