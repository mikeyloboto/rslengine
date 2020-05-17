package com.evilbas.rslengine.world;

import java.util.ArrayList;
import java.util.List;

public class World {
	private List<WorldTile> map;
	private WorldSize size;
	private Integer numTiles;
	
	public World(WorldSize size) {
		this.size = size;
		this.map = new ArrayList<>();
	}
	
	public List<WorldTile> getMap() {
		return map;
	}
	
	public World setMap(List<WorldTile> map) {
		this.map = map;
		this.numTiles = this.map.size();
		return this;
	}

	public WorldSize getSize() {
		return size;
	}
	public void setSize(WorldSize size) {
		this.size = size;
	}

	public int getEdge() {
		return this.size.getValue();
	}

	public Integer getNumTiles() {
		return numTiles;
	}

	public void setNumTiles(Integer numTiles) {
		this.numTiles = numTiles;
	}
}
