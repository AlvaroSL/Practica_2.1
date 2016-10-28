import static org.junit.Assert.*;

import org.junit.Test;

import Suma.Suma;

public class TestSuma {

	@Test
	public void testSum2Num(){
		assertEquals(6, Suma.sum(2,4));
	}
	
	@Test
	public void testSumaCero(){
		assertEquals(4, Suma.sum(4,0));
		assertEquals(4, Suma.sum(0,4));

	}
	
	@Test
	public void testSuma3Num(){
		assertEquals(12, Suma.sum(8,3,1));
	}
	
	
}
