
public class Film extends Medya{
	
	@Override
	public void cikis(int cikisYili) {
		// TODO Auto-generated method stub
		setCikisYil(cikisYili);
		
	}
	
	@Override
	public void satis(int satis) {
		// TODO Auto-generated method stub
		setSatisAdedi(satis);
	}
	
	@Override
	public void baslik(String baslik) {
		// TODO Auto-generated method stub
		setMedyaBasligi(baslik);
	}
	
	
	

}
