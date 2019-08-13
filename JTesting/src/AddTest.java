import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		int result=calculator.add(50, 25);
		assertEquals(result,75);
			}

}
