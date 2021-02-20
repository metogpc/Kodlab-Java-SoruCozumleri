
public class Ogrenci {

	private String ogrenci_no;
	private String ad;
	private String soyad;
	private String telefon;
	private String adres;
	
	
	
	public Ogrenci(String ogrenci_no, String ad, String soyad, String telefon, String adres) {
		super();
		this.ogrenci_no = ogrenci_no;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.adres = adres;
	}
	
	public String getOgrenci_no() {
		return ogrenci_no;
	}
	public void setOgrenci_no(String ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	getOgrenci_no()+
				"\n"+getAd()+
				"\n"+getSoyad()+
				"\n"+getTelefon()+
				"\n"+getAdres()+
				"\n"+"---------";
	}
	

}
