
public class hesap {
	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public int cikarma(int sayi1,int sayi2) {
		return sayi1-sayi2;
	}
	public int carpma(int sayi1,int sayi2) {
		return (sayi1*sayi2);
	}
	public double bolme(double sayi1,double sayi2) {
		return sayi1/sayi2;
	}
	public double bolme2(double sayi1,double sayi2) {
		return sayi1/sayi2;
	}
	public int fak(int sayi) {
		int sonuc=1;
		for(int i=1; i<=sayi;i++)
		{
			sonuc*=i;
		}
		return sonuc;
	}

}
