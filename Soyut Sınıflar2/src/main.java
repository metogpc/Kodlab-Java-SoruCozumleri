
public class main {

	public static void main(String[] args) {
		
		/*
		 * İçerisinde çıkış yılı, medya başlığı ve satış adedi olan Medya isimli bir soyut sınıf tanımlayın. Bu sınıfın, soyut olan isim, yıl 
		 * ve adet isimli 3 soyut metodu olsun. Bu metodlar dışarıdan parametre alarak, bu parametreleri sınıf iççindeki değerlere
		 * aktarsın. Bu soyut sınıfı miras alan Muzik ve Film sınıfları tanımlayın. Film ve Müzik sınıfları dışarıdan bu parametreleri
		 * alsın ve nesne bilgilerini ekrana yazdırsın.
		 * 
		 */

		
		Medya muzik=new Muzik();
		
		muzik.cikis(2010);
		muzik.baslik("Mesafe");
		muzik.satis(150000);
		
		muzik.yazdir();
		
	}

}
