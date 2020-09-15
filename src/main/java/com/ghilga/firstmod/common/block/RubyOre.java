package com.ghilga.firstmod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {

    public RubyOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_());
    }
}
