package com.minevid.compressingthings;

import com.minevid.compressingthings.proxy.CommonProxy;
import com.minevid.compressingthings.references.References;
import com.minevid.compressingthings.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

/**
 * Created by Reynout on 7/03/2017.
 */
public class CompressingThings {
    @Mod.Instance(References.MOD_ID)
    public static CompressingThings instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        LogHelper.info("Pre Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.info("Post Initialization complete");
    }

}
