package fox.spiteful.ridiculous.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RidiculousBlocks {

    public static Block treeLogs;
    public static Block treeLeaves;
    public static Block spookyLog;
    public static Block treeSaplings;
    public static Block treePlanks;
    public static Block[] treeStairs;
    public static Block craftBench;
    public static Block boneDust;
    public static Block rockCandy;
    public static Block candyCane;
    public static Block gingerbread;
    public static Block serpent;
    public static Block serpentRune;
    public static Block gloom;

    public static void blockBlockity(){
        boneDust = register(new BlockBoneDust(), "BoneDust");

        /*treeLogs = GameRegistry.registerBlock(new BlockFantasyLog(), ItemBlockLog.class, "RidiculousLog");
        treeLeaves = GameRegistry.registerBlock(new BlockFantasyLeaves(), ItemBlockLeaves.class, "RidiculousLeaves");
        spookyLog = GameRegistry.registerBlock(new BlockSpookyLog(), "SpookyLog");
        treeSaplings = GameRegistry.registerBlock(new BlockFantasySapling(), ItemBlockSapling.class,"RidiculousSapling");
        treePlanks = GameRegistry.registerBlock(new BlockFantasyPlanks(), ItemBlockPlanks.class, "RidiculousPlanks");
        craftBench = GameRegistry.registerBlock(new BlockFancyCrafting(), ItemBlockCrafting.class, "RidiculousCrafting");
        treeStairs = new Block[BlockFantasyPlanks.types.length];
        for(int x = 0;x < treeStairs.length;x++){
            treeStairs[x] = GameRegistry.registerBlock(new BlockModdedStairs(treePlanks, x).setBlockName("stairs_" + BlockFantasyPlanks.types[x]), "stairs" + BlockFantasyPlanks.types[x]);
        }
        boneDust = GameRegistry.registerBlock(new BlockBoneDust(), "BoneDust");
        rockCandy = GameRegistry.registerBlock(new BlockRockCandy(), "RockCandy");
        candyCane = GameRegistry.registerBlock(new BlockCandyCane(), "CandyCane");
        gingerbread = GameRegistry.registerBlock(new BlockGingerbread(), "Gingerbread");
        serpent = GameRegistry.registerBlock(new BlockSerpent(), "Serpent");
        serpentRune = GameRegistry.registerBlock(new BlockSerpentRune(), "SerpentRune");
        gloom = GameRegistry.registerBlock(new BlockGloom(), "Gloom");*/
    }

    private static Block register(Block block, String name){
        block.setRegistryName(name);
        GameRegistry.register(block);
        return block;
    }
}
