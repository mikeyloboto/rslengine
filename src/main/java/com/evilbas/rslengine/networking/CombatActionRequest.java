package com.evilbas.rslengine.networking;

public class CombatActionRequest {
    private String guild;
    private String spell;
    private Integer targetSlot;

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Integer getTargetSlot() {
        return targetSlot;
    }

    public void setTargetSlot(Integer targetSlot) {
        this.targetSlot = targetSlot;
    }
}