package com.minevid.compressingthings.proxy;

import com.minevid.compressingthings.blocks.ModBlocks;
import com.minevid.compressingthings.items.ModItems;
import com.minevid.compressingthings.recipes.ModItemCrafting;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Reynout on 7/03/2017.
 */
public abstract class CommonProxy  {

    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event)
    {
        ModItemCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
