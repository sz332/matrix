package com.acme.matrix;

import java.util.Arrays;

public class SumOfMatrix {

	final IMatrix mx;
	final int m;

	public SumOfMatrix(IMatrix mx, int m) {
		this.mx = mx;
		this.m = m;
	}

	public int intValue() {
		int[] row = mx.asMatrix()[m];
		return Arrays.stream(row).sum();
	}

}
