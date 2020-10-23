package fr.lmf.testmodfabric.init;

import fr.lmf.testmodfabric.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final ModBlocks INSTANCE = new ModBlocks();

    private Block BASIC_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MaterialColor.STONE).strength(2.0f, 2.0f));

    public void registerBlocks()
    {
        registerBlock(BASIC_BLOCK, "basic_block", ItemGroup.BUILDING_BLOCKS);
    }

    private void registerBlock(Block block, String name, ItemGroup group)
    {
        Registry.register(Registry.BLOCK, new Identifier(Main.MODID, name), block);
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, name), new BlockItem(block, new Item.Settings().group(group)));
    }

}
