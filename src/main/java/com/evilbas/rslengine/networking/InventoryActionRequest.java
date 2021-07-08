package com.evilbas.rslengine.networking;

public class InventoryActionRequest {
    private String guid;
    private String item;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
