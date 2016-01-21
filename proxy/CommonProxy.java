package com.industrymod.proxy;

import com.industrymod.items.IndustryItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Adam on 19/01/2016.
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        IndustryItems.createItems();
    }

    public void init(FMLInitializationEvent e)
    {

    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
