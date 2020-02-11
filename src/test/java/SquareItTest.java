import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
	public void Squarer_NegativeSquareIsNegative(){

		double a = -10;
		double out = this.squarer.square(a);

		assertEquals(100, out, delta);

	}


	@Test
	public void Squarer_NegativeSquareIsNegative_ShouldFail(){

		double a = -10;
		double out = this.squarer.square(a);

		assertEquals(-100, out, delta);

	}

}
