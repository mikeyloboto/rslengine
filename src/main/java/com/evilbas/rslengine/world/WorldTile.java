package com.evilbas.rslengine.world;

import lombok.Data;

@Data
public class WorldTile {
	private Integer x, z;
	private float height;
	private TileType type;

}
