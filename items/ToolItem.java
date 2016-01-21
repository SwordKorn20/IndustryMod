package com.industrymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

/**
 * Created by Adam on 19/01/2016.
 */
public class ToolItem extends Item
{
    public ToolItem(String unlocalisedName)
    {
        super();

        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
