
public class main {

	public static void main(String[] args) {
		/*
		 * Siz de içerisinde alan ve çevre hesaplayan metodlar bulunan bir arayüz tanımlayın. Bu, arayüzü oluşturacağınız üçgen,
		 * dikdörgen, kare ve daire sınıfları kullansın. Bu sınıflar alan ve çevrelerini bu metodlar yardımıyla hesaplayıp ekrana
		 * yazdırsın
		 */
		
		IHesap kare=new Kare(10);
		IHesap dik=new Dikdortgen(5, 10);
		IHesap ucgen=new Ucgen(10, 3);
		IHesap daire=new Daire(4);
		
		kare.yazdir();
		dik.yazdir();
		ucgen.yazdir();
		daire.yazdir();
		

	}

}
