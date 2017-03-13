package com.minevid.compressingthings.blocks.Dirt;

import com.minevid.compressingthings.creativeTab.CreativeTabCT;
import com.minevid.compressingthings.references.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Reynout on 13/03/2017.
 */
public class BlockSextupleCompressedDirt extends Block {
    public BlockSextupleCompressedDirt()
    {
        super(Material.GRASS);
        setRegistryName("sextuplecompresseddirt");
        setUnlocalizedName(References.MOD_ID + ".sextuplecompresseddirt");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabCT.CT_TAB);
        setHardness(6.0F);
    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
