package om.tnsif.junitprogram;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterizeddemo {

	@ParameterizedTest
	@ValueSource(strings= {"kittu","bittu","mittu"})
	void endswithi(String str) {
		assertTrue(str.endsWith("u"));
	}
	
	
}
