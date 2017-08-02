package jimbleman.jimblemod;

import jimbleman.jimblemod.proxy.CommonProxy;
import jimbleman.jimblemod.registry.*;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemElytra;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = JimbleMod.modId, name = JimbleMod.name, version = JimbleMod.version)
public class JimbleMod {
    public static final String modId = "jimblemod";
    public static final String name = "Jimblemod";
    public static final String version = "1.0.0";
    @SidedProxy(serverSide = "jimbleman.jimblemod.proxy.CommonProxy", clientSide = "jimbleman.jimblemod.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final ItemArmor.ArmorMaterial longjohnArmorMaterial = EnumHelper.addArmorMaterial("LONGJOHNS",modId+":longjohns", 7, new int[]{0, 5, 0, 0}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }

    @Mod.Instance(modId)
    public static JimbleMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " loading now");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}