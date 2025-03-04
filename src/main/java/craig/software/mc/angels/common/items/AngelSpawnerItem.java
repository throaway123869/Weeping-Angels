package craig.software.mc.angels.common.items;

import craig.software.mc.angels.common.entities.WeepingAngel;
import craig.software.mc.angels.common.entities.WeepingAngelTypes;
import craig.software.mc.angels.common.misc.WATabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AngelSpawnerItem extends Item {

    public AngelSpawnerItem() {
        super(new Properties().tab(WATabs.MAIN_TAB));
    }

    public static ItemStack setType(ItemStack stack, WeepingAngelTypes type) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putString("type", type.name());
        return stack;
    }

    public static WeepingAngelTypes getType(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        String angelType = tag.getString("type");
        angelType = angelType.isEmpty() ? WeepingAngelTypes.DISASTER_MC.name() : angelType;
        return WeepingAngelTypes.valueOf(angelType);
    }

    @Override
    public void fillItemCategory(@NotNull CreativeModeTab group, @NotNull NonNullList<ItemStack> items) {
        if (allowedIn(group)) {
            for (WeepingAngelTypes weepingAngelTypes : WeepingAngelTypes.values()) {
                ItemStack itemstack = new ItemStack(this);
                setType(itemstack, weepingAngelTypes);
                items.add(itemstack);
            }
        }

    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack stack) {
        return Component.translatable(this.getDescriptionId(stack), getType(stack).getReadable());
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level worldIn = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();

        if (!worldIn.isClientSide) {
            WeepingAngel angel = new WeepingAngel(worldIn);
            angel.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
            if (player != null) {
                angel.lookAt(player, 90.0F, 90.0F);
            }
            worldIn.addFreshEntity(angel);
            angel.setType(getType(context.getItemInHand()));

            if (!player.isCreative()) {
                context.getItemInHand().shrink(1);
            }
        }
        return super.useOn(context);
    }

}
