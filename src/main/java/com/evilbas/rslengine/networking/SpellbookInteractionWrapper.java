package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.ability.Spellbook;

public class SpellbookInteractionWrapper extends ResultWrapper {
    private Spellbook spellbook;

    public Spellbook getSpellbook() {
        return spellbook;
    }

    public void setSpellbook(Spellbook spellbook) {
        this.spellbook = spellbook;
    }

}
