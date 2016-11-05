import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Suma.Resta;

public class TestResta {

	@Test
	public void testResta2Num(){
		assertEquals(-2, Resta.resta(2,4));
	}
	
	@Test
	public void testRestaCero(){
		assertEquals(4, Resta.resta(4,0));
		assertEquals(-4, Resta.resta(0,4));

	}
	
	@Test
	public void testResta3Num(){
		assertEquals(4, Resta.resta(8,3,1));
	}
	
	
}
