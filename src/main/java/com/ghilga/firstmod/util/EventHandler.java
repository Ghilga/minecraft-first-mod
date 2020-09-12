package com.ghilga.firstmod.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.util.text.TextFormatting;
public class EventHandler {
    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        PlayerEntity playerEntity = event.getPlayer();
        playerEntity.sendMessage(new StringTextComponent("Item picked up! " + event.getItem().getName().toString())
                                                         ,playerEntity.getUniqueID());
    }

    @SubscribeEvent
    public void combatLog(LivingExperienceDropEvent event) {
        Entity playerEntity = event.getAttackingPlayer();
        playerEntity.sendMessage(new StringTextComponent(
                event.getEntity().getName().getString() + " died" +
                "\nDropped " + TextFormatting.DARK_GREEN + event.getDroppedExperience() + " XP"), playerEntity.getUniqueID());
    }

}
