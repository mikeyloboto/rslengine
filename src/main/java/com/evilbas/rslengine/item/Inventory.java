package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Inventory {
    private List<ItemStack> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        boolean found = false;
        for (ItemStack i : this.items) {
            if (i.getItem().getName().equals(item.getName())) {
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
