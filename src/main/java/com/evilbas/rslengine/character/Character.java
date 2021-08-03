package com.evilbas.rslengine.character;

import java.util.UUID;

import com.evilbas.rslengine.creature.Creature;
import com.evilbas.rslengine.creature.Encounter;
import com.evilbas.rslengine.item.Inventory;
import com.evilbas.rslengine.item.ItemArmor;
import com.evilbas.rslengine.item.ItemWeapon;
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

    private ItemWeapon equippedWeapon;
    private ItemArmor equippedArmor;

    private Long mp;
    private Long maxMp;

    public Inventory getInventory() {
        if (this.inventory == null)
            inventory = new Inventory();
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

    public ItemWeapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(ItemWeapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public ItemArmor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(ItemArmor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public Long getMp() {
        return mp;
    }

    public void setMp(Long mp) {
        this.mp = mp;
    }

    public Long getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(Long maxMp) {
        this.maxMp = maxMp;
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
        recalculateMp();
    }

    private void recalculateHp() {
        this.setMaxHp(10L + (5 * characterLevel));
        this.setCurrentHp(this.getMaxHp());
    }

    private void recalculateMp() {
        this.setMaxMp((10L + (5 * characterLevel)) * 2);
        this.setMp(this.getMaxMp());
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

    public void equipWeapon(Integer slot) {
        if (this.getInventory().getItems().get(slot).getItem() instanceof ItemWeapon) {
            if (this.equippedWeapon != null) {
                this.getInventory().addItem(this.equippedWeapon);
                this.equippedWeapon = null;
            }
            this.equippedWeapon = (ItemWeapon) this.getInventory().getItems().get(slot).getItem();
            this.getInventory().getItems().remove((int) slot);
        }
    }

    public void equipArmor(Integer slot) {
        if (this.getInventory().getItems().get(slot).getItem() instanceof ItemArmor) {
            if (this.equippedArmor != null) {
                this.getInventory().addItem(this.equippedArmor);
                this.equippedArmor = null;
            }
            this.equippedArmor = (ItemArmor) this.getInventory().getItems().get(slot).getItem();
            this.getInventory().getItems().remove((int) slot);
        }
    }

}
