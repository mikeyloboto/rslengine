package com.evilbas.rslengine.item;

import lombok.Data;

@Data
public class ItemStack {
    private Item item;
    private Integer amount;
}
