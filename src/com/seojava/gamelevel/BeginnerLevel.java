package com.seojava.gamelevel;

public  class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("불가능합니다. 레벨을 더 올려주세요.");

		
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("불가능합니다. 레벨을 더 올려주세요.");

		
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("######## 초보자 레벨입니다. ######## ");
		
	}

}
