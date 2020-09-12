package com.ghilga.firstmod.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.IndirectEntityDamageSource;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.util.text.TextFormatting;
public class EventHandler {

    //@SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        PlayerEntity playerEntity = event.getPlayer();
        playerEntity.sendMessage(new StringTextComponent("You picked up " + event.getItem().getName().getString()), playerEntity.getUniqueID());
    }

    @SubscribeEvent
    public void combatLog(LivingExperienceDropEvent event) {
        Entity playerEntity = event.getAttackingPlayer();
        try {
            playerEntity.sendMessage(new StringTextComponent(
                    event.getEntity().getName().getString() + " died" +
                            "\nDropped " + TextFormatting.DARK_GREEN + event.getDroppedExperience() + " XP"), playerEntity.getUniqueID());
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    @SubscribeEvent
    public void dropLog(LivingDropsEvent event){
        Entity killer = event.getSource().getTrueSource();
        try{
            for (ItemEntity item : event.getDrops()) {
                killer.sendMessage(new StringTextComponent("Dropped " + item.getItem().getCount() + " "
                                    + TextFormatting.YELLOW + item.getName().getString()), killer.getUniqueID());
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
