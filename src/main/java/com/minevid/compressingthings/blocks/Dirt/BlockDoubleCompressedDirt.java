package com.minevid.compressingthings.blocks.Dirt;

import com.minevid.compressingthings.creativeTab.CreativeTabCT;
import com.minevid.compressingthings.references.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Reynout on 13/03/2017.
 */
public class BlockDoubleCompressedDirt extends Block {
    public BlockDoubleCompressedDirt() {

        super(Material.GRASS);
        setRegistryName("doublecompresseddirt");
        setUnlocalizedName(References.MOD_ID + ".doublecompresseddirt");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabCT.CT_TAB);
        setHardness(3.0F);
    }
}
