import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class withdraw {
	@Test
	public void test() {
		Account acc=new Account();
		int result=acc.withdraw(200);
		assertEquals(result,4800);
	
	}

}
