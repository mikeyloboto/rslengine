package com.evilbas.rslengine.player;

import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class Player {
    private Integer playerId;
    @NonNull
    private Long playerDiscId;

    private String currentCharacter;
    private List<Character> characters;

}
