package com.godpowers.ascension.progression;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ProgressionManager {

    private static final Map<UUID, PlayerProgression> PLAYER_DATA =
        new HashMap<>();

    private ProgressionManager() {
    }

    public static PlayerProgression getProgression(UUID playerId) {
        return PLAYER_DATA.computeIfAbsent(
            playerId,
            id -> new PlayerProgression()
        );
    }

    public static void removeProgression(UUID playerId) {
        PLAYER_DATA.remove(playerId);
    }

    public static boolean hasProgression(UUID playerId) {
        return PLAYER_DATA.containsKey(playerId);
    }

    public static void clearAllProgression() {
        PLAYER_DATA.clear();
    }
}