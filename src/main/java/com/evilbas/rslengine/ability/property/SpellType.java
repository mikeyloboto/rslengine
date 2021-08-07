package com.evilbas.rslengine.ability.property;

public enum SpellType {

    FIRE("fire"), NATURE("nature"), WATER("water"), PHYSICAL("physical"), CHAOS("chaos"), SHADOW("shadow"),
    LIGHTNING("lightning"), RADIANT("radiant"), PSYCHIC("psychic"), FROST("frost");

    private String readableName;

    private SpellType(String readableName) {
        this.readableName = readableName;
    }

    public String getReadableName(boolean capitalized) {
        return capitalized ? readableName.substring(0, 1).toUpperCase() + readableName.substring(1) : readableName;
    }
}
