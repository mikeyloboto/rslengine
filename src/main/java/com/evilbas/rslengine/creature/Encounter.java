package com.evilbas.rslengine.creature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.evilbas.rslengine.util.CombatUtil;

import lombok.Data;
import lombok.NonNull;

import com.evilbas.rslengine.character.Character;

@Data
public class Encounter {
    @NonNull
    private List<Creature> creatures;

    public Long getEncounterExp(Character character) {
        Long baseExp = 0L;
        for (Creature c : creatures) {
            baseExp += CombatUtil.getMonsterExpDrop(c.getLevel());
        }

        Integer levelDiff = character.getCharacterLevel() - creatures.get(0).getLevel();
        if (levelDiff > 3) {
            baseExp = (long) (baseExp * 0.667);
        } else if (levelDiff < -3) {
            baseExp = (long) (baseExp * 2.0);
        }
        return baseExp;

    }

    public Creature getCreatureSlot(Integer slot) {
        if (slot < 0 || slot > creatures.size()) {
            return creatures.get(0);
        }
        return creatures.get(slot);
    }

    public static Encounter generateMockEncounter() {

        List<Creature> creatures = new ArrayList<>();

        Integer cNum = new Random().nextInt(3) + 1;
        for (int i = 0; i < cNum; i++) {
            Creature creature = new Creature();
            creature.setMaxHp(20L);
            creature.setCurrentHp(20L);
            creature.setName("Kobold");
            creature.setLevel(2);
            creatures.add(creature);
        }
        return new Encounter(creatures);
    }

}
