
public class Kare implements IHesap{

	private int kenar;
	
	public Kare(int kenar) {
		super();
		this.kenar = kenar;
	}
	 

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return this.kenar*this.kenar;
	}
	 
	 @Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 4*this.kenar;
	}
	 
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		System.out.println("Alan:"+alanHesapla()+" Çevre:"+cevreHesapla());
	} 
}
