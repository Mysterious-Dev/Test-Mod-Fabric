package fr.lmf.testmodfabric;

import fr.lmf.testmodfabric.init.ModBlocks;
import fr.lmf.testmodfabric.init.ModItems;
import fr.lmf.testmodfabric.utils.TestGameRules;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final String MODID = "testmod_fabric";

	@Override
	public void onInitialize() {
		ModItems.INSTANCE.registerItems();
		ModBlocks.INSTANCE.registerBlocks();

		TestGameRules gamerules = new TestGameRules();

	}



}


