import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class SubTest2 {
	public void test() {
		Complex complex=new Complex();
		Complex complex1=new Complex(2,3);
		Complex result=complex1.subtract(complex);
		System.out.println(result);
		assertEquals(result.real, 2);
		assertEquals(result.img, 3);
	}

}

	