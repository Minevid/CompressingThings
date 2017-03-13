package com.minevid.compressingthings.proxy;

import com.minevid.compressingthings.blocks.ModBlocks;
import com.minevid.compressingthings.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ClientProxy extends com.minevid.compressingthings.proxy.CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        ModItems.initModels();
        ModBlocks.initModels();

    }
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
