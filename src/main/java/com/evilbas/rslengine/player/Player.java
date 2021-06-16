package com.evilbas.rslengine.player;

import java.util.List;

public class Player {
    private Integer playerId;
    private Long playerDiscId;

    private String currentCharacter;
    private List<Character> characters;

    public Player(Long playerDiscId) {
        this.playerDiscId = playerDiscId;
    }

    public Player() {
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Long getPlayerDiscId() {
        return playerDiscId;
    }

    public void setPlayerDiscId(Long playerDiscId) {
        this.playerDiscId = playerDiscId;
    }

    public String getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(String currentCharacter) {
        this.currentCharacter = currentCharacter;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

}
