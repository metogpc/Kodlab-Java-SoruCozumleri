
public class Ucgen implements IHesap{

	private int uzunluk;
	private int kenar;
	
	public Ucgen(int uzunluk, int kenar) {
		super();
		this.uzunluk = uzunluk;
		this.kenar = kenar;
	}
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return (uzunluk*kenar)/2;
	}
	
	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 3*kenar;
	}
	
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		System.out.println("Alan:"+alanHesapla()+" Çevre:"+cevreHesapla());
	} 
}
