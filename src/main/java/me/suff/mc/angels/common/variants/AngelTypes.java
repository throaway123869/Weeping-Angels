package me.suff.mc.angels.common.variants;

import com.google.common.collect.Iterables;
import me.suff.mc.angels.common.entities.WeepingAngel;
import me.suff.mc.angels.utils.AngelUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;
import java.util.function.Predicate;

public class AngelTypes {

    private static final HashMap<String, AbstractVariant> VARIANTS = new HashMap<>();
    public static final AbstractVariant GOLD = register("gold", new MiningVariant(() -> new ItemStack(Blocks.GOLD_ORE), 25));
    public static final AbstractVariant DIAMOND = register("diamond", new MiningVariant(() -> new ItemStack(Blocks.DIAMOND_ORE), 5));
    public static final AbstractVariant IRON = register("iron", new MiningVariant(() -> new ItemStack(Blocks.IRON_ORE), 50));
    public static final AbstractVariant MOSSY = register("mossy", new BaseVariant(() -> new ItemStack(Blocks.MOSSY_COBBLESTONE), 45));
    public static final AbstractVariant NORMAL = register("normal", new BaseVariant(() -> new ItemStack(Blocks.COBBLESTONE), 45));
    public static final AbstractVariant RUSTED = register("rusted", new BaseVariant(() -> new ItemStack(Blocks.GRANITE), 45));
    public static final AbstractVariant RUSTED_NO_ARM = register("rusted_no_arm", new BaseVariant(() -> new ItemStack(Blocks.GRANITE), 45));
    public static final AbstractVariant RUSTED_NO_WING = register("rusted_no_wing", new BaseVariant(() -> new ItemStack(Blocks.GRANITE), 45));
    public static final AbstractVariant RUSTED_NO_HEAD = register("rusted_no_head", new BaseVariant(() -> new ItemStack(Blocks.GRANITE), 45).setHeadless(true));
    public static final AbstractVariant DIRT = register("dirt", new BaseVariant(() -> new ItemStack(Blocks.DIRT), 10));
    public static final AbstractVariant EMERALD = register("emerald", new MiningVariant(() -> new ItemStack(Blocks.EMERALD_ORE), 20));
    public static final AbstractVariant COPPER = register("copper", new MiningVariant(() -> new ItemStack(Blocks.COPPER_ORE), 20));
    public static final AbstractVariant LAPIS = register("lapis_lazuli", new MiningVariant(() -> new ItemStack(Blocks.LAPIS_ORE), 10));
    public static Predicate<WeepingAngel> FREE_REIGN = weepingAngelEntity -> true;
    public static final AbstractVariant QUARTZ = register("quartz", new MiningVariant(() -> new ItemStack(Blocks.NETHER_QUARTZ_ORE), 30, FREE_REIGN));
    public static Predicate<WeepingAngel> BANNED_FROM_NETHER = weepingAngelEntity -> {
        if (weepingAngelEntity.level.dimension() == Level.NETHER) {
            weepingAngelEntity.setVarient(AngelUtil.RAND.nextBoolean() ? AngelTypes.BASALT : AngelTypes.QUARTZ);
        }
        return false;
    };
    public static Predicate<WeepingAngel> BANNED_FROM_OVERWORLD = weepingAngelEntity -> {
        if (weepingAngelEntity.level.dimension() != Level.NETHER) {
            weepingAngelEntity.setVarient(AngelTypes.NORMAL);
        }
        return false;
    };
    public static final AbstractVariant BASALT = register("basalt", new MiningVariant(() -> new ItemStack(Blocks.BASALT), 30, BANNED_FROM_OVERWORLD));
    public static WeightedHandler WEIGHTED_VARIANTS = new WeightedHandler();

    private static AbstractVariant register(String name, AbstractVariant abstractVariant) {
        abstractVariant.setName(new ResourceLocation("weeping_angels", name));
        VARIANTS.put(name, abstractVariant);
        return abstractVariant;
    }

    public static AbstractVariant getWeightedRandom() {
        if (VARIANTS.isEmpty()) {
            for (AbstractVariant abstractVariant : VARIANTS.values()) {
                WEIGHTED_VARIANTS.addEntry(abstractVariant);
            }
        }
        return WEIGHTED_VARIANTS.getRandom();
    }

    public static AbstractVariant getUnweightedRandom() {
        return Iterables.get(VARIANTS.values(), AngelUtil.RAND.nextInt(VARIANTS.size()));
    }

}
