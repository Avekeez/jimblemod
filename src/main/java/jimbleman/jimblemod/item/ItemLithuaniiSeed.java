package jimbleman.jimblemod.item;

import jimbleman.jimblemod.JimbleMod;
import jimbleman.jimblemod.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.model.ItemLayerModel;

public class ItemLithuaniiSeed extends ItemSeeds{
    public ItemLithuaniiSeed() {
        super(ModBlocks.cropLithuanii, Blocks.FARMLAND);
        setUnlocalizedName("lithuanii_seed");
        setRegistryName("lithuanii_seed");
    }
    public void registerItemModel(Item item) {
        JimbleMod.proxy.registerItemRenderer(item,0,"lithuanii_seed");
    }
}
