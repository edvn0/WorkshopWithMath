
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
}
