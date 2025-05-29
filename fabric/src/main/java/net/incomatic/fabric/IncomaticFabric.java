package net.incomatic.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.incomatic.IncomaticBlocks;
import net.incomatic.Incomatic;
import net.fabricmc.api.ModInitializer;

public class IncomaticFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Incomatic.init();
        Incomatic.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), Incomatic.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        IncomaticBlocks.REGISTRATE.register();
    }
}
