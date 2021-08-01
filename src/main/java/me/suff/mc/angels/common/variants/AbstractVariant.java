package me.suff.mc.angels.common.variants;

import me.suff.mc.angels.common.entities.WeepingAngel;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Predicate;

public abstract class AbstractVariant {

    private final Predicate<WeepingAngel> variantTest;
    private boolean isHeadless = false;
    private ResourceLocation name;

    public AbstractVariant(Predicate<WeepingAngel> weepingAngelEntityPredicate) {
        this.variantTest = weepingAngelEntityPredicate;
    }

    public Predicate<WeepingAngel> getVariantTest() {
        return variantTest;
    }

    public ItemStack stackDrop() {
        return new ItemStack(Blocks.AIR);
    }

    public boolean shouldDrop(DamageSource damageSource, WeepingAngel quantumLockEntity) {
        return false;
    }

    public boolean isHeadless() {
        return isHeadless;
    }

    public AbstractVariant setHeadless(boolean isHeadless) {
        this.isHeadless = isHeadless;
        return this;
    }

    public abstract double getRarity();

    public boolean canVariantBeUsed(WeepingAngel weepingAngel) {
        if (variantTest == null) {
            return true;
        }
        return variantTest.test(weepingAngel);
    }

    public AbstractVariant setName(ResourceLocation name){
        this.name = name;
        return this;
    }

    public ResourceLocation getName() {
        return name;
    }
}
