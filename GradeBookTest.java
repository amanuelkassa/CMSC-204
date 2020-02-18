import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
 GradeBook g1;
 GradeBook g2;
	@BeforeEach
	void setUp()  {
		
	   g1=new GradeBook(5);
		g2= new GradeBook(5);
		g1.addScore(10.0);
		g1.addScore(14.0);
		g1.addScore(94.0);
		g1.addScore(33.0);
		g2.addScore(23.0);
		g2.addScore(20.0);
		g2.addScore(44.0);
	}

	


	@Test
	void testAddScore() {
		  
	       assertTrue(g1.toString().equals("10.0 14.0 94.0 33.0"));
	       assertTrue(g2.toString().equals ("23.0 20.0 44.0"));
	       
	       assertEquals(5,g1.getScoreSize());
	       assertEquals(5,g2.getScoreSize());
	}

	@Test
	void testSum() {
		
		
		assertEquals(151.0,g1.sum());
		
		assertEquals(87.0,g2.sum());
	}

	@Test
	void testMinimum() {
		
		
		assertEquals(10.0,g1.minimum());
		
		assertEquals(20.0,g2.minimum());
	}

	@Test
	void testFinalScore() {
	assertEquals(14.0, g1.finalScore(),0.001);
	assertEquals(23.0,g2.finalScore(),0.001);
	}
	@AfterEach
	void tearDown()  {
		g1=null;
		g2=null;
	}

}
