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
        boolean found = false;
        for (ItemStack i : items) {
            if (i.getItem().equals(item)) {
                i.setAmount(i.getAmount() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            ItemStack stack = new ItemStack();
            stack.setAmount(1);
            stack.setItem(item);
            items.add(stack);
        }
    }

}
