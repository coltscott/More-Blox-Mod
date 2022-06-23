package plausibleplant.more.blox;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBlox implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("moreblox");
    
    public static final Item BRIX = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block BRIX_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(0.75f));

	@Override
	public void onInitialize() {
		//Registers the brix item that will be able to be crafted into its latter Brix block
		Registry.register(Registry.ITEM, new Identifier("moreblox", "brix"), BRIX);
		Registry.register(Registry.BLOCK, new Identifier("moreblox", "brix_block"), BRIX_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("moreblox", "brix_block"), new BlockItem(BRIX_BLOCK, new FabricItemSettings().group(ItemGroup.MATERIALS)));
		
		LOGGER.info("More Blox launched");
	}
}
