package me.suff.mc.angels;

import me.suff.mc.angels.utils.ClientUtil;
import net.fabricmc.api.ModInitializer;

public class WeepingAngelsClient implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ClientUtil.doClientStuff();
    }
}
