package plausibleplant.more.blox.world.feature.tree;

import java.util.List;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import plausibleplant.more.blox.block.ModBlocks;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> DARK_CLAY_OVERWORLD = List.of(
		OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		ModBlocks.DARK_CLAY.getDefaultState()));

	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DARK_CLAY_SPAWN =
		ConfiguredFeatures.register("dark_clay", Feature.ORE, new OreFeatureConfig(DARK_CLAY_OVERWORLD, 20));
}
