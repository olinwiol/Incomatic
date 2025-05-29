package net.incomatic.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class IncomaticExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
