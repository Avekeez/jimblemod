package jimbleman.jimblemod.item.Armor;

import jimbleman.jimblemod.JimbleMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class ArmorLithuanianLongjohns extends ArmorBase implements ISpecialArmor {

    public ArmorLithuanianLongjohns() {
        super(JimbleMod.longjohnArmorMaterial, EntityEquipmentSlot.LEGS, "lithuanian_longjohns");
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
        return new ArmorProperties(0, 0.5, 100);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return 2;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot){}

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
        return JimbleMod.modId+":textures/armor/longjohns_layer_2.png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.motionY = 0.3d;
    }
}
