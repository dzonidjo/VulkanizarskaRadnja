/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Nikola
 *
 */
public class VulkanizerskaRadnjaTest {
 
 private VulkanizerskaRadnja r;
 private AutoGuma g;
 /**
  * @throws java.lang.Exception
  */
 @Before
 public void setUp() throws Exception {
  r = new VulkanizerskaRadnja();
  
  g = new AutoGuma();
  
  g.setMarkaModel("Miselin R");
  g.setPrecnik(15);
  g.setSirina(150);
  g.setVisina(50);
 }

 /**
  * @throws java.lang.Exception
  */
 @After
 public void tearDown() throws Exception {
  r = null;
  g = null;
 }

 /**
  * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
  */
 @Test
 public void testDodajGumu() {
  r.dodajGumu(g);
  assertEquals(1, r.vratiListuGuma().size());
  assertEquals(g, r.vratiListuGuma().get(0));
 }

 @Test (expected = java.lang.NullPointerException.class)
 public void testDodajGumuNull() {
  r.dodajGumu(null);
 }
 
 @Test (expected = java.lang.RuntimeException.class)
 public void testDodajGumuKojaVecPostoji() {
  
  AutoGuma g1 = new AutoGuma();
  
  g1.setMarkaModel("Miselin R");
  g1.setPrecnik(15);
  g1.setSirina(150);
  g1.setVisina(50);
  
  r.dodajGumu(g);
  r.dodajGumu(g1);
 }
 
 @Test 
 public void testDodajGumuKadaNijePrazna() {
  AutoGuma g1 = new AutoGuma();
  
  g1.setMarkaModel("Miselin R");
  g1.setPrecnik(20);
  g1.setSirina(160);
  g1.setVisina(50);
  
  r.dodajGumu(g);
  r.dodajGumu(g1);
  assertEquals(2, r.vratiListuGuma().size());
  assertEquals(g1, r.vratiListuGuma().get(0));
 }
 
 
 /**
  * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
  */
 @Test
 public void testPronadjiGumuKadJeNull() {
  r.pronadjiGumu(null);
 }
 
 @Test 
 public void testPronadjiGumuKadJeNemaUListi() {
  AutoGuma g1 = new AutoGuma();
  
  g1.setMarkaModel("Miselin R1");
  g1.setPrecnik(15);
  g1.setSirina(150);
  g1.setVisina(50);
  
  r.dodajGumu(g);
  r.dodajGumu(g1);
  
  assertEquals(0, r.pronadjiGumu("Miselin").size());
 }
 
 @Test
 public void testPronadjiGumuRazlicitihDimenzija() {
  AutoGuma g1 = new AutoGuma();
  g1.setMarkaModel("Miselin R15");
  g1.setPrecnik(15);
  g1.setSirina(150);
  g1.setVisina(50);
  
  AutoGuma g2 = new AutoGuma();
  g2.setMarkaModel("Miselin R");
  g2.setPrecnik(15);
  g2.setSirina(140);
  g2.setVisina(50);
  
  r.dodajGumu(g);
  r.dodajGumu(g1);
  r.dodajGumu(g2);
  
  assertEquals(2,r.pronadjiGumu("Miselin R").size());
 }
 
 @Test
 public void vratiListuGuma() {
  r.dodajGumu(g);
  
  assertEquals(1, r.vratiListuGuma().size());
  assertEquals(g, r.vratiListuGuma().get(0));
 }
 
 @Test
 public void testVratiListuPrazna() {
  assertEquals(0, r.vratiListuGuma().size());
 }

}