package plausibleplant.more.blox.world.feature.tree;

import java.util.List;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;

import plausibleplant.more.blox.block.ModBlocks;

public class ModConfiguredFeatures {
	public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WISTERIA_TREE =
	ConfiguredFeatures.register("wisteria_tree", Feature.TREE, new TreeFeatureConfig.Builder(
		BlockStateProvider.of(ModBlocks.BRIX_BLOCK),
		new DarkOakTrunkPlacer(8, 4, 3),
		BlockStateProvider.of(ModBlocks.WISTERIA_LEAVES),
		new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
		new TwoLayersFeatureSize(1, 0, 2)).build());

		
    public static final List<OreFeatureConfig.Target> DARK_CLAY_OVERWORLD = List.of(
		OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		ModBlocks.DARK_CLAY.getDefaultState()));

	public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DARK_CLAY_SPAWN =
		ConfiguredFeatures.register("dark_clay", Feature.ORE, new OreFeatureConfig(DARK_CLAY_OVERWORLD, 20));
}
