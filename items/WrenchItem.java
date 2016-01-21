package com.industrymod.items;

import com.SKEnergy.api.wrench.IWrenchable;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * Created by Adam on 19/01/2016.
 */
public class WrenchItem extends Item
{
    public WrenchItem(String unlocalisedName)
    {
        super();

        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        Block block = world.getBlockState(pos).getBlock();
        boolean ret = false;
        if (block != null) {
            PlayerInteractEvent e = new PlayerInteractEvent(player, PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, pos, side, world);
            if (MinecraftForge.EVENT_BUS.post(e) || e.getResult() == Event.Result.DENY || e.useBlock == Event.Result.DENY || e.useItem == Event.Result.DENY) {
                return false;
            }
            if (player.isSneaking() && block instanceof IWrenchable && ((IWrenchable) block).canDismantle(player, world, pos)) {
                if (!world.isRemote) {
                    ((IWrenchable) block).dismantleBlock(player, world, pos, false);
                }
                ret = true;
            } else if (!player.isSneaking() && block.rotateBlock(world, pos, side))
            {
                if(!world.isRemote)
                {
                    ((IWrenchable) block).dismantleBlock(player, world, pos, false);
                }
                ret = true;
                }
            }
        if(ret) {
            player.swingItem();
        }
        return ret && !world.isRemote;
    }
}
