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

}
