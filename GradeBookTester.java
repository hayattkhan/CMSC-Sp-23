import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private static GradeBook gb1;
	static GradeBook gb2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gb1=new GradeBook(5);
		gb2=new GradeBook(5);
		gb1.addScore(87.5);
		gb1.addScore(17.5);
		gb2.addScore(56.5);
		gb2.addScore(45.5);
	}

	@After
	void tearDown() throws Exception {
		gb1=null;
		gb2=null;
	}

	@Test
	void testAddScore() {
		assertTrue("",gb2.toString().equals("scores 2"));
		assertEquals(gb2.getScoreSize(),2);
		assertTrue("",gb1.toString().equals("scores 2"));
		assertEquals(gb1.getScoreSize(),2);
	}

	@Test
	void testSum() {
		assertEquals(gb1.sum(),105.0);
		assertEquals(gb2.sum(),102.0);
	}

	@Test
	void testMinimum() {
		assertEquals(gb1.minimum(),17.5);
		assertEquals(gb2.minimum(),45.5);
	}
	
	@Test
	void finalScore() {
		assertEquals(gb1.finalScore(),87.5);
		assertEquals(gb2.finalScore(),56.5);
	}

}
