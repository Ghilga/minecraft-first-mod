package com.ghilga.firstmod.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        event.getPlayer().sendMessage(new StringTextComponent("Item picked up! " + event.getItem().getName().getString()));
    }

    @SubscribeEvent
    public void combatLog(LivingExperienceDropEvent event) {
        event.getAttackingPlayer().sendMessage(new StringTextComponent(
                event.getEntity().getName().getString() + " died" +
                "\nDropped " + event.getDroppedExperience() + " XP"));
    }

}
