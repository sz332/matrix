package com.acme.matrix;

import java.util.Arrays;

public class MinOfMatrix {
	
	final IMatrix mx;
	final int m;
	
	public MinOfMatrix(IMatrix mx, int m){
		this.mx = mx;
		this.m = m;
	}
	
	public int intValue(){
		int[] row = mx.asMatrix()[m];
		return Arrays.stream(row).max().getAsInt();
	}

}
