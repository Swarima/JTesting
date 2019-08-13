import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		int result=calculator.mul(5, 5);
		assertEquals(result,25);
			}

}
