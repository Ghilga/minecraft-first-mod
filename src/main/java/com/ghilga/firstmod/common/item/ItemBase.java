package com.ghilga.firstmod.common.item;

import com.ghilga.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

public class ItemBase extends Item {

    public ItemBase(){
        super(new Item.Properties()
                .group(FirstMod.TAB)
                .rarity(Rarity.EPIC));
    }

}
