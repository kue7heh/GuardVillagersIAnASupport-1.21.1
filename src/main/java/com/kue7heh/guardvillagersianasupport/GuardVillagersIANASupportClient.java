package com.kue7heh.guardvillagersianasupport;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = GuardVillagersIANASupport.MODID, dist = Dist.CLIENT)

@EventBusSubscriber(modid = GuardVillagersIANASupport.MODID, value = Dist.CLIENT)
public class GuardVillagersIANASupportClient {
    public GuardVillagersIANASupportClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        GuardVillagersIANASupport.LOGGER.info("HELLO FROM CLIENT SETUP");
        GuardVillagersIANASupport.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
