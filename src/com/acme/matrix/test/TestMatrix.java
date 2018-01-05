package com.acme.matrix.test;

import org.junit.Test;

import com.acme.matrix.IMatrix;
import com.acme.matrix.MatrixOf;
import com.acme.matrix.MinOfMatrix;
import com.acme.matrix.SameValueGenerator;
import com.acme.matrix.SumOfMatrix;

import org.junit.Assert;

public class TestMatrix {
	
	@Test
	public void testMin(){
		IMatrix matrix = new MatrixOf(5,5, new SameValueGenerator(13));
		int actual = new MinOfMatrix(matrix, 0).intValue();
		Assert.assertEquals(13, actual);
	}

	@Test
	public void testSum(){
		IMatrix matrix = new MatrixOf(5,5, new SameValueGenerator(1));
		int actual = new SumOfMatrix(matrix, 0).intValue();
		Assert.assertEquals(5, actual);
	}
	
}
