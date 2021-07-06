package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.creature.Encounter;

public class CombatResultWrapper extends ResultWrapper {

    private Encounter encounter;
    private boolean finished;

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}
