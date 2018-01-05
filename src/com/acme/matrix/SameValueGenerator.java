package com.acme.matrix;

public class SameValueGenerator implements IDataGenerator {

	int value;

	public SameValueGenerator(int value) {
		this.value = value;
	}

	@Override
	public int generate(int row, int column) {
		return value;
	}

}
