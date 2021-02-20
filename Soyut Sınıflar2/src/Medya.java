
public abstract class Medya {
	
	private int cikisYil;
	private String medyaBasligi;
	private int satisAdedi;
	
	public abstract void cikis(int cikisYili);
	public abstract void baslik(String baslik);
	public abstract void satis(int satis);
	
	
	public void yazdir() {
		System.out.println(getClass().getName()+"   Başlık:"+ getMedyaBasligi()+"  Çıkış yılı"+ getCikisYil()+"   Satış:"+getSatisAdedi());
	}
	
	public int getSatisAdedi() {
		return satisAdedi;
	}
	public void setSatisAdedi(int satisAdedi) {
		this.satisAdedi = satisAdedi;
	}
	public int getCikisYil() {
		return cikisYil;
	}
	public void setCikisYil(int cikisYil) {
		this.cikisYil = cikisYil;
	}
	public String getMedyaBasligi() {
		return medyaBasligi;
	}
	public void setMedyaBasligi(String medyaBasligi) {
		this.medyaBasligi = medyaBasligi;
	}
	
	
	
	

	
}
