import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareItTest {

	private SquareIt squareIt;

	@Before
	public void setup() {
		this.squareIt = new SquareIt();
	}

	@After
	public void destroy() {
		this.squareIt = null;
	}

	@Test
	public void TestSquare_WhatIsZero() {
		int zero = 0;
		assertEquals(zero, this.squareIt.square(zero), 10e-8);
	}

	@Test
	public void TestSquare_WhatIsNegative() {
		int minus = -10;
		double smallMinus = -0.1;
		int bigMinus = -10_000;
		int biggerMinus = -1_000_000_000;
		BigDecimal b = new BigDecimal(biggerMinus);

		assertEquals(100, this.squareIt.square(minus), 10e-6);
		assertEquals(0.01, this.squareIt.square(smallMinus), 10e-6);
		assertEquals(1e8, this.squareIt.square(bigMinus), 10e-6);
		assertEquals(1e18, this.squareIt.square(b), 10e-6);
	}

}
