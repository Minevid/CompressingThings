package com.minevid.compressingthings.blocks;

import com.minevid.compressingthings.blocks.Dirt.BlockCompressedDirt;
import com.minevid.compressingthings.blocks.Dirt.BlockDoubleCompressedDirt;
import com.minevid.compressingthings.blocks.Dirt.BlockTripleCompressedDirt;

/**
 * Created by Reynout on 9/03/2017.
 */
public class ModBlocks
{
    public static BlockCompressedDirt compressedDirt;
    public static BlockDoubleCompressedDirt doubleCompressedDirt;
    public static BlockTripleCompressedDirt tripleCompressedDirt;


    public static void init()
    {
        compressedDirt = new BlockCompressedDirt();
        doubleCompressedDirt = new BlockDoubleCompressedDirt();
        tripleCompressedDirt = new BlockTripleCompressedDirt();
    }

    public static void initModels()
    {
        compressedDirt.initModel();
        doubleCompressedDirt.initModel();
        tripleCompressedDirt.initModel();
    }

}
