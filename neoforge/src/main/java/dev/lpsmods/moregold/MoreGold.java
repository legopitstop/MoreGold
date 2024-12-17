package dev.lpsmods.moregold;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreGold {

    public MoreGold(IEventBus eventBus) {
        Bootstrap.init();
    }
}