package com.quellek.rotatocraft.proxy;

import com.quellek.rotatocraft.ModBlocks;
import com.quellek.rotatocraft.blocks.BlockSpinnerPlate;
import com.quellek.rotatocraft.items.Rotato;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(new BlockSpinnerPlate());
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new ItemBlock(ModBlocks.blockSpinnerPlate).setRegistryName(BlockSpinnerPlate.SPINNER_PLATE));
    	event.getRegistry().register(new Rotato());
    }
}
