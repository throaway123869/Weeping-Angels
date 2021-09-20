package me.suff.mc.angels.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.suff.mc.angels.WeepingAngels;
import me.suff.mc.angels.common.entities.AngelEnums;
import me.suff.mc.angels.utils.AngelUtil;
import me.suff.mc.angels.utils.DamageType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biomes;

import java.util.ArrayList;
import java.util.List;

@Config(name = WeepingAngels.MODID)
public class WAConfig {

    public static WAConfig CONFIG = new WAConfig();
    public final MobCategory spawnType = MobCategory.MONSTER;
    public final List<? extends String> allowedBiomes = genBiomesForSpawn();
    // Angel
    public final DamageType damageType = DamageType.ANY_PICKAXE_AND_GENERATOR_ONLY;
    // Teleport
    public final AngelUtil.EnumTeleportType teleportType = AngelUtil.EnumTeleportType.RANDOM_PLACE;
    // WorldGen
    public boolean arms = true;
    public boolean genOres = true;
    public boolean genGraveyard = true;
    public boolean genCatacombs = true;
    // Spawn
    public int maxSpawn = 5;
    public int spawnWeight = 5;
    public int minSpawn = 1;
    public boolean playScrapeSounds = true;
    public boolean playSeenSounds = true;
    public double damage = 8;
    public int xpGained = 25;
    public boolean blockBreaking = true;
    public int blockBreakRange;
    public boolean chickenGoboom;
    public boolean torchBlowOut = true;
    public boolean freezeOnAngel = false;
    public int stalkRange = 65;
    public double moveSpeed = 0.2;
    public boolean justTeleport = false;
    public int teleportRange = 500;
    public boolean angelDimTeleport = true;
    public boolean aggroCreative = false;
    public boolean spawnFromBlocks = true;


    public ArrayList<String> genBiomesForSpawn() {
        ArrayList<String> spawnBiomes = new ArrayList<>();
        spawnBiomes.add(Biomes.TAIGA_HILLS.location().toString());
        spawnBiomes.add(Biomes.TAIGA.location().toString());
        spawnBiomes.add(Biomes.DESERT.location().toString());
        spawnBiomes.add(Biomes.DESERT_HILLS.location().toString());
        spawnBiomes.add(Biomes.PLAINS.location().toString());
        spawnBiomes.add(Biomes.SWAMP.location().toString());
        spawnBiomes.add(Biomes.BEACH.location().toString());
        spawnBiomes.add(Biomes.SNOWY_TAIGA.location().toString());
        return spawnBiomes;
    }

    public ArrayList<String> genAngelTypes() {
        ArrayList<String> allowedTypes = new ArrayList<>();
        for (AngelEnums.AngelType angelType : AngelEnums.AngelType.values()) {
            allowedTypes.add(angelType.name());
        }
        return allowedTypes;
    }
}
