package me.suff.mc.angels;

import me.suff.mc.angels.common.init.WABlocks;
import net.fabricmc.api.ModInitializer;

public class WeepingAngels implements ModInitializer {

    public static final String MODID = "weeping_angels";
    public static final String NAME = "Weeping Angels";


    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        WABlocks.init();
    }
}
