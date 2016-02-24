package com.hackbulgaria.requests_executor;

public class OurCity {

	private String name;
	private static final int[][] CITY = new int[1000][1000];

	public OurCity(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		String copy = this.name;
		return copy;
	}

	private void setName(String name) {
		if (name.equals(null)) {
			throw new IllegalArgumentException("No City Name!");
		}
		else if (name.isEmpty()) {
			throw new IllegalArgumentException("No City Name!");
		}
		else {
			this.name = name;
		}
	}

	public static int[][] getCity() {
		int[][] copy = new int[CITY.length][CITY.length];
		System.arraycopy(CITY, 0, copy, 0, CITY.length);
		return copy;
	}

}
