package jimbleman.jimblemod.item.Armor;

import jimbleman.jimblemod.JimbleMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.client.FMLClientHandler;

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

        if (FMLClientHandler.instance().getClient().gameSettings.keyBindJump.isKeyDown()) {
            player.motionY = Math.min(player.motionY + 0.4d, 1);
        }

        float forward, strafe;
        forward = strafe = 0;

        Vec3d vec = player.getLookVec().scale(5);

        double x = vec.x;
        double y = vec.y;
        double z = vec.z;


        if (FMLClientHandler.instance().getClient().gameSettings.keyBindForward.isKeyDown() && (!player.onGround || player.getLookVec().y > 0)) {
            player.motionX = x;
            player.motionY = y;
            player.motionZ = z;
            player.setNoGravity(true);
        } else {
            player.setNoGravity(false);
        }
        if (FMLClientHandler.instance().getClient().gameSettings.keyBindBack.isKeyDown()) {
            forward = -5;
        }
        if (FMLClientHandler.instance().getClient().gameSettings.keyBindLeft.isKeyDown()) {
            strafe = 5;
        }
        if (FMLClientHandler.instance().getClient().gameSettings.keyBindRight.isKeyDown()) {
            strafe = -5;
        }

        player.moveRelative(strafe, 0, forward, 0.1f);
    }
}
