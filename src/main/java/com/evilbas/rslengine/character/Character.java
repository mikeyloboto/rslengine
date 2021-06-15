package com.evilbas.rslengine.character;

import java.util.UUID;

public class Character {
    private String characterGuid;
    private String characterName;
    private Integer characterLevel;
    private Long characterExp;

    public String getCharacterGuid() {
        return characterGuid;
    }

    public void setCharacterGuid(String characterGuid) {
        this.characterGuid = characterGuid;
    }

    public String getCharacterName() {
        return characterName;
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
        this.characterName = characterName;
        this.characterGuid = UUID.randomUUID().toString();
        this.characterExp = 0L;
        this.characterLevel = 1;
    }

}
