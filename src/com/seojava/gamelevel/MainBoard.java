package com.seojava.gamelevel;

import java.util.Iterator;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		
		player.play(1);
		// 배열 객체로 생성.
		PlayerLevel[] level = new PlayerLevel[2];
		level[0] = new AdvancedLevel();
		level[1] = new AdvancedLevel();
		
		//AdvancedLevel advancedLevel = new AdvancedLevel();
		
		//부모 클래스로 인스턴스 생성.
		PlayerLevel ad = new SuperLevel();
		
		for (PlayerLevel pl : level) {
			player.upgradeLevel(pl);
			player.play(2);
		}
		
		String str = new String();
		
//		player.upgradeLevel(ad);
//		player.upgradeLevel(level[0]);
//		player.play(2);
		
//		SuperLevel superLevel = new SuperLevel();
//		player.upgradeLevel(superLevel);
//		player.upgradeLevel(level[1]);
//		player.play(3);
	}
}
