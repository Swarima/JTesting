import static org.junit.Assert.*;

import org.junit.Test;

public class deposit {

	@Test
	public void test() {
		Account acc=new Account();
		int result=acc.deposit(200);
		assertEquals(result,5200);
	}

}
