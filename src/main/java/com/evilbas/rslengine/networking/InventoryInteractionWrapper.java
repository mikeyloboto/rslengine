package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.item.Inventory;

import lombok.Data;

@Data
public class InventoryInteractionWrapper extends ResultWrapper {
    private Inventory inventory;
}
