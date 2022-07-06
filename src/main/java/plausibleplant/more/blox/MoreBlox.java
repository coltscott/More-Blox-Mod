package plausibleplant.more.blox;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import plausibleplant.more.blox.block.ModBlocks;
import plausibleplant.more.blox.item.ModItems;

public class MoreBlox implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Moreblox");

	/*private static ConfiguredFeature<?, ?> DARK_CLAY_OVERWORLD = 
		new ConfiguredFeature(Feature.ORE,
		new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		DARK_CLAY.getDefaultState(),
		12));
	*/

	public static final List<OreFeatureConfig.Target> DARK_CLAY_OVERWORLD = List.of(
		OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		ModBlocks.DARK_CLAY.getDefaultState()));

	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DARK_CLAY_SPAWN =
		ConfiguredFeatures.register("dark_clay", Feature.ORE, new OreFeatureConfig(DARK_CLAY_OVERWORLD, 12));
	

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

	}
}
