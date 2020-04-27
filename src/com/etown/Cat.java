package com.etown;

public class Cat extends Animal {
	private boolean claws;

	public boolean isClaws() {
		return claws;
	}

	public void setClaws(boolean clawsIn) {
		claws = clawsIn;
	}

	@Override
	public String toString() {
		return "Cat [claws=" + claws + ", toString()=" + super.toString() + "]";
	}
	
	
}
