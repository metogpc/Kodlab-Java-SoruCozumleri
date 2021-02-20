
public class Dikdortgen extends Sekil{

	protected double uzunKenar;
	protected double kisaKenar;
	
	
	
	public Dikdortgen(double uzunKenar, double kisaKenar) {
		
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	
	}

	@Override
	protected double alanHesapla() {
		// TODO Auto-generated method stub
		return uzunKenar*kisaKenar;
	}
	
	@Override
	protected double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*(uzunKenar+kisaKenar);
	}

	public double getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(double uzunKenar) {
		this.uzunKenar = uzunKenar;
	}

	public double getKisaKenar() {
		return kisaKenar;
	}

	public void setKisaKenar(double kisaKenar) {
		this.kisaKenar = kisaKenar;
	}
	
	
}
