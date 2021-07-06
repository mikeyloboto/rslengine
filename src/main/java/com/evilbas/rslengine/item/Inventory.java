package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<ItemStack> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public List<ItemStack> getItems() {
        return items;
    }

    public void setItems(List<ItemStack> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        for (ItemStack i : items) {
            if (i.getItem().equals(item)) {
                i.setAmount(i.getAmount() + 1);
                break;
            }
        }
    }

}
