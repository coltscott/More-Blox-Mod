package plausibleplant.more.blox.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import plausibleplant.more.blox.MoreBlox;
import plausibleplant.more.blox.block.custom.ModSaplingBlock;
import plausibleplant.more.blox.world.feature.tree.ModSaplingGenerator;

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

    public static final Block WISTERIA_LEAVES = registerBlockTransparent("wisteria_leaves", new LeavesBlock(FabricBlockSettings.of(Material.LEAVES)
        .strength(0.2f)
        .sounds(BlockSoundGroup.VINE)
        .luminance(10)
        .nonOpaque()),
        ItemGroup.DECORATIONS);

    public static final Block WISTERIA_TREE_SAPLING = registerBlockTransparent("wisteria_tree_sapling", new ModSaplingBlock(new ModSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);

    public static final Block WISTERIA_LOG = registerBlock("wisteria_log", new PillarBlock(FabricBlockSettings.of(Material.WOOD)
        .strength(2.0f)
        .sounds(BlockSoundGroup.WOOD)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood", new PillarBlock(FabricBlockSettings.of(Material.WOOD)
        .strength(2.0f)
        .sounds(BlockSoundGroup.WOOD)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

        public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log", new PillarBlock(FabricBlockSettings.of(Material.WOOD)
        .strength(2.0f)
        .sounds(BlockSoundGroup.WOOD)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood", new PillarBlock(FabricBlockSettings.of(Material.WOOD)
        .strength(2.0f)
        .sounds(BlockSoundGroup.WOOD)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks", new Block(FabricBlockSettings.of(Material.WOOD)
        .strength(2.0f)
        .sounds(BlockSoundGroup.WOOD)
        .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab)  {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK,
            new Identifier("moreblox",
            name), block);
    }

    private static Block registerBlockTransparent(String name, Block block, ItemGroup tab)  {
        registerBlockItem(name, block, tab);
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
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
