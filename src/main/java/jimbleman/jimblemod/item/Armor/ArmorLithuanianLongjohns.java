package jimbleman.jimblemod.item.Armor;

import jimbleman.jimblemod.JimbleMod;
import jimbleman.jimblemod.Key;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.client.FMLClientHandler;

import static jimbleman.jimblemod.KeyHandler.*;

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
        float forward, strafe, up;
        forward = strafe = up = 0;

        player.setNoGravity(false);

        if (!player.onGround) {

            //player.setNoGravity(!isAnyKeyDown(new Key[] {Key.Forward, Key.Back, Key.Left, Key.Right, Key.Jump, Key.Sneak}));


            Vec3d finalVec = Vec3d.ZERO;

            Vec3d forwardVec = player.getLookVec();
            Vec3d rightVec = forwardVec.crossProduct(new Vec3d(0, 1, 0));
            Vec3d upVec = forwardVec.crossProduct(rightVec);

            if (isKeyDown(Key.Forward)) {
                finalVec = finalVec.add(forwardVec.scale(5));
            }
            if (isKeyDown(Key.Back)) {
                finalVec = finalVec.add(forwardVec.scale(-5));
            }

            if (isKeyDown(Key.Right)) {
                finalVec = finalVec.add(rightVec.scale(5));
            }
            if (isKeyDown(Key.Left)) {
                finalVec = finalVec.add(rightVec.scale(-5));
            }

            if (isKeyDown(Key.Jump)) {
                finalVec = finalVec.add(upVec.scale(-5));
            }
            if (isKeyDown(Key.Sneak)) {
                finalVec = finalVec.add(upVec.scale(5));
            }

            if (isAnyKeyDown(new Key[] {
                    Key.Forward,
                    Key.Back,
                    Key.Left,
                    Key.Right,
                    Key.Jump,
                    Key.Sneak})) {
                player.motionX = Math.min(player.motionX+0.4d, finalVec.x);
                player.motionY = Math.min(player.motionY+0.4d, finalVec.y);
                player.motionZ = Math.min(player.motionZ+0.4d, finalVec.z);
            }
            System.out.println(finalVec.toString());

        }
    }
}
