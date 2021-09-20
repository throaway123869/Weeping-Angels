package me.suff.mc.angels.common.init;

import me.suff.mc.angels.common.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static me.suff.mc.angels.WeepingAngels.MODID;

public class WABlocks {


    public static final Block SNOW_ANGEL = new SnowArmBlock();
    public static final Block CHRONODYNE_GENERATOR = new ChronodyneGeneratorBlock();
    public static final Block PLINTH = new PlinthBlock();
    public static final Block KONTRON_ORE = new MineableBlock(Material.STONE, SoundType.STONE, 3, 3);
    public static final Block KONTRON_ORE_DEEPSLATE = new MineableBlock(Material.STONE, SoundType.DEEPSLATE, 4.5F, 3);
    public static final Block STATUE = new StatueBlock();
    public static final Block COFFIN = new CoffinBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion());

    public static void init() {
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "snow_angel"), SNOW_ANGEL);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "chronodyne_generator"), CHRONODYNE_GENERATOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "plinth"), PLINTH);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "statue"), STATUE);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "kontron_ore"), KONTRON_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "kontron_ore_deepslate"), KONTRON_ORE_DEEPSLATE);
        Registry.register(Registry.BLOCK, new ResourceLocation(MODID, "coffin"), COFFIN);
    }

}
