package com.Exs.modfood.init;


import com.Exs.modfood.ModFood;
import com.Exs.modfood.blocks.SaladeCropBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ModFood.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItem {

    @ObjectHolder(ModFood.MOD_ID+":salade_seeds")
    public static final ItemSeeds SALAD_SEED_ITEM = null;

    @ObjectHolder(ModFood.MOD_ID+":salad")
    public static final Item SALAD = null;


    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> e){
    e.getRegistry().register(new ItemSeeds(ModBlocks.SALADE_CROP_BLOCKS,new Item.Properties().group(ItemGroup.FOOD)).setRegistryName("salade_seed"));
    e.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName("salad"));
    }
}
