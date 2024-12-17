package dev.lpsmods.moregold.core;

import dev.lpsmods.moregold.Constants;
import dev.lpsmods.moregold.block.GoldenFruitCropBlock;
import dev.lpsmods.moregold.world.tree.GoldenFruitSaplingGenerator;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final Block GOLDEN_WOOD;
    public static final Block STRIPPED_GOLDEN_WOOD;
    public static final Block GOLDEN_LOG;
    public static final Block STRIPPED_GOLDEN_LOG;
    public static final Block GOLDEN_FRUIT_SAPLING;
    public static final Block GOLDEN_FRUIT_CROP;

    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), block);
    }

    public static void init () {}

    static {
        GOLDEN_WOOD = new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
        STRIPPED_GOLDEN_WOOD = new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
        GOLDEN_LOG = Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN);
        STRIPPED_GOLDEN_LOG = Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN);
        GOLDEN_FRUIT_SAPLING = new SaplingBlock(new GoldenFruitSaplingGenerator(), FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());
        GOLDEN_FRUIT_CROP = new GoldenFruitCropBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());
    }
}
