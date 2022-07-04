package plausibleplant.more.blox;

import javax.xml.catalog.CatalogFeatures.Feature;

import net.fabricmc.api.ModInitializer;
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
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MoreBlox implements ModInitializer {
    
    public static final Item BRIX = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	public static final Block BRIX_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
		.strength(2.0f, 6.0f)
		.sounds(BlockSoundGroup.NETHER_BRICKS)
		.requiresTool());

	public static final Block DARK_CLAY = new Block(FabricBlockSettings.of(Material.SOIL)
		.strength(0.6f)
		.sounds(BlockSoundGroup.GRAVEL));

	public static final Item DARK_CLAY_BALL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	/*private static ConfiguredFeature<?, ?> DARK_CLAY_OVERWORLD = 
		new ConfiguredFeature(Feature.ORE,
		new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		DARK_CLAY.getDefaultState(),
		12));
	*/

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("moreblox", "brix"), BRIX);

		Registry.register(Registry.BLOCK, new Identifier("moreblox", "brix_block"), BRIX_BLOCK);

		Registry.register(Registry.ITEM, new Identifier("moreblox", "brix_block"), new BlockItem(BRIX_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("moreblox", "dark_clay"), DARK_CLAY);

		Registry.register(Registry.ITEM, new Identifier("moreblox", "dark_clay"), new BlockItem(DARK_CLAY, new FabricItemSettings().group(ItemGroup.MATERIALS)));
		
		Registry.register(Registry.ITEM, new Identifier("moreblox", "dark_clay_ball"), DARK_CLAY_BALL);

	}
}
