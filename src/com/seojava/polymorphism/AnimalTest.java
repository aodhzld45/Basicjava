package com.seojava.polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
		}
}

class Human extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void human() {
		System.out.println("human()");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void tiger() {
		System.out.println("tiger()");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void eagle() {
		System.out.println("eagle()");
	}
	
}

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest animalTest = new AnimalTest();
		
		ArrayList<Animal> array_animals = new ArrayList<>();
		
		array_animals.add(new Human());
		array_animals.add(new Eagle());
		array_animals.add(new Tiger());
		
		for (Animal animal : array_animals) {
			animal.move();
		}
		
		for (int i = 0; i < array_animals.size(); i++) {
			array_animals.get(i).move();
		}
		
		// Animal[] 배열로 객체 저장해서 사용하기
		Animal[] animal_list = new Animal[3];
		
		for (int i = 0; i < array_animals.size(); i++) {
			array_animals.get(i).move();
			animal_list[i] = array_animals.get(i);
		}
		
		for (int i = 0; i < animal_list.length; i++) {
			animal_list[i].move();
		}
		
		

//		animalTest.moveAnimal(new Human());
//		animalTest.moveAnimal(new Eagle());
//		animalTest.moveAnimal(new Tiger());
	}

	public void moveAnimal(Object animal) {
		if (animal instanceof Animal) {
			Animal a = (Animal) animal;
			a.move();
			if (a instanceof Human) {
				((Human) a).human();
			}else if (a instanceof Eagle) {
				((Eagle) a).eagle();
			}else if (a instanceof Tiger) {
				((Tiger) a).tiger();
			}
		}
		
//		animal.move();
	}
	
}




