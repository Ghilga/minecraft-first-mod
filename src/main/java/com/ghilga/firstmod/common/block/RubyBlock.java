package com.ghilga.firstmod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                //.func_235861_h_()
                .sound(SoundType.METAL));
    }
}
