package com.industrymod.client.render.items;

import com.industrymod.IndustryMod;
import com.industrymod.items.IndustryItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Adam on 19/01/2016.
 */
public final class ItemRenderRegister
{
    public static String modid = IndustryMod.MODID;

    public static void registerItemRenderer()
    {
        reg(IndustryItems.testItem);
    }

    public static void reg(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
