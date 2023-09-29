package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	float n1 = 4;
	float n2 = 2;

	@Test
	@DisplayName("verifica somma")
	void testSumm() {
		Calculator calculator = new Calculator(n1, n2);

		float result = calculator.summ(calculator.getN1(), calculator.getN2());
		assertEquals(6, result, "la somma deve essere 6");
	}

	@Test
	@DisplayName("verifica sottrazione")
	void testSubtract() {
		Calculator calculator = new Calculator(n1, n2);

		float result = calculator.subtract(calculator.getN1(), calculator.getN2());
		assertEquals(2, result, "la sottrazione deve essere 2");
	}

	@Test
	@DisplayName("verifica divisione")
	void testDivide() {
		Calculator calculator = new Calculator(n1, n2);

		float result = calculator.divide(calculator.getN1(), calculator.getN2());
		assertEquals(2, result, "la divisione deve essere 2");
	}

	@Test
	@DisplayName("verifica moltiplicazione")
	void testMultiply() {
		Calculator calculator = new Calculator(n1, n2);

		float result = calculator.multiply(calculator.getN1(), calculator.getN2());
		assertEquals(8, result, "la moltiplicazione deve essere 8");
	}

	@Test
	@DisplayName("verifica divisione per zero")
	void testDivideByZero() {
		Calculator calculator = new Calculator(5f, 0f);
		assertThrows(ArithmeticException.class, () -> calculator.divide(calculator.getN1(), calculator.getN2()),
				"La divisione per zero dovrebbe generare un'eccezione");
	}

}
