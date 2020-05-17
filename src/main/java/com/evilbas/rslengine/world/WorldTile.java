package com.evilbas.rslengine.world;

public class WorldTile {
	private Integer x, z;
	private float height;
	private TileType type;
	
	public WorldTile() {
		// TODO Auto-generated constructor stub
	}

	public Integer getX() {
		return x;
	}
	public WorldTile setX(Integer x) {
		this.x = x;
		return this;
	}
	public Integer getZ() {
		return z;
	}
	public WorldTile setZ(Integer z) {
		this.z = z;
		return this;
	}
	public TileType getType() {
		return type;
	}
	public WorldTile setType(TileType type) {
		this.type = type;
		return this;
	}
	public float getHeight() {
		return height;
	}
	public WorldTile setHeight(float height) {
		this.height = height;
		return this;
	}
}
