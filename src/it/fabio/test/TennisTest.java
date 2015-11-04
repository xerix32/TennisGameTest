package it.fabio.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisTest {

	@Test
	public void testThis(){
		assertEquals("0 is LOVE", TennisPoints.getDescription(0), TennisPoints.LOVE);
		assertEquals("0 is LOVE str", TennisPoints.getDescrStr(0), "LOVE");
		

		
	}
	
}
