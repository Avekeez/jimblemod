package jimbleman.jimblemod.block.crop;

import jimbleman.jimblemod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropLithuanii extends BlockCrops {

    protected String name = "crop_lithuanii";

    public BlockCropLithuanii() {
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed() {
        return ModItems.lithuaniiSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.rawLithuanii;
    }
}
