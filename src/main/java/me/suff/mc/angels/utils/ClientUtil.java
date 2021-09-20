package me.suff.mc.angels.utils;

import me.suff.mc.angels.WeepingAngels;
import me.suff.mc.angels.client.models.entity.*;
import me.suff.mc.angels.client.renders.blockentities.CoffinRenderer;
import me.suff.mc.angels.client.renders.blockentities.PlinthRender;
import me.suff.mc.angels.client.renders.blockentities.SnowAngelRenderer;
import me.suff.mc.angels.client.renders.blockentities.StatueRender;
import me.suff.mc.angels.common.WAObjects;
import me.suff.mc.angels.common.entities.AngelEnums;
import me.suff.mc.angels.common.entities.WeepingAngel;
import me.suff.mc.angels.common.init.WABlocks;
import me.suff.mc.angels.common.init.WATiles;
import me.suff.mc.angels.common.items.AngelSpawnerItem;
import me.suff.mc.angels.common.items.DetectorItem;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.HashMap;
import java.util.Map;

public class ClientUtil {


    public static final Map<AngelEnums.AngelType, EntityModel<WeepingAngel>> MODEL_MAP = new HashMap<>();

    public static EntityModel<WeepingAngel> getModelForAngel(AngelEnums.AngelType angelType) {
        if (MODEL_MAP.isEmpty()) {
            MODEL_MAP.put(AngelEnums.AngelType.ED_ANGEL_CHILD, new ModelAngelChild(Minecraft.getInstance().getEntityModels().bakeLayer(WAModels.ANGEL_CHERUB)));
            MODEL_MAP.put(AngelEnums.AngelType.ANGELA_MC, new ModelAngelaAngel(Minecraft.getInstance().getEntityModels().bakeLayer(WAModels.ANGEL_ANGELA))); //ANGELA
            MODEL_MAP.put(AngelEnums.AngelType.ED, new ModelAngelEd(Minecraft.getInstance().getEntityModels().bakeLayer(WAModels.ANGEL_ED))); //ED
            MODEL_MAP.put(AngelEnums.AngelType.A_DIZZLE, new ModelClassicAngel(Minecraft.getInstance().getEntityModels().bakeLayer(WAModels.ANGEL_CLASSIC))); //CLASSIC
            MODEL_MAP.put(AngelEnums.AngelType.VILLAGER, new ModelWeepingVillager(Minecraft.getInstance().getEntityModels().bakeLayer(WAModels.ANGEL_VILLAGER))); //DOC

        }
        return MODEL_MAP.get(angelType);
    }

    public static void playSound(SoundEvent soundIn, float volumeSfx) {
        Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(soundIn, volumeSfx));
    }

    public static void doClientStuff() {
        WAModels.init();
        BlockEntityRendererRegistry.INSTANCE.register(WATiles.SNOW_ANGEL, SnowAngelRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(WATiles.PLINTH, PlinthRender::new);
        BlockEntityRendererRegistry.INSTANCE.register(WATiles.STATUE, StatueRender::new);
        BlockEntityRendererRegistry.INSTANCE.register(WATiles.COFFIN, CoffinRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(WABlocks.SNOW_ANGEL, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WABlocks.PLINTH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WABlocks.STATUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WABlocks.KONTRON_ORE, RenderType.cutout());

        FabricModelPredicateProviderRegistry.register(WAObjects.Items.TIMEY_WIMEY_DETECTOR, new ResourceLocation("angle"), (itemStack, clientLevel, livingEntity, p_174679_) -> DetectorItem.getTime(itemStack));

        FabricModelPredicateProviderRegistry.register(WAObjects.Items.ANGEL_SPAWNER, new ResourceLocation(WeepingAngels.MODID, "angel_type"), (itemStack, clientWorld, livingEntity, something) -> {
            if (itemStack == null || itemStack.isEmpty()) {
                return 0;
            }
            AngelEnums.AngelType type = AngelSpawnerItem.getType(itemStack);
            return type.ordinal();
        });
    }

}
