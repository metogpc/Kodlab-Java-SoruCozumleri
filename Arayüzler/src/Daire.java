
public class Daire implements IHesap{

	private double r;

	public Daire(double r) {
		super();
		this.r = r;
	}
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	
	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}
	
	
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		System.out.println("Alan:"+alanHesapla()+" Çevre:"+cevreHesapla());
	} 
	
}
