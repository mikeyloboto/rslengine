package com.evilbas.rslengine.world;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class World {
	private List<WorldTile> map;
	private WorldSize size;
	private Integer numTiles;

	public World(WorldSize size) {
		this.size = size;
		this.map = new ArrayList<>();
	}

	public World() {
		this.map = new ArrayList<>();
	}

	public World setMap(List<WorldTile> map) {
		this.map = map;
		this.numTiles = this.map.size();
		return this;
	}

}
