package com.etown;

public class Person extends Animal {
	private Socks sock;

	public Socks getSock() {
		return sock;
	}

	@Override
	public String toString() {
		return "Person [sock=" + sock + ", toString()=" + super.toString() + "]";
	}

	public void setSock(Socks sockIn) {
		sock = sockIn;
	}
}
