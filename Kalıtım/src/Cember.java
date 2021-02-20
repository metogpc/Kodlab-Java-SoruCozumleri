
public class Cember extends Sekil{

	private double r;
	
	
	
	public Cember(double r) {
		this.r = r;
	}

	@Override
	protected double alanHesapla() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	
	@Override
	protected double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
}
