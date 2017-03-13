package com.minevid.compressingthings.blocks;

import com.minevid.compressingthings.blocks.Dirt.BlockCompressedDirt;

/**
 * Created by Reynout on 9/03/2017.
 */
public class ModBlocks
{
    public static BlockCompressedDirt compressedDirt;


    public static void init()
    {
        compressedDirt = new BlockCompressedDirt();
    }

    public static void initModels()
    {
        compressedDirt.initModel();
    }

}
