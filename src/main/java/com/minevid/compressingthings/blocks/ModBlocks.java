package com.minevid.compressingthings.blocks;

import com.minevid.compressingthings.blocks.Dirt.*;

/**
 * Created by Reynout on 9/03/2017.
 */
public class ModBlocks {
    public static BlockCompressedDirt compressedDirt;
    public static BlockDoubleCompressedDirt doubleCompressedDirt;
    public static BlockTripleCompressedDirt tripleCompressedDirt;
    public static BlockQuadrupleCompressedDirt quadrupleCompressedDirt;
    public static BlockQuintupleCompressedDirt quintupleCompressedDirt;
    public static BlockSextupleCompressedDirt sextupleCompressedDirt;
    public static BlockSeptupleCompressedDirt septupleCompressedDirt;
    public static BlockOctupleCompressedDirt octupleCompressedDirt;


    public static void init() {
        compressedDirt = new BlockCompressedDirt();
        doubleCompressedDirt = new BlockDoubleCompressedDirt();
        tripleCompressedDirt = new BlockTripleCompressedDirt();
        quadrupleCompressedDirt = new BlockQuadrupleCompressedDirt();
        quintupleCompressedDirt = new BlockQuintupleCompressedDirt();
        sextupleCompressedDirt = new BlockSextupleCompressedDirt();
        septupleCompressedDirt = new BlockSeptupleCompressedDirt();
        octupleCompressedDirt = new BlockOctupleCompressedDirt();
    }

    public static void initModels() {
        compressedDirt.initModel();
        doubleCompressedDirt.initModel();
        tripleCompressedDirt.initModel();
        quadrupleCompressedDirt.initModel();
        quintupleCompressedDirt.initModel();
        sextupleCompressedDirt.initModel();
        septupleCompressedDirt.initModel();
        octupleCompressedDirt.initModel();
    }

}
