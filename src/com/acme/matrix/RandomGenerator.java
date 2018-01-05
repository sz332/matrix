package com.acme.matrix;

import java.util.Random;

public class RandomGenerator implements IDataGenerator{

	Random random;
	
	public RandomGenerator() {
		this.random = new Random();
	}
	
	@Override
	public int generate(int row, int column) {
		return random.nextInt(80) + 20;
	}
	
}
