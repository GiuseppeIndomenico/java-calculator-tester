package org.java;

public class Calculator {
	
	private float n1;
	
	private float n2;
	
	public Calculator(float n1 , float n2) {
		
		setN1(n1);
		setN2(n2);
		
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float summ(float n1, float n2) {

		return n1 + n2;

	}

	public float subtract(float n1, float n2) {

		return n1 - n2;

	}

	public float divide(float n1, float n2) {
	    if (n2 == 0) {
	        throw new ArithmeticException("non è possibile fare una divisione per 0");
	    }
	    return n1 / n2;
	}


	public float multiply(float n1, float n2) {

		return n1 * n2;

	}

}
