package me.suff.mc.angels.common;

import me.suff.mc.angels.WeepingAngels;
import me.suff.mc.angels.common.entities.ChronodyneGeneratorProjectile;
import me.suff.mc.angels.common.entities.Portal;
import me.suff.mc.angels.common.entities.WeepingAngel;
import me.suff.mc.angels.common.items.AngelSpawnerItem;
import me.suff.mc.angels.common.items.ChiselItem;
import me.suff.mc.angels.common.items.ChronodyneGeneratorItem;
import me.suff.mc.angels.common.items.DetectorItem;
import me.suff.mc.angels.common.misc.WATabs;
import me.suff.mc.angels.utils.WADamageSource;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collection;

@Mod.EventBusSubscriber(modid = WeepingAngels.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WAObjects {

    public static DamageSource ANGEL = new WADamageSource("backintime"), GENERATOR = new WADamageSource("generator"), STONE = new WADamageSource("punch_stone"), ANGEL_NECK_SNAP = new WADamageSource("neck_snap");

    public static ResourceLocation CRYPT_LOOT = new ResourceLocation(WeepingAngels.MODID, "chests/crypt");

    private static Item setUpItem(Item item) {
        return item;
    }

    private static Block setUpBlock(Block block) {
        return block;
    }

    private static void genBlockItems(Block... blocks) {
        for (Block block : blocks) {
            Blocks.BLOCK_ITEMS.register(block.getRegistryName().getPath(), () -> setUpItem(new BlockItem(block, new Item.Properties().tab(WATabs.MAIN_TAB))));
        }
    }

    @SuppressWarnings("unused")
    private static void genBlockItems(Collection<RegistryObject<Block>> collection) {
        for (RegistryObject<Block> block : collection) {
            CreativeModeTab itemGroup = WATabs.MAIN_TAB;
            Blocks.BLOCK_ITEMS.register(block.get().getRegistryName().getPath(), () -> setUpItem(new BlockItem(block.get(), new Item.Properties().tab(itemGroup))));
        }
    }

    private static SoundEvent setUpSound(String soundName) {
        SoundEvent soundEvent = new SoundEvent(new ResourceLocation(WeepingAngels.MODID, soundName));
        Registry.register(Registry.SOUND_EVENT, new ResourceLocation(WeepingAngels.MODID, soundName), soundEvent);
        return soundEvent;
    }

    @SubscribeEvent
    public static void regBlockItems(RegistryEvent.Register<Item> e) {
        genBlockItems(Blocks.COFFIN.get(), Blocks.SNOW_ANGEL.get(), Blocks.KONTRON_ORE.get(), Blocks.KONTRON_ORE_DEEPSLATE.get(), Blocks.PLINTH.get(), Blocks.STATUE.get());
    }

    // Tile Creation
    private static <T extends BlockEntity> BlockEntityType<T> registerTiles(BlockEntityType.BlockEntitySupplier<T> tile, Block validBlock) {
        return BlockEntityType.Builder.of(tile, validBlock).build(null);
    }

    // Entity Creation
    private static <T extends Entity> EntityType<T> registerBase(EntityType.EntityFactory<T> factory, IClientSpawner<T> client, MobCategory classification, float width, float height, int trackingRange, int updateFreq, boolean sendUpdate, String name) {
        ResourceLocation loc = new ResourceLocation(WeepingAngels.MODID, name);
        EntityType.Builder<T> builder = EntityType.Builder.of(factory, classification);
        //  builder.setShouldReceiveVelocityUpdates(sendUpdate);
        builder.clientTrackingRange(trackingRange);
        builder.updateInterval(updateFreq);
        builder.sized(width, height);
        //  builder.setCustomClientFactory((spawnEntity, world) -> client.spawn(world));
        return builder.build(loc.toString());
    }

    // Fire Resistant Entity Creation
    private static <T extends Entity> EntityType<T> registerFireImmuneBase(EntityType.EntityFactory<T> factory, IClientSpawner<T> client, MobCategory classification, float width, float height, int trackingRange, int updateFreq, boolean sendUpdate, String name) {
        ResourceLocation loc = new ResourceLocation(WeepingAngels.MODID, name);
        EntityType.Builder<T> builder = EntityType.Builder.of(factory, classification);
        //    builder.setShouldReceiveVelocityUpdates(sendUpdate);
        builder.clientTrackingRange(trackingRange);
        builder.updateInterval(updateFreq);
        builder.fireImmune();
        builder.sized(width, height);
        //   builder.setCustomClientFactory((spawnEntity, world) -> client.spawn(world));
        return builder.build(loc.toString());
    }

    private static <T extends Entity> EntityType<T> registerFireResistMob(EntityType.EntityFactory<T> factory, IClientSpawner<T> client, MobCategory classification, float width, float height, String name, boolean velocity) {
        return registerFireImmuneBase(factory, client, classification, width, height, 80, 3, velocity, name);
    }

    public static <T extends Entity> EntityType<T> registerStatic(EntityType.EntityFactory<T> factory, IClientSpawner<T> client, MobCategory classification, float width, float height, String name) {
        return registerBase(factory, client, classification, width, height, 64, 40, false, name);
    }

    public static <T extends Entity> EntityType<T> registerMob(EntityType.EntityFactory<T> factory, IClientSpawner<T> client, MobCategory classification, float width, float height, String name, boolean velocity) {
        return registerBase(factory, client, classification, width, height, 80, 3, velocity, name);
    }

    public interface IClientSpawner<T> {
        T spawn(Level world);
    }

    public static class Items {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeepingAngels.MODID);

        public static final RegistryObject<Item> TIMEY_WIMEY_DETECTOR = ITEMS.register("timey_wimey_detector", DetectorItem::new);
        public static final RegistryObject<Item> CHRONODYNE_GENERATOR = ITEMS.register("chronodyne_generator", ChronodyneGeneratorItem::new);
        public static final RegistryObject<Item> ANGEL_SPAWNER = ITEMS.register("weeping_angel", () -> setUpItem(new AngelSpawnerItem()));
        public static final RegistryObject<Item> KONTRON_INGOT = ITEMS.register("kontron_ingot", () -> setUpItem(new Item(new Item.Properties().tab(WATabs.MAIN_TAB))));
        public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> setUpItem(new ChiselItem(new Item.Properties().stacksTo(1).tab(WATabs.MAIN_TAB))));
        public static final RegistryObject<Item> SALLY = ITEMS.register("music_disc_sally", () -> setUpItem(new RecordItem(6, Sounds.DISC_SALLY, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE))));
        public static final RegistryObject<Item> TIME_PREVAILS = ITEMS.register("music_disc_time_prevails", () -> setUpItem(new RecordItem(6, Sounds.DISC_TIME_PREVAILS, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE))));
    }

    // Sounds
    public static class Sounds {

        public static final SoundEvent ANGEL_SEEN = setUpSound("angel_seen");
        public static final SoundEvent STONE_SCRAP = setUpSound("stone_scrap");
        public static final SoundEvent CHILD_RUN = setUpSound("child_run");
        public static final SoundEvent LAUGHING_CHILD = setUpSound("laughing_child");
        public static final SoundEvent ANGEL_AMBIENT = setUpSound("angel_ambient");
        public static final SoundEvent DING = setUpSound("ding");
        public static final SoundEvent BLOW = setUpSound("blow");
        public static final SoundEvent ANGEL_DEATH = setUpSound("angel_death");
        public static final SoundEvent ANGEL_NECK_SNAP = setUpSound("angel_neck_snap");
        public static final SoundEvent PROJECTOR = setUpSound("projector");
        public static final SoundEvent TELEPORT = setUpSound("teleport");
        public static final SoundEvent ANGEL_MOCKING = setUpSound("angel_mocking");
        public static final SoundEvent TARDIS_TAKEOFF = setUpSound("tardis_takeoff");
        public static final SoundEvent DISC_SALLY = setUpSound("disc_sally");
        public static final SoundEvent DISC_TIME_PREVAILS = setUpSound("disc_time_prevails");
        public static final SoundEvent CATACOMB = setUpSound("catacomb");
        public static final SoundEvent KNOCK = setUpSound("knock");
    }

    // Entities
    public static class EntityEntries {
        public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, WeepingAngels.MODID);

        public static final RegistryObject<EntityType<WeepingAngel>> WEEPING_ANGEL = ENTITIES.register("weeping_angel", () -> registerFireResistMob(WeepingAngel::new, WeepingAngel::new, MobCategory.MONSTER, 1F, 1.75F, "weeping_angel", false));
        public static final RegistryObject<EntityType<Portal>> ANOMALY = ENTITIES.register("anomaly", () -> registerMob(Portal::new, Portal::new, MobCategory.MONSTER, 1F, 1.75F, "anomaly", false));
        public static final RegistryObject<EntityType<ChronodyneGeneratorProjectile>> CHRONODYNE_GENERATOR = ENTITIES.register("chronodyne_generator", () -> registerMob(ChronodyneGeneratorProjectile::new, ChronodyneGeneratorProjectile::new, MobCategory.MISC, 0.5F, 0.5F, "chronodyne_generator", true));
    }


}
