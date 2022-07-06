package plausibleplant.more.blox.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import plausibleplant.more.blox.MoreBlox;

public class ModItems {
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("moreblox", name), item);
    }

    public static void registerModItems() {
        MoreBlox.LOGGER.debug("Registering Mod Items for MoreBlox");
    }
    
    
    
    public static final Item BRIX = registerItem("brix",
        new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DARK_CLAY_BALL = registerItem("dark_clay_ball",
        new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
}
