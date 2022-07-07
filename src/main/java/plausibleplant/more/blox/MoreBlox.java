package plausibleplant.more.blox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import plausibleplant.more.blox.block.ModBlocks;
import plausibleplant.more.blox.item.ModItems;
import plausibleplant.more.blox.world.feature.gen.ModWorldGen;

public class MoreBlox implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Moreblox");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();

	}
}
