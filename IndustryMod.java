package com.industrymod;

import com.industrymod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Adam on 19/01/2016.
 */
@Mod(modid = IndustryMod.MODID, name = IndustryMod.NAME, version = IndustryMod.VERSION)
public class IndustryMod
{
    public static final String MODID = "industrymod";
    public static final String NAME = "Industry Mod";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static IndustryMod instance;

    @SidedProxy(clientSide = "com.industrymod.proxy.ClientProxy", serverSide = "com.industrymod.proxy.ServerSide")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        this.proxy.preInit(e);
        System.out.println("PreInit of IndustryMod proxy");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        this.proxy.init(e);
        System.out.println("Init of IndustryMod");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        this.proxy.postInit(e);
        System.out.println("PostInit of IndustryMod");
    }
}
