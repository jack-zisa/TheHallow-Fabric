package creoii.hallows.core.registry;

import creoii.hallows.common.item.base.MiningToolItem;
import creoii.hallows.common.item.material.GhostlyMaterial;
import creoii.hallows.common.item.material.StygianMaterial;
import creoii.hallows.core.Hallows;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item STYGIAN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item STYGIAN_HELMET = new ArmorItem(Materials.STYGIAN_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STYGIAN_CHESTPLATE = new ArmorItem(Materials.STYGIAN_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STYGIAN_LEGGINGS = new ArmorItem(Materials.STYGIAN_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STYGIAN_BOOTS = new ArmorItem(Materials.STYGIAN_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STYGIAN_SWORD = new SwordItem(Materials.STYGIAN_TOOLS, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STYGIAN_PICKAXE = new MiningToolItem(1.0F, -2.8F, Materials.STYGIAN_TOOLS, BlockTags.PICKAXE_MINEABLE, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item STYGIAN_AXE = new MiningToolItem(5.0F, -3.0F, Materials.STYGIAN_TOOLS, BlockTags.PICKAXE_MINEABLE, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item STYGIAN_SHOVEL = new MiningToolItem(1.5F, -3.0F, Materials.STYGIAN_TOOLS, BlockTags.PICKAXE_MINEABLE, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item STYGIAN_HOE = new MiningToolItem(-4.0F, 0.0F, Materials.STYGIAN_TOOLS, BlockTags.PICKAXE_MINEABLE, new Item.Settings().group(ItemGroup.TOOLS));

    public static final Item WITCH_BREW = new Item(new Item.Settings().group(ItemGroup.BREWING));

    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item OPAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item GHOST_CLOTH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item GHOSTLY_DRAPE = new ArmorItem(Materials.GHOSTLY_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));

    public static final Item GHOST_SPAWN_EGG = new SpawnEggItem(EntityRegistry.GHOST, 13159139, 9079978, new Item.Settings().group(ItemGroup.MISC));
    public static final Item MAGUS_SPAWN_EGG = new SpawnEggItem(EntityRegistry.MAGUS, 12609675, 3293539, new Item.Settings().group(ItemGroup.MISC));
    public static final Item HAUNT_SPAWN_EGG = new SpawnEggItem(EntityRegistry.HAUNT, 4275275, 2827571, new Item.Settings().group(ItemGroup.MISC));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_ingot"), STYGIAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_helmet"), STYGIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_chestplate"), STYGIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_leggings"), STYGIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_boots"), STYGIAN_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_sword"), STYGIAN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_pickaxe"), STYGIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_axe"), STYGIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_shovel"), STYGIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "stygian_hoe"), STYGIAN_HOE);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "witch_brew"), WITCH_BREW);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "ghost_cloth"), GHOST_CLOTH);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "ghostly_drape"), GHOSTLY_DRAPE);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "ghost_spawn_egg"), GHOST_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "magus_spawn_egg"), MAGUS_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Hallows.MOD_ID, "haunt_spawn_egg"), HAUNT_SPAWN_EGG);
    }

    public static class Materials {
        public static final ToolMaterial STYGIAN_TOOLS = new StygianMaterial.Tool();
        public static final ArmorMaterial STYGIAN_ARMOR = new StygianMaterial.Armor();
        public static final ArmorMaterial GHOSTLY_ARMOR = new GhostlyMaterial.Armor();
    }
}