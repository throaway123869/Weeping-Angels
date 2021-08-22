package me.suff.mc.angels.common.init;

import me.suff.mc.angels.WeepingAngels;
import me.suff.mc.angels.common.blockentities.CoffinBlockEntity;
import me.suff.mc.angels.common.blockentities.PlinthBlockEntity;
import me.suff.mc.angels.common.blockentities.SnowAngelBlockEntity;
import me.suff.mc.angels.common.blockentities.StatueBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class WATiles {

    public static BlockEntityType<SnowAngelBlockEntity> SNOW_ANGEL;
    public static BlockEntityType<PlinthBlockEntity> PLINTH;
    public static BlockEntityType<StatueBlockEntity> STATUE;
    public static BlockEntityType<CoffinBlockEntity> COFFIN;

    public static void init(){
        SNOW_ANGEL = Registry.register(Registry.BLOCK_ENTITY_TYPE, "tutorial:demo_block_entity", FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));

    }

}
