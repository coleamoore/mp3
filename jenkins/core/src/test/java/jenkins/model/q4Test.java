package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class q4Test {
	
	@Test
	public void testInitialCase() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
	    String filename = "[a-z0-9_. -]+";
		assertEquals(test.idFromFilename(filename), "[a-z0-9_. -]+");
		
	}
	@Test
	public void testTilde() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test~this";
		assertEquals(test.idFromFilename(filename), "testThis");
		
	}
	
	public void testDollarSign() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test$this";
		assertEquals(test.idFromFilename(filename), "testthis");		
	}

}
