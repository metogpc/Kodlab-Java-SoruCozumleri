
public class Dikdortgen implements IHesap{

	private int kisaKenar;
	private int uzunKenar;
	
	public Dikdortgen(int kisaKenar, int uzunKenar) {
		super();
		this.kisaKenar = kisaKenar;
		this.uzunKenar = uzunKenar;
	}
	
	 @Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return this.uzunKenar*this.kisaKenar;
	}
	 
	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*(kisaKenar+uzunKenar);
	}
	
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		System.out.println("Alan:"+alanHesapla()+" Çevre:"+cevreHesapla());
	} 
	
}
