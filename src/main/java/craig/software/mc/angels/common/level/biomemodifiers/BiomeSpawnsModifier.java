package craig.software.mc.angels.common.level.biomemodifiers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import craig.software.mc.angels.WeepingAngels;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo.BiomeInfo.Builder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public record BiomeSpawnsModifier(HolderSet<Biome> biomes, SpawnerData spawn) implements BiomeModifier {
    public static final ResourceLocation WEEPING_ANGEL_SPAWNS = new ResourceLocation(WeepingAngels.MODID, "spawns/weeping_angels");
    public static final String MODIFY_SPAWNS = "weeping_angel_spawns";
    private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(WEEPING_ANGEL_SPAWNS, ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, WeepingAngels.MODID);

    public static Codec<BiomeSpawnsModifier> makeCodec() {
        return RecordCodecBuilder.create(builder -> builder.group(
                Biome.LIST_CODEC.fieldOf("biomes").forGetter(BiomeSpawnsModifier::biomes),
                SpawnerData.CODEC.fieldOf("spawn").forGetter(BiomeSpawnsModifier::spawn)
        ).apply(builder, BiomeSpawnsModifier::new));
    }

    @Override
    public void modify(Holder<Biome> biome, Phase phase, Builder builder) {
        if (phase == Phase.ADD && this.biomes.contains(biome)) {
            builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), this.spawn);
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return SERIALIZER.get();
    }

}