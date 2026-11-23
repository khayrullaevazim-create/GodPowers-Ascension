package com.godpowers.ascension.progression;

public final class AbilityUnlockHandler {

    private AbilityUnlockHandler() {
    }

    public static boolean unlockFirstAbility(
        PlayerProgression progression,
        SkillTreeType tree
    ) {
        PlayerProgression.TreeProgress progress =
            progression.getTreeProgress(tree);

        if (progress == null || !progress.hasSelfUpgrade()) {
            return false;
        }

        if (progress.isFirstAbilityUnlocked()) {
            return false;
        }

        progress.unlockFirstAbility();
        return true;
    }

    public static boolean unlockSecondAbility(
        PlayerProgression progression,
        SkillTreeType tree
    ) {
        PlayerProgression.TreeProgress progress =
            progression.getTreeProgress(tree);

        if (progress == null || !progress.isFirstAbilityUnlocked()) {
            return false;
        }

        if (progress.isSecondAbilityUnlocked()) {
            return false;
        }

        progress.unlockSecondAbility();
        return true;
    }
}