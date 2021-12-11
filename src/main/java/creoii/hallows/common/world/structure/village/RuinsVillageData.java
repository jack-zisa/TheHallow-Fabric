package creoii.hallows.common.world.structure.village;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import creoii.hallows.core.Hallows;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.util.Identifier;

public class RuinsVillageData {
    public static StructurePool STRUCTURE_POOLS;

    public static void init() {
        STRUCTURE_POOLS = StructurePools.register(new StructurePool(new Identifier(Hallows.MOD_ID, "village/ruins/town_centers"), new Identifier("empty"), ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/town_centers/ruins_meeting_point_1", StructureProcessorLists.EMPTY), 49)), StructurePool.Projection.RIGID));
        StructurePools.register(new StructurePool(new Identifier(Hallows.MOD_ID, "village/ruins/streets"), new Identifier(Hallows.MOD_ID, "village/ruins/terminators"), ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/streets/corner_01", StructureProcessorLists.STREET_PLAINS), 3), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/streets/corner_02", StructureProcessorLists.STREET_PLAINS), 3), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/streets/straight_01", StructureProcessorLists.STREET_PLAINS), 4), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/streets/straight_02", StructureProcessorLists.STREET_PLAINS), 4), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/ruins/streets/straight_03", StructureProcessorLists.STREET_PLAINS), 4), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/crossroad_01", StructureProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/crossroad_02", StructureProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/crossroad_03", StructureProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/square_01", StructureProcessorLists.STREET_PLAINS), 2), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/square_02", StructureProcessorLists.STREET_PLAINS), 2), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/taiga/streets/turn_01", StructureProcessorLists.STREET_PLAINS), 3)), StructurePool.Projection.TERRAIN_MATCHING));
        StructurePools.register(new StructurePool(new Identifier(Hallows.MOD_ID, "village/ruins/houses"), new Identifier(Hallows.MOD_ID, "village/ruins/terminators"), ImmutableList.of(Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_1"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_2"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_3"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_4"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_5"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_6"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_small_house_7"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_medium_house_1"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_medium_house_2"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_temple_1"), 2), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/houses/ruins_temple_2"), 2), Pair.of(StructurePoolElement.ofEmpty(), 5)), StructurePool.Projection.RIGID));
        StructurePools.register(new StructurePool(new Identifier(Hallows.MOD_ID, "village/ruins/terminators"), new Identifier("empty"), ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/plains/terminators/terminator_01", StructureProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.ofProcessedLegacySingle("village/plains/terminators/terminator_02", StructureProcessorLists.STREET_PLAINS), 1)), StructurePool.Projection.TERRAIN_MATCHING));
        StructurePools.register(new StructurePool(new Identifier(Hallows.MOD_ID, "village/ruins/monsters"), new Identifier("empty"), ImmutableList.of(Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/monsters/ghost"), 1), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/monsters/skeleton"), 5), Pair.of(StructurePoolElement.ofLegacySingle("village/ruins/monsters/zombie"), 10)), StructurePool.Projection.RIGID));
    }
}