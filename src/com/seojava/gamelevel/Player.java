package com.seojava.gamelevel;

public class Player {
	private PlayerLevel level; // player가 가지는 level 변수 생성.
	
	public  Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	

}
