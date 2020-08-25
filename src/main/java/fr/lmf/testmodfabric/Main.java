package fr.lmf.testmodfabric;

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
	private Item BASIC_ITEM;
	private Block BASIC_BLOCK;

	@Override
	public void onInitialize() {
		BASIC_ITEM = Registry.register(Registry.ITEM, new Identifier(MODID, "basic_item"), new Item(new Item.Settings().maxCount(32).group(ItemGroup.MISC)));
		BASIC_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MODID, "basic_block"), new Block(AbstractBlock.Settings.of(Material.STONE, MaterialColor.STONE).strength(2.0f, 2.0f)));
		Registry.register(Registry.ITEM, new Identifier(MODID, "basic_block"), new BlockItem(BASIC_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		TestGameRules gamerules = new TestGameRules();

	}



}


