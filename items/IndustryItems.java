package com.industrymod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Adam on 19/01/2016.
 */
public class IndustryItems
{
    public static Item testItem;

    public static void createItems()
    {
        GameRegistry.registerItem(testItem = new WrenchItem("test_item"), "test_item");
    }
}
