package com.etown;

public class Zoo {
	static Animal [] animals;
	
	
	
	public static void main(String[] args) {
	animals = new Animal[6];
	animals[0] = new Cat();
	animals[1] = new Person();	
	animals[2] = new Lion();
	animals[3] = new Leopard();
	animals[4] = new Tiger();
	animals[5] = new Liger();
	Animal genericAnimal = animals[5];
	Liger lgr = (Liger)genericAnimal;
	lgr.setClaws(true);
	lgr.setLionPart((Lion)animals[2]);
	
	for (Animal ana : animals) {
		System.out.println(ana);
	}
	}

}
