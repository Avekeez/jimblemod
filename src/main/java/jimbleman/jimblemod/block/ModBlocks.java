package jimbleman.jimblemod.block;

import jimbleman.jimblemod.block.crop.BlockCropLithuanii;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreLithuanium = new BlockOre("ore_lithuanium").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockCropLithuanii cropLithuanii = new BlockCropLithuanii();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreLithuanium,
                cropLithuanii
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreLithuanium.createItemBlock()//.setRegistryName(oreLithuanium.getRegistryName())
        );
    }

    public static void registerModels() {
        oreLithuanium.registerItemModel(Item.getItemFromBlock(oreLithuanium));
    }
}
