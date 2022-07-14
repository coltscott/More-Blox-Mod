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
    }



}
