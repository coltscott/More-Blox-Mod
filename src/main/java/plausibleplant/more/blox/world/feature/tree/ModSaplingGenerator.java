package plausibleplant.more.blox.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModSaplingGenerator extends SaplingGenerator{

    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random var1, boolean var2) {
        return ModConfiguredFeatures.WISTERIA_TREE;
    }

    
}
