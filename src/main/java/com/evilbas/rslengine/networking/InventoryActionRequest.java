package com.evilbas.rslengine.networking;

import lombok.Data;

@Data
public class InventoryActionRequest {
    private String guid;
    private String item;
}
