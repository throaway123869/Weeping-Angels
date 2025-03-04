package craig.software.mc.angels.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import craig.software.mc.angels.common.WAObjects;
import net.minecraft.ChatFormatting;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

public class LangEnglishProvider implements DataProvider {
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
    private final Map<String, String> data = new TreeMap<>();

    public void addTranslations() {
        /* Blocks */
        add(WAObjects.Blocks.SNOW_ANGEL.get(), "Angel hiding in Snow");
        add(WAObjects.Blocks.STATUE.get(), "Statue (Weeping Angel)");
        add(WAObjects.Blocks.PLINTH.get(), "Plinth (Weeping Angel)");
        add(WAObjects.Blocks.KONTRON_ORE.get(), "Kontron Ore");
        add(WAObjects.Blocks.KONTRON_ORE_DEEPSLATE.get(), "Deepslate Kontron Ore");
        add(WAObjects.Blocks.COFFIN.get(), "Coffin");
        add(WAObjects.Blocks.WALL_ARM.get(), "Arms");

        /* Items */
        add(WAObjects.Items.ANGEL_SPAWNER.get(), "Weeping Angel (%s)");
        add(WAObjects.Items.CHRONODYNE_GENERATOR.get(), "Chronodyne Generator");
        add(WAObjects.Items.KONTRON_INGOT.get(), "Kontron Ingot");
        add(WAObjects.Items.TIMEY_WIMEY_DETECTOR.get(), "Timey Wimey Detector");
        add(WAObjects.Items.CHISEL.get(), "Chisel");

        add(WAObjects.Items.SALLY.get(), "Music Disc");
        add(WAObjects.Items.TIME_PREVAILS.get(), "Music Disc");
        add("item.weeping_angels.music_disc_sally.desc", "Sally Sparrow");
        add("item.weeping_angels.music_disc_time_prevails.desc", "Time Prevails");

        /* Entities */
        add(WAObjects.EntityEntries.WEEPING_ANGEL.get(), "Weeping Angel");
        add(WAObjects.EntityEntries.CHRONODYNE_GENERATOR.get(), "Chronodyne Generator");
        add(WAObjects.EntityEntries.ANOMALY.get(), "Anomaly");

        /* Tooltips */
        add("tooltip.weeping_angels.chisel", ChatFormatting.BLUE + "Edit Statue/Plinth");
        add("tooltip.weeping_angels.chisel_right_click", ChatFormatting.BLUE + "- Right click to change angel pose");
        add("tooltip.weeping_angels.chisel_sneak", ChatFormatting.BLUE + "- Sneak + Right click to Change Angel Type");
        add("tooltip.weeping_angels.punch_variant", ChatFormatting.BLUE + "- Left click to change variant");

        /* Damage Sources */
        add("source.weeping_angels.backintime", "%s was sent back in time by a Angel!");
        add("source.weeping_angels.neck_snap", "%s had their neck snapped by a Angel!");
        add("source.weeping_angels.punch_stone", "%s broke their bones by punching stone...");

        /* Item Groups */
        add("itemGroup.angels", "Weeping Angels");

        /* Config */
        add("config.weeping_angels.teleportRange", "Teleport range");
        add("config.weeping_angels.teleport_entities", "Teleport Entities?");
        add("config.weeping_angels.angel_locking", "Angel on Angel, Quantum locking");
        add("config.weeping_angels.angeldimteleport", "Angel inter-dimensional teleporting");
        add("config.weeping_angels.block_break_range", "Block break Range");
        add("config.weeping_angels.chicken_go_boom", "Chicken Explosions?");
        add("config.weeping_angels.max_spawn", "Angel - Maximum spawn");
        add("config.weeping_angels.spawn_probability", "Spawn Probability");
        add("config.weeping_angels.min_spawn", "Angel - Minimum Spawn");
        add("config.weeping_angels.angel.block_break", "Block breaking");
        add("config.weeping_angels.blowout_torch", "Blow out torch");
        add("config.weeping_angels.genCatacombs", "Gen catacombs?");
        add("config.weeping_angels.chanceGenCatacombs", "Chance to generate a catacomb");
        add("config.weeping_angels.teleport_instant", "Just teleport & No Damage?");
        add("config.weeping_angels.spawntype", "Spawn type");
        add("config.weeping_angels.angel_speed", "Angel Speed");
        add("config.weeping_angels.disallowed_blocks", "A list of blocks angels should NOT break.");
        add("config.weeping_angels.disallowed_dimensions", "A list of dimensions angels should NOT go to.");
        add("config.weeping_angels.angel_move_sound", "Toggle movement sounds for the angels");
        add("config.weeping_angels.angel_seen_sound", "Toggle seen sounds for the angels");
        add("config.weeping_angels.teleport_type", "The Teleport type");
        add("config.weeping_angels.allowed_spawn_dimensions", "A list of dimensions where angels SHOULD spawn");
        add("config.weeping_angels.ql", "Angel on Angel freezing");
        add("config.weeping_angels.pickaxe_only", "Pickaxes and generators only?");
        add("config.weeping_angels.angel_xp_value", "XP gained from Angels");
        add("config.weeping_angels.angel_damage", "Damaged gained from angels");
        add("config.weeping_angels.around_player_range", "Angel target range");
        add("config.weeping_angels.moveSpeed", "Angel move Speed");
        add("config.weeping_angels.transparent_blocks", "Angel Observable Blocks");
        add("config.weeping_angels.santa_hat", "Santa Hats?");

        add("category.weeping_angels.angels", "Angels");
        add("category.weeping_angels.spawn", "Spawn Rates");
        add("category.weeping_angels.worldgen", "World Generation");

        add("texvar.weeping_angels.yellow_windows", "2005 - Yellow Windows");
        add("texvar.weeping_angels.blue_windows", "2005 - Blue Windows");
        add("texvar.weeping_angels.battle", "2005 - Battle");
        add("texvar.weeping_angels.damaged", "2005 - Damaged");
        add("texvar.weeping_angels.yellow_darker", "2005 - Yellow Windows - Darker");
        add("exterior.weeping_angels.2005_exterior", "2005 Exterior");
        add("exterior.weeping_angels.2005exterior", "2005 Exterior");
        add("message.weeping_angels.2005_schematic", "Schematic Obtained! Don't Blink and Run!");

        /* Sounds */
        addSound(WAObjects.Sounds.ANGEL_AMBIENT.get(), "Angel ambiance");
        addSound(WAObjects.Sounds.STONE_SCRAPE.get(), "Stone scrapings");
        addSound(WAObjects.Sounds.ANGEL_DEATH.get(), "Angel crumbles to death");
        addSound(WAObjects.Sounds.ANGEL_MOCKING.get(), "Angel mocks");
        addSound(WAObjects.Sounds.ANGEL_NECK_SNAP.get(), "Players neck snaps");
        addSound(WAObjects.Sounds.ANGEL_SEEN.get(), "Angel seen");
        addSound(WAObjects.Sounds.BLOW.get(), "Angel blows");
        addSound(WAObjects.Sounds.CATACOMB.get(), "Catacomb Ambience");
        addSound(WAObjects.Sounds.CHILD_RUN.get(), "Child running");
        addSound(WAObjects.Sounds.DING.get(), "Ding!");
        addSound(WAObjects.Sounds.DISC_SALLY.get(), "Sally");
        addSound(WAObjects.Sounds.DISC_TIME_PREVAILS.get(), "Time prevails");
        addSound(WAObjects.Sounds.KNOCK.get(), "Knocking");
        addSound(WAObjects.Sounds.LAUGHING_CHILD.get(), "Laughing Child");
        addSound(WAObjects.Sounds.LIGHT_BREAK.get(), "Lighting breaking");
        addSound(WAObjects.Sounds.TELEPORT.get(), "Angel Teleports an Entity");
        addSound(WAObjects.Sounds.TARDIS_TAKEOFF.get(), "Tardis Takeoff");
        addSound(WAObjects.Sounds.PROJECTOR.get(), "Whirr");
    }

