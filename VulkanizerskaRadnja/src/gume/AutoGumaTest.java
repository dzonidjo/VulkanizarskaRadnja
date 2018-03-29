/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Nikola
 *
 */
public class AutoGumaTest {


	private AutoGuma a;

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a=null;
	}



	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Miselin");
		assertEquals("Miselin", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelEmptyString() {
		a.setMarkaModel("");
	}
	

	

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOd13() {
		a.setPrecnik(12);
	}
		
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOd22() {
		a.setPrecnik(23);
	}

	

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		a.setSirina(150);
		assertEquals(150, a.getSirina());
	}
			
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOd135() {
		a.setSirina(110);
	}
			
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOd355() {
		a.setSirina(400);
	}

	

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}
			
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOd25() {
		a.setVisina(20);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOd95() {
		a.setVisina(125);
	}

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		a.setMarkaModel("Miselin");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=Miselin, precnik=15, sirina=150, visina=50]", a.toString());
	}
	

	
	@Test
	public void testEqualsObjectTrue() {
		AutoGuma a1 = new AutoGuma();
			
		a1.setMarkaModel("Miselin");
		a1.setPrecnik(15);
		a1.setSirina(150);
		a1.setVisina(50);
				
		AutoGuma a2 = new AutoGuma();
				
		a2.setMarkaModel("Miselin");
		a2.setPrecnik(15);
		a2.setSirina(150);
		a2.setVisina(50);
				
		assertTrue(a1.equals(a2));
				
	}

	
	@Test
	public void testEqualsObjectFalse() {
		AutoGuma a1 = new AutoGuma();
				
		a1.setMarkaModel("Miselin");
		a1.setPrecnik(15);
		a1.setSirina(150);
		a1.setVisina(50);
			
		AutoGuma a2 = new AutoGuma();
				
		a2.setMarkaModel("Miselin");
		a2.setPrecnik(15);
		a2.setSirina(170);
		a2.setVisina(50);
		
		assertFalse(a1.equals(a2));
	}

}
