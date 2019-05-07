package com.Exs.modfood.init;


import com.Exs.modfood.ModFood;
import com.Exs.modfood.blocks.SaladeCropBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ModFood.MOD_ID,bus =Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    @ObjectHolder(ModFood.MOD_ID+":salade_crop")
    public static final SaladeCropBlocks SALADE_CROP_BLOCKS = null;

    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> e ){

    e.getRegistry().register(new SaladeCropBlocks(Block.Properties.create(Material.GRASS) ));
    }
    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> e){

    }

}
