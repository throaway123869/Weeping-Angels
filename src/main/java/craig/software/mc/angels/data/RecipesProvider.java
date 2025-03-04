package craig.software.mc.angels.data;

import craig.software.mc.angels.WeepingAngels;
import craig.software.mc.angels.common.WAObjects;
import craig.software.mc.angels.utils.InventoryHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(WAObjects.Blocks.PLINTH.get().asItem()).pattern("#").pattern("S").pattern("Q").define('#', Blocks.STONE.asItem()).define('S', Blocks.SMOOTH_STONE.asItem()).define('Q', Blocks.QUARTZ_PILLAR).unlockedBy("has_crafting_table", InventoryHelper.has(Tags.Items.STONE)).save(consumer);
        ShapedRecipeBuilder.shaped(WAObjects.Items.TIMEY_WIMEY_DETECTOR.get()).pattern("#R#").pattern("COV").pattern("BBB").define('#', Blocks.REPEATER.asItem()).define('R', Blocks.REDSTONE_TORCH.asItem()).define('C', Items.CLOCK).define('O', ItemTags.PLANKS).define('V', Items.REDSTONE).define('B', Blocks.BRICKS).unlockedBy("has_clock", has(Items.CLOCK)).save(consumer);
        ShapedRecipeBuilder.shaped(WAObjects.Blocks.STATUE.get()).pattern("#").pattern("S").define('#', Blocks.STONE.asItem()).define('S', Blocks.SMOOTH_STONE.asItem()).unlockedBy("has_stone", InventoryHelper.has(Tags.Items.STONE)).save(consumer);
        ShapedRecipeBuilder.shaped(WAObjects.Blocks.COFFIN.get()).pattern("WWW").pattern("WBW").pattern("WWW").define('W', ItemTags.LOGS).define('B', Items.BONE.asItem()).unlockedBy("has_bone", InventoryHelper.has(Tags.Items.BONES)).save(consumer);
        ShapedRecipeBuilder.shaped(WAObjects.Items.CHRONODYNE_GENERATOR.get(), 2).pattern("IPI").pattern("EKE").pattern("IRI").define('I', Items.IRON_INGOT).define('E', Items.CLOCK.asItem()).define('R', Items.REDSTONE).define('P', Blocks.STONE_BUTTON).define('K', WAObjects.Items.KONTRON_INGOT.get()).unlockedBy("has_kontron", has(WAObjects.Blocks.KONTRON_ORE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(WAObjects.Items.CHISEL.get()).requires(ItemTags.STONE_CRAFTING_MATERIALS).requires(Items.STRING).requires(Items.STICK).unlockedBy("has_stone", InventoryHelper.has(ItemTags.STONE_CRAFTING_MATERIALS)).save(consumer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(WAObjects.Blocks.KONTRON_ORE.get().asItem()), WAObjects.Items.KONTRON_INGOT.get(), 0.7F, 300).unlockedBy("has_any_kontron", has(WAObjects.Blocks.KONTRON_ORE.get().asItem())).save(consumer, new ResourceLocation(WeepingAngels.MODID, "smelt_kontron"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(WAObjects.Blocks.KONTRON_ORE.get().asItem()), WAObjects.Items.KONTRON_INGOT.get(), 0.8F, 150).unlockedBy("has_any_kontron", has(WAObjects.Blocks.KONTRON_ORE.get().asItem())).save(consumer, new ResourceLocation(WeepingAngels.MODID, "blast_kontron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(WAObjects.Blocks.KONTRON_ORE_DEEPSLATE.get().asItem()), WAObjects.Items.KONTRON_INGOT.get(), 0.7F, 300).unlockedBy("has_any_kontron", has(WAObjects.Blocks.KONTRON_ORE.get().asItem())).save(consumer, new ResourceLocation(WeepingAngels.MODID, "smelt_kontron_deep"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(WAObjects.Blocks.KONTRON_ORE_DEEPSLATE.get().asItem()), WAObjects.Items.KONTRON_INGOT.get(), 0.8F, 150).unlockedBy("has_any_kontron", has(WAObjects.Blocks.KONTRON_ORE.get().asItem())).save(consumer, new ResourceLocation(WeepingAngels.MODID, "blast_kontron_deep"));
    }

}
