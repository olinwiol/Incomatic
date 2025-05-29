package net.incomatic.forge;

import net.incomatic.IncomaticBlocks;
import net.incomatic.Incomatic;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Incomatic.MOD_ID)
public class IncomaticForge {
    public IncomaticForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IncomaticBlocks.REGISTRATE.registerEventListeners(eventBus);
        Incomatic.init();
    }
}
