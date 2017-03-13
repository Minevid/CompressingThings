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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 13/03/2017.
 */
public class BlockCompressedDirt  extends Block {
    public BlockCompressedDirt()
    {
        super(Material.GRASS);
        setRegistryName("compresseddirt");
        setUnlocalizedName(References.MOD_ID + ".compresseddirt");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabCT.CT_TAB);
        setHardness(2.0F);
    }



    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
