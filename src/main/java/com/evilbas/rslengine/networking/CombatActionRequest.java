package com.evilbas.rslengine.networking;

import lombok.Data;

@Data
public class CombatActionRequest {
    private String guid;
    private String spell;
    private Integer targetSlot;

}