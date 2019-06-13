package com.medipol.yazilimaraclari.RestAPIOrnek;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.medipol.yazilimaraclari.RestAPIOrnek.OgrenciRESTAPI.Ogrenci;

import static org.junit.Assert.*;
public class ProjeTest {
	private static List<Ogrenci> ogrenciListesi  =new ArrayList<>();

	
	@Test
	public void OgrenciEkle()
	{
		OgrenciRESTAPI TestEkle=new OgrenciRESTAPI();
	
				
		Ogrenci sonuc=TestEkle.ekle(new Ogrenci("Ayse",21));
		
		assertEquals("Ayse",21,sonuc);
		
	

}
}