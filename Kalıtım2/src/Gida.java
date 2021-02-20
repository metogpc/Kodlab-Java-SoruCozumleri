
public class Gida extends Urun{

	private String tur;
	private double gramaj;
	
	public Gida(String urunAdi, double fiyat, String tur, double gramaj) {
		super(urunAdi, fiyat);
		this.tur = tur;
		this.gramaj = gramaj;
	}
	
	
}
