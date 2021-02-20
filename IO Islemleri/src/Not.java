
public class Not extends Ogrenci{

	private String dersAdi;
	private String not;
	
	public Not(String ogrenci_no, String ad, String soyad, String telefon, String adres, String dersAdi, String not) {
		super(ogrenci_no, ad, soyad, telefon, adres);
		this.dersAdi = dersAdi;
		this.not = not;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
	
	public String getNot() {
		return not;
	}
	
	public void setNot(String not) {
		this.not = not;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getOgrenci_no()+
				"\n"+getAd()+
				"\n"+getSoyad()+
				"\n"+getDersAdi()+
				"\n"+getNot();
	}
}
