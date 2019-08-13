import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AddTest1 {

	public void test() {
		Complex complex1=new Complex(1,1);
		Complex complex2=new Complex(2,3);
		Complex result=complex2.add(complex1);
		System.out.println(result);
		assertEquals(result.real, 3);
		assertEquals(result.img,4);
		
	}

}
