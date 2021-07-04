package creoii.hallows.core;

import creoii.hallows.core.registry.BiomeRegistry;
import creoii.hallows.core.registry.BlockRegistry;
import creoii.hallows.core.registry.DimensionRegistry;
import creoii.hallows.core.registry.SurfaceRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class Hallows implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "hallows";

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		SurfaceRegistry.register();
		BiomeRegistry.register();
		DimensionRegistry.register();
	}

	@Override
	public void onInitializeClient() {
		BlockRegistry.registerClient();
	}
}
