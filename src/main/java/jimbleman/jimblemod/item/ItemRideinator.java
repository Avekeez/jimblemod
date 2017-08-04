package jimbleman.jimblemod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class ItemRideinator extends ItemBase {
    public ItemRideinator () {
        super("rideinator");
    }

    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
        Entity finalTarget = target;

        for (int i = 0; i < 20; i++) {
            if (finalTarget.isBeingRidden()) {
                finalTarget = finalTarget.getPassengers().get(0);
            } else {
                break;
            }
        }

        playerIn.startRiding(finalTarget,true);

        return true;
    }

    @Override
    public ItemRideinator setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
