package com.evilbas.rslengine.world;

public enum WorldSize {
	WORLD_TINY(10, "tiny"), WORLD_SMALL(50, "small"), WORLD_MEDIUM(100, "medium"), WORLD_LARGE(500, "large");

	private Integer value;
	private String name;

	private WorldSize(int size, String name) {
		this.value = size;
		this.name = name;
	}

	public Integer getValue() {
		return this.value;
	}

	public String getName() {
		return this.name;
	}
}
