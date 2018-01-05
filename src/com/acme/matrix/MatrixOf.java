package com.acme.matrix;

public class MatrixOf implements IMatrix {
	int n;
	int m;
	IDataGenerator generator;

	public MatrixOf(int n, int m, IDataGenerator generator) {
		this.n = n;
		this.m = m;
		this.generator = generator;
	}

	@Override
	public int[][] asMatrix() {

		int[][] data = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = this.generator.generate(i, j);
			}
		}

		return data;
	}

}
