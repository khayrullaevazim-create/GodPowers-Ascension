package com.godpowers.ascension.progression;

import java.util.EnumMap;
import java.util.Map;

public class PlayerProgression {

    public static final int FIRST_SELF_UPGRADE_COST = 3;
    public static final int FINAL_TIER_UPGRADE_COST = 60;

    private final Map<SkillTreeType, TreeProgress> trees =
        new EnumMap<>(SkillTreeType.class);

    public PlayerProgression() {
        for (SkillTreeType tree : SkillTreeType.values()) {
            trees.put(tree, new TreeProgress());
        }
    }

    public TreeProgress getTreeProgress(SkillTreeType tree) {
        return trees.get(tree);
    }

    public static class TreeProgress {

        private boolean selfUpgradePurchased;
        private boolean firstAbilityUnlocked;
        private boolean secondAbilityUnlocked;
        private int upgradeLevel;

        public boolean hasSelfUpgrade() {
            return selfUpgradePurchased;
        }

        public boolean isFirstAbilityUnlocked() {
            return firstAbilityUnlocked;
        }

        public boolean isSecondAbilityUnlocked() {
            return secondAbilityUnlocked;
        }

        public int getUpgradeLevel() {
            return upgradeLevel;
        }

        public void purchaseSelfUpgrade() {
            selfUpgradePurchased = true;
        }

        public void unlockFirstAbility() {
            firstAbilityUnlocked = true;
        }

        public void unlockSecondAbility() {
            secondAbilityUnlocked = true;
        }

        public void increaseUpgradeLevel() {
            upgradeLevel++;
        }
    }
}