
public class Teknoloji extends Urun{

	private String marka;
	private int model;
	
	public Teknoloji(String urunAdi, double fiyat, String marka, int model) {
		super(urunAdi, fiyat);
		this.marka = marka;
		this.model = model;
	}
	
	
}
