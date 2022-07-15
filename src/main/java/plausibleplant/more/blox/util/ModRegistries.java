package plausibleplant.more.blox.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import plausibleplant.more.blox.block.ModBlocks;

public class ModRegistries {
    
    public static void registerModUtil() {
        registerFlammableBlock();
    }


    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.WISTERIA_LEAVES, 30, 60);
        instance.add(ModBlocks.WISTERIA_LOG, 5, 5);
        instance.add(ModBlocks.WISTERIA_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_WISTERIA_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_WISTERIA_WOOD, 5, 5);
        instance.add(ModBlocks.WISTERIA_PLANKS, 5, 5);
    }



}
