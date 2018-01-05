package com.acme.matrix;

public class CachedMatrixOf implements IMatrix{

	int[][] data;
	IMatrix matrix;
	
	public CachedMatrixOf(IMatrix matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public int[][] asMatrix() {
		
		if (this.data == null){
			this.data = matrix.asMatrix();
		}
		
		return this.data;
	}

}
