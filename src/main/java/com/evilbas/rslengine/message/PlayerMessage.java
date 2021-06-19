package com.evilbas.rslengine.message;

public class PlayerMessage {
    private Integer playerId;
    private String messsageId;
    private MessageType messageType;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getMesssageId() {
        return messsageId;
    }

    public void setMesssageId(String messsageId) {
        this.messsageId = messsageId;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
