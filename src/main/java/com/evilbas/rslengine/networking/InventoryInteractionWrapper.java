package com.evilbas.rslengine.networking;

import com.evilbas.rslengine.item.Inventory;

public class InventoryInteractionWrapper extends ResultWrapper {
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
