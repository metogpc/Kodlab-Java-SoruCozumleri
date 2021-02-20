
public class Sekil {

	protected String isim;
	protected String renk;
	
	protected void yazdir() {
		
		System.out.println("İsim:"+ getIsim()+ " Renk"+ getRenk());
		
	}
	
	protected double alanHesapla() {
		return 0;
	}
	
	protected double cevreHesapla() {
		return 0;
	}

	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	
	
	
}
