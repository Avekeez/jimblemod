package jimbleman.jimblemod.block.crop;

import jimbleman.jimblemod.JimbleMod;
import jimbleman.jimblemod.registry.*;
import net.minecraft.block.BlockCrops;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.item.Item;
import net.minecraftforge.common.ISpecialArmor;

public class BlockCropLithuanii extends BlockCrops{

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
