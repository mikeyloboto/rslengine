package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.ability.Spellbook;

import lombok.Data;

@Data
public class SpellbookInteractionWrapper extends ResultWrapper {
    private Spellbook spellbook;
}
