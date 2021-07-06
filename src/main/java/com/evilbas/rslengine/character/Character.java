package com.evilbas.rslengine.character;

import java.util.UUID;

import com.evilbas.rslengine.creature.Creature;
import com.evilbas.rslengine.creature.Encounter;
import com.evilbas.rslengine.item.Inventory;
import com.evilbas.rslengine.util.CombatUtil;

public class Character extends Creature {
    private String characterGuid;
    private String characterName;
    private Integer characterLevel;
    private Long characterExp;
    private Integer ownerId;
    private Encounter currentEncounter;
    private Integer skillPoints;
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

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
        this.characterName = characterName;
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

    public Integer getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(Integer skillPoints) {
        this.skillPoints = skillPoints;
    }

    public void addExperience(Long exp) {
        this.characterExp += exp;
        while (true) {
            if (this.characterExp >= CombatUtil.getExpCap(this.characterLevel)) {
                levelUp();
            } else
                break;
        }
    }

    private void levelUp() {
        this.characterExp -= CombatUtil.getExpCap(this.characterLevel);
        this.characterLevel += 1;
        if (skillPoints == null) {
            skillPoints = 0;
        }
        this.skillPoints += 1;
        recalculateHp();
    }

    private void recalculateHp() {
        this.setMaxHp(10L + (5 * characterLevel));
        this.setCurrentHp(this.getMaxHp());
    }

    public Creature getViableTarget() {
        if (this.currentEncounter == null)
            return null;
        for (Creature c : currentEncounter.getCreatures()) {
            if (c.getCurrentHp() > 0) {
                return c;
            }
        }
        return null;
    }

}
