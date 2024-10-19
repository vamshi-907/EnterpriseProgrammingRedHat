package com.model;

import javax.ejb.Stateless;

@Stateless
public class Calculator implements CalculatorRemote {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}
}