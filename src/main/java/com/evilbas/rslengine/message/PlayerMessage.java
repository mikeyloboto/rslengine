package com.evilbas.rslengine.message;

import lombok.Data;

@Data
public class PlayerMessage {
    private Integer playerId;
    private String messsageId;
    private MessageType messageType;
}
