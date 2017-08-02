package jimbleman.jimblemod.registry;

import jimbleman.jimblemod.item.*;
import jimbleman.jimblemod.item.Armor.ArmorLithuanianLongjohns;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingotLithuanium = new ItemBase("ingot_lithuanium").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase rawLithuanii = new ItemBase("raw_lithuanii").setCreativeTab(CreativeTabs.FOOD);
    public static ItemLithuaniiSeed lithuaniiSeed = new ItemLithuaniiSeed();

    public static ArmorLithuanianLongjohns lithuanianLongjohns = new ArmorLithuanianLongjohns();

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotLithuanium,
                rawLithuanii,
                lithuaniiSeed,
                lithuanianLongjohns
        );
    }

    public static void registerModels() {
        ingotLithuanium.registerItemModel();
        rawLithuanii.registerItemModel();
        lithuanianLongjohns.registerItemModel();
        lithuaniiSeed.registerItemModel(lithuaniiSeed);
    }
}