package com.evilbas.rslengine.creature;

import java.util.List;

import com.evilbas.rslengine.util.CombatUtil;
import com.evilbas.rslengine.character.Character;

public class Encounter {
    private List<Creature> creatures;

    public Encounter(List<Creature> creatures) {
        this.creatures = creatures;
    }

    public Long getEncounterExp(Character character) {
        Long baseExp = 0L;
        for (Creature c : creatures) {
            baseExp += CombatUtil.getMonsterExpDrop(c.getLevel());
        }

        Integer levelDiff = character.getLevel() - creatures.get(0).getLevel();
        if (levelDiff > 3) {
            baseExp = (long) (baseExp * 0.667);
        } else if (levelDiff < -3) {
            baseExp = (long) (baseExp * 2.0);
        }
        return baseExp;

    }
}
