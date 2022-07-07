package plausibleplant.more.blox.world.feature.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import plausibleplant.more.blox.world.feature.tree.ModPlacedFeatures;

public class ModOreGeneration {
    
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DARK_CLAY_PLACED.getKey().get());
    }
}
