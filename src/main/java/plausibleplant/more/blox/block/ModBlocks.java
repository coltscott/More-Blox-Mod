package plausibleplant.more.blox.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import plausibleplant.more.blox.MoreBlox;

public class ModBlocks {
    public static final Block BRIX_BLOCK = registerBlock("brix_block", new Block(FabricBlockSettings.of(Material.STONE)
        .strength(2.0f, 6.0f)
        .sounds(BlockSoundGroup.NETHER_BRICKS)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

    public static final Block DARK_CLAY = registerBlock("dark_clay", new Block(FabricBlockSettings.of(Material.SOIL)
        .strength(0.6f)
        .sounds(BlockSoundGroup.GRAVEL)),
        ItemGroup.MATERIALS);

    private static Block registerBlock(String name, Block block, ItemGroup tab)  {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK,
            new Identifier("moreblox",
            name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier("moreblox", name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }



    public static void registerModBlocks() {
        MoreBlox.LOGGER.debug("Registering blocks for moreblox");
    }






}
