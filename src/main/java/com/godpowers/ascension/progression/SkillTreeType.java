package com.godpowers.ascension.progression;

public enum SkillTreeType {

    TELEKINESIS(
        "Telekinesis",
        "Telekinetic Grasp",
        "Telekinetic Throw"
    ),

    MATTER_MANIPULATION(
        "Matter Manipulation",
        "Molecular Transformation",
        "Molecular Excavation"
    ),

    REALITY_MANIPULATION(
        "Reality Manipulation",
        "Spatial Rift",
        "Time Distortion"
    ),

    ELEMENTAL_DIVINITY(
        "Elemental Divinity",
        "Elemental Burst",
        "Elemental Cataclysm"
    ),

    COSMIC_POWERS(
        "Cosmic Powers",
        "Cosmic Beam",
        "Black Hole"
    ),

    CREATION(
        "Creation",
        "Divine Construction",
        "Divine Guardian"
    );

    private final String displayName;
    private final String firstAbility;
    private final String secondAbility;

    SkillTreeType(
        String displayName,
        String firstAbility,
        String secondAbility
    ) {
        this.displayName = displayName;
        this.firstAbility = firstAbility;
        this.secondAbility = secondAbility;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFirstAbility() {
        return firstAbility;
    }

    public String getSecondAbility() {
        return secondAbility;
    }
}