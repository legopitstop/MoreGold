package dev.lpsmods.moregold.core;


import dev.lpsmods.moregold.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }

    public static void init() {}

    static {
        MAIN = registerTab("moregold", CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("itemGroup."+Constants.MOD_ID)).icon(() -> {
            return new ItemStack(Items.GOLD_INGOT);
        }).displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
            out.accept(ModItems.GOLDEN_LOG);
            out.accept(ModItems.STRIPPED_GOLDEN_LOG);
            out.accept(ModItems.GOLDEN_WOOD);
            out.accept(ModItems.STRIPPED_GOLDEN_WOOD);
            out.accept(ModItems.GOLDEN_FRUIT_SAPLING);
            out.accept(ModItems.GOLDEN_FRUIT_SEEDS);
            out.accept(ModItems.GOLDEN_BANANA);
            out.accept(ModItems.GOLDEN_GRAPE);
            out.accept(ModItems.GOLDEN_LEMON);
            out.accept(ModItems.GOLDEN_ORANGE);
            out.accept(ModItems.GOLDEN_STRAWBERRY);
            out.accept(ModItems.ENCHANTED_GOLDEN_BANANA);
            out.accept(ModItems.ENCHANTED_GOLDEN_GRAPE);
            out.accept(ModItems.ENCHANTED_GOLDEN_LEMON);
            out.accept(ModItems.ENCHANTED_GOLDEN_ORANGE);
            out.accept(ModItems.ENCHANTED_GOLDEN_STRAWBERRY);
        }).build());
    }
}
