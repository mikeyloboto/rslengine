package com.evilbas.rslengine.networking;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ResultWrapper {

    private List<String> messages;

    public void addMessage(String message) {
        if (this.messages == null) {
            messages = new ArrayList<>();
        }
        this.messages.add(message);
    }
}
