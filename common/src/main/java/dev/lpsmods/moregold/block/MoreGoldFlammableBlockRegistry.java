package dev.lpsmods.moregold.block;

import dev.lpsmods.moregold.core.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MoreGoldFlammableBlockRegistry {
    public static void register() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.GOLDEN_LOG, 5, 5);
        registry.add(ModBlocks.GOLDEN_WOOD, 5, 5);
    }
}
