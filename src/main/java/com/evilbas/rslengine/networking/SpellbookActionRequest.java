package com.evilbas.rslengine.networking;

public class SpellbookActionRequest {
    private String guid;
    private String spell;

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
