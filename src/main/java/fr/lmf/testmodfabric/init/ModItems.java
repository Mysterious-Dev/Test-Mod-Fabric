package fr.lmf.testmodfabric.init;

import fr.lmf.testmodfabric.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ModItems INSTANCE = new ModItems();

    private Item BASIC_ITEM = new Item(new Item.Settings().maxCount(32).group(ItemGroup.MISC));

    public void registerItems()
    {
        registerItem(BASIC_ITEM, "basic_item");
    }

    public Item registerItem(Item item, String name)
    {
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, name), item);
        return item;
    }

}
