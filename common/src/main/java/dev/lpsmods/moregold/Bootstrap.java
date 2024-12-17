package dev.lpsmods.moregold;

import dev.lpsmods.moregold.core.ModBlocks;
import dev.lpsmods.moregold.core.ModCreativeModeTabs;
import dev.lpsmods.moregold.core.ModItems;

public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}