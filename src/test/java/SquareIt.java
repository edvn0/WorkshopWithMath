import java.math.BigDecimal;

public class SquareIt {

	public SquareIt() {

	}

	public double square(Number a) {
		if (a.doubleValue() > Integer.MAX_VALUE || a.doubleValue() < Integer.MIN_VALUE) {
			return square(BigDecimal.valueOf((Double) a));
		} else {
			return a.doubleValue() * a.doubleValue();
		}
	}

	public double square(BigDecimal a) {
		return a.multiply(a).doubleValue();
	}

	public double square(final int in) {
		return in * in;
	}

	public double square(final double in) {
		return in * in;
	}
}
