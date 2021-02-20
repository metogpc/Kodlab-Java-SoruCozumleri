
public class Urun {

	protected String urunAdi;
	protected double fiyat;
	
	public Urun(String urunAdi, double fiyat) {
		super();
		this.urunAdi = urunAdi;
		this.fiyat = fiyat;
	}
	
	public void KDV() {
		
		fiyat+=fiyat*0.18;
		System.out.println("Ürün:"+getClass().getName()+" Fiyat(KDV dahil)"+fiyat);
		
	}
	
}
