package com.godpowers.ascension.progression;

import net.minecraft.server.level.ServerPlayer;

public final class ExperienceUpgradeHandler {

    private ExperienceUpgradeHandler() {
    }

    public static boolean purchaseFirstSelfUpgrade(
        ServerPlayer player,
        PlayerProgression progression,
        SkillTreeType tree
    ) {
        PlayerProgression.TreeProgress treeProgress =
            progression.getTreeProgress(tree);

        if (treeProgress == null) {
            return false;
        }

        if (treeProgress.hasSelfUpgrade()) {
            return false;
        }

        if (player.experienceLevel <
            PlayerProgression.FIRST_SELF_UPGRADE_COST) {
            return false;
        }

        player.giveExperienceLevels(
            -PlayerProgression.FIRST_SELF_UPGRADE_COST
        );

        treeProgress.purchaseSelfUpgrade();

        return true;
    }

    public static boolean canAffordFinalUpgrade(
        ServerPlayer player
    ) {
        return player.experienceLevel >=
            PlayerProgression.FINAL_TIER_UPGRADE_COST;
    }
}