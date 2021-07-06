package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.creature.Encounter;

public class CombatResultWrapper {

    private Encounter encounter;
    private boolean finished;
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
