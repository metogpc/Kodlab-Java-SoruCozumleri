
public abstract class Sporcu {
	
	private int maas;
	private String kulup;
	private int siralama;
	
	
	
	public Sporcu(int maas, String kulup, int siralama) {
		
		this.maas = maas;
		this.kulup = kulup;
		this.siralama = siralama;
	}



	public void bilgiAl(int maas, String kulup, int siralama) {
		this.kulup=kulup;
		this.maas=maas;
		this.siralama=siralama;
	}
	
	public void yazdir() {
		System.out.println("Dal:"+getClass().getName()+" Kulup:"+kulup+" maas:"+maas+" siralama:"+siralama);
	}
	
	
	

}
