package com.evilbas.rslengine.networking;

import java.util.ArrayList;
import java.util.List;

public class ResultWrapper {

    private List<String> messages;

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        if (this.messages == null) {
            messages = new ArrayList<>();
        }
        this.messages.add(message);
    }
}
