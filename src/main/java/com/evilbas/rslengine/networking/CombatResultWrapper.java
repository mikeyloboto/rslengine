package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.creature.Encounter;

import lombok.Data;

@Data
public class CombatResultWrapper extends ResultWrapper {

    private Encounter encounter;
    private boolean finished;
}
