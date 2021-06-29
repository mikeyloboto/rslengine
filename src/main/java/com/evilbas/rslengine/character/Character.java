package com.evilbas.rslengine.character;

import java.util.UUID;

import com.evilbas.rslengine.creature.Creature;
import com.evilbas.rslengine.creature.Encounter;

public class Character extends Creature {
    private String characterGuid;
    private String characterName;
    private Integer characterLevel;
    private Long characterExp;
    private Integer ownerId;
    private Encounter currentEncounter;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCharacterGuid() {
        return characterGuid;
    }

    public void setCharacterGuid(String characterGuid) {
        this.characterGuid = characterGuid;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public Long getCharacterExp() {
        return characterExp;
    }

    public void setCharacterExp(Long characterExp) {
        this.characterExp = characterExp;
    }

    public Character(String characterName) {
        this.setName(characterName);
        this.characterGuid = UUID.randomUUID().toString();
        this.characterExp = 0L;
        this.characterLevel = 1;
    }

    public Encounter getCurrentEncounter() {
        return currentEncounter;
    }

    public void setCurrentEncounter(Encounter currentEncounter) {
        this.currentEncounter = currentEncounter;
    }

}
