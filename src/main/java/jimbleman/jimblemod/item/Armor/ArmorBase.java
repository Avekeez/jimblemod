package jimbleman.jimblemod.item.Armor;

import jimbleman.jimblemod.JimbleMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor {
    protected String name;

    protected EntityEquipmentSlot type;

    public ArmorBase(ArmorMaterial material, EntityEquipmentSlot type, String name) {
        super(material, 0, type);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        this.type = type;
    }

    public void registerItemModel() {
        JimbleMod.proxy.registerItemRenderer(this,0,name);
    }
}
