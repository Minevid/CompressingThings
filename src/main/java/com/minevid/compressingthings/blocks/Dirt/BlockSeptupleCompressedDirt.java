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
public class BlockSeptupleCompressedDirt extends Block {
    public BlockSeptupleCompressedDirt()
    {
        super(Material.GRASS);
        setRegistryName("septuplecompresseddirt");
        setUnlocalizedName(References.MOD_ID + ".septuplecompresseddirt");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabCT.CT_TAB);
        setHardness(7.0F);
    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
