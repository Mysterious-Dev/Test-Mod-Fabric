package fr.lmf.testmodfabric;

import fr.lmf.testmodfabric.init.ModBlocks;
import fr.lmf.testmodfabric.init.ModItems;
import fr.lmf.testmodfabric.utils.TestGameRules;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

	public static final String MODID = "testmod_fabric";

	@Override
	public void onInitialize() {
		ModItems.INSTANCE.registerItems();
		ModBlocks.INSTANCE.registerBlocks();

		TestGameRules.init();

	}



}