    @Override
    public void run(@NotNull CachedOutput cache) throws IOException {
        addTranslations();
        if (!data.isEmpty()) {
            File target = new File("../crowdin/english.json");
            System.out.println(data);
            System.out.println(target.getAbsolutePath());
            FileWriter writer = new FileWriter(target);
            GSON.toJson(data, writer);
            writer.flush();
            writer.close();
        }
    }

    @Override
    public @NotNull String getName() {
        return "Crowdin";
    }


    public void addSound(SoundEvent soundEvent, String lang) {
        add("sound.weeping_angels." + soundEvent.getLocation().getPath(), lang);
    }

    public void addBlock(Supplier<? extends Block> key, String name) {
        add(key.get(), name);
    }

    public void add(Block key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void addItem(Supplier<? extends Item> key, String name) {
        add(key.get(), name);
    }

    public void add(Item key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void addItemStack(Supplier<ItemStack> key, String name) {
        add(key.get(), name);
    }

    public void add(ItemStack key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void addEnchantment(Supplier<? extends Enchantment> key, String name) {
        add(key.get(), name);
    }

    public void add(Enchantment key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void addEffect(Supplier<? extends MobEffect> key, String name) {
        add(key.get(), name);
    }

    public void add(MobEffect key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void addEntityType(Supplier<? extends EntityType<?>> key, String name) {
        add(key.get(), name);
    }

    public void add(EntityType<?> key, String name) {
        add(key.getDescriptionId(), name);
    }

    public void add(String key, String value) {
        if (data.put(key, value) != null)
            throw new IllegalStateException("Duplicate translation key " + key);
    }
}
