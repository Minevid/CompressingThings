package com.minevid.compressingthings.creativeTab;

import com.minevid.compressingthings.blocks.ModBlocks;
import com.minevid.compressingthings.items.ModItems;
import com.minevid.compressingthings.references.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Reynout on 7/03/2017.
 */
public class CreativeTabCT {
    public static final CreativeTabs CT_TAB = new CreativeTabs(References.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.compressedDirt);
        }
        @Override
        public String getTranslatedTabLabel(){
            return "Random Food";
        }

    };

}
