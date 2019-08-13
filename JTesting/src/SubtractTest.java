import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		int result=calculator.subtract(50, 25);
		assertEquals(result,25);
		
	}

}
