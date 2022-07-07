package plausibleplant.more.blox.world.feature.tree;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    
    public static final RegistryEntry<PlacedFeature> DARK_CLAY_PLACED = PlacedFeatures.register("dark_clay_placed",
        ModConfiguredFeatures.DARK_CLAY_SPAWN, ModOreFeatures.modifiersWithCount(12,
        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.belowTop(80))));


}
