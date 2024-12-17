package dev.lpsmods.moregold.core;

import dev.lpsmods.moregold.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

// TODO
// - Golden crop should only drop 1 item
// - Golden Logs should have a chance to drop a nugget instead of log?
public class ModItems {
    public static final Item GOLDEN_LOG;
    public static final Item STRIPPED_GOLDEN_LOG;
    public static final Item GOLDEN_WOOD;
    public static final Item STRIPPED_GOLDEN_WOOD;
    public static final Item GOLDEN_FRUIT_SAPLING;
    public static final Item GOLDEN_FRUIT_SEEDS;
    public static final Item GOLDEN_BANANA;
    public static final Item GOLDEN_GRAPE;
    public static final Item GOLDEN_LEMON;
    public static final Item GOLDEN_ORANGE;
    public static final Item GOLDEN_STRAWBERRY;
    public static final Item ENCHANTED_GOLDEN_BANANA;
    public static final Item ENCHANTED_GOLDEN_GRAPE;
    public static final Item ENCHANTED_GOLDEN_LEMON;
    public static final Item ENCHANTED_GOLDEN_ORANGE;
    public static final Item ENCHANTED_GOLDEN_STRAWBERRY;

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name),item);
    }

    private static Item registerBlock(String name, Block block) {
        return registerItem(name, new BlockItem(block, new Item.Properties()));
    }

    private static Item registerNotch(String name, Item.Properties properties) {
        return registerItem(name, new Item(properties.component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.EPIC)));
    }

    public static void init() {}

    static {
        GOLDEN_LOG = registerBlock("golden_log", ModBlocks.GOLDEN_LOG);
        STRIPPED_GOLDEN_LOG = registerBlock("stripped_golden_log", ModBlocks.STRIPPED_GOLDEN_LOG);
        GOLDEN_WOOD = registerBlock("golden_wood", ModBlocks.GOLDEN_WOOD);
        STRIPPED_GOLDEN_WOOD = registerBlock("stripped_golden_wood", ModBlocks.STRIPPED_GOLDEN_WOOD);
        GOLDEN_FRUIT_SAPLING = registerBlock("golden_fruit_sapling", ModBlocks.GOLDEN_FRUIT_SAPLING);
        GOLDEN_FRUIT_SEEDS = registerBlock("golden_fruit_seeds", ModBlocks.GOLDEN_FRUIT_CROP);

        GOLDEN_BANANA = registerItem("golden_banana", new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).rarity(Rarity.RARE)));
        GOLDEN_GRAPE = registerItem("golden_grape", new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).rarity(Rarity.RARE)));
        GOLDEN_LEMON = registerItem("golden_lemon", new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).rarity(Rarity.RARE)));
        GOLDEN_ORANGE = registerItem("golden_orange", new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).rarity(Rarity.RARE)));
        GOLDEN_STRAWBERRY = registerItem("golden_strawberry", new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).rarity(Rarity.RARE)));
        ENCHANTED_GOLDEN_BANANA = registerNotch("enchanted_golden_banana", new Item.Properties().food(Foods.ENCHANTED_GOLDEN_APPLE));
        ENCHANTED_GOLDEN_GRAPE = registerNotch("enchanted_golden_grape", new Item.Properties().food(Foods.ENCHANTED_GOLDEN_APPLE));
        ENCHANTED_GOLDEN_LEMON = registerNotch("enchanted_golden_lemon", new Item.Properties().food(Foods.ENCHANTED_GOLDEN_APPLE));
        ENCHANTED_GOLDEN_ORANGE = registerNotch("enchanted_golden_orange", new Item.Properties().food(Foods.ENCHANTED_GOLDEN_APPLE));
        ENCHANTED_GOLDEN_STRAWBERRY = registerNotch("enchanted_golden_strawberry", new Item.Properties().food(Foods.ENCHANTED_GOLDEN_APPLE));
    }
}
