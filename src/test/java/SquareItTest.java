import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareItTest {

	// -x * -x = x^2
	// x * x = x^2
	// -x * x = -x^2
	// STRING * STRING throw error
	// STRING * x throw
	// ...

	private Squarer squarer;
	private final double delta = 1e-10;

	@Before
	public void begin() {
		this.squarer = new Squarer();
	}

	@After
	public void after() {
		squarer = null;
	}

	@Test
	public void Squarer_PositiveSquareIsPositive() {
		double a = 10;
		double out = this.squarer.square(a);

		assertEquals(100, out, delta);
	}
	@Test
	public void Squarer_PositiveNegativeIsNegative() {
		double a = 10;
		double b = -10;
		double out = this.squarer.square(a,b);

		assertEquals(-100, out, delta);
	}
	@Test
	public void Squarer_PositiveNegativeIsNegativeShouldFail() {
		double a = 10;
		double b = -10;
		double out = this.squarer.square(a,b);

		assertEquals(-110, out, delta);
	}

}
