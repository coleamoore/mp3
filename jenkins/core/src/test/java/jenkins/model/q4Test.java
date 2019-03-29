package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class q4Test {
	
	@Test
	public void testTilde() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test~this";
		assertEquals(test.idFromFilename(filename), "testThis");
		
	}
	
	@Test
	public void testDollarSignExclamation() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test$0021";
		assertEquals(test.idFromFilename(filename), "test!");		
	}
	
	@Test
	public void testDollarSign() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test$0055";
		assertEquals(test.idFromFilename(filename), "testU");		
	}

}
