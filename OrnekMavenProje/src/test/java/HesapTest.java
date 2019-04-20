import org.junit.*;
import static org.junit.Assert.*;

public class HesapTest {
	//@org.junit.Test
	@Test
	public void testTopla() {
		hesap h=new hesap();
	int sonuc =h.topla(345, 453);
		assertEquals(798,sonuc);
		
		
	}
	@Test
	public void fak()
	{
		hesap fk=new hesap();
		int sonuc=fk.fak(10);
		assertEquals(3628800,sonuc);
	}
	
	@Test
	public void testCikarma() {
		hesap h=new hesap();
	int sonuc =h.cikarma(250, 35);
		assertEquals(215,sonuc);
		
		
	}
	
	@Test
	public void testCarpma() {
		hesap h=new hesap();
		int sonuc =h.carpma(10, 20);
		assertEquals(200,sonuc);
		
		
	}
	@Test
	public void testBolme() {
		hesap h=new hesap();
		double sonuc =h.bolme(100, 5);
		assertEquals(20.00,sonuc,2);
		
		
	}
	@Test
	public void testFaktoriyeSifir() {
		hesap h= new hesap();
		int sonuc=h.faktoriyel(0);
		assertEquals(1,sonuc);
	}
	
	
	
	

}
