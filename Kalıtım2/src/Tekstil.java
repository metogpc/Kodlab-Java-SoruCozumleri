
public class Tekstil extends Urun{
	private int urunBedeni;
	private String tur;
	
	public Tekstil(String urunAdi, double fiyat, int urunBedeni, String tur) {
		super(urunAdi, fiyat);
		this.urunBedeni = urunBedeni;
		this.tur = tur;
	}
	
	
}
