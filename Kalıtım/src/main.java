
public class main {

	public static void main(String[] args) {
		/*
		 * Siz de Sekil isimli bir sınıf tanımlayın. Bu sınıf içerisinde isim ve renk alanları ile bu alanları ekrana yazdıran,
		 * alanını ve çevresini hesaplayan bir metod bulunsun. Cember sınıfı bu sınıfı  miras alsın ve içerisinde yarıçap alanı
		 * bulunsun. Sekil sınıfının alan ve cevre hesabı yapan metodlarını override ederek yeniden bu metodu yazın. Dikdortgen sınıfı
		 * yine Sekil sınfını miras alsın. Bu sınıfın uzun kenar ve kısa kenar alanları bulunsun. Bu sınf da Sekil sınıfının alan ve cevre 
		 * metodlarını override etsin. Son olarak kare sınıfı tanımlayın bu sınıf Dikdortgen sınıfını miras alsın ve kenar alanı bulunsun ve
		 * Dikdortgen sınıfının metodlarını override etsin
		 */

		Cember cember=new Cember(5);
		Dikdortgen dik=new Dikdortgen(10, 3);
		Kare kare=new Kare(10);
		
		System.out.println("Karenin alanı:"+kare.alanHesapla()+" Çevre:"+kare.cevreHesapla());
		System.out.println("Dikdötgenin alanı:"+dik.alanHesapla()+" Çevre:"+dik.cevreHesapla());
		System.out.println("Cemberin alanı:"+cember.alanHesapla()+" Cevre:"+cember.cevreHesapla());

	}

}
