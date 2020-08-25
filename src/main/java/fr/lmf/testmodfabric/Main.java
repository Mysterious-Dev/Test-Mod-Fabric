package fr.lmf.testmodfabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final String MODID = "testmod_fabric";

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "basic_item"), new Item(new Item.Settings().maxCount(32).group(ItemGroup.MISC)));
	}
}
