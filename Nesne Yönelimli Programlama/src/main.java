import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de isci adında bir sınıf tanımlayın. Bu sınıf ad,soyad,maas,sehir,gorev gibi alanlara sahip olsun.
		 * Bu sınıfın yapıcısı, aldığı parametreleri bu değişkenlere atasın. Bir de ana sınıf oluşturun. Bu sınıf içerisinde
		 * isci sınıfına ait nesne oluşturun ve parametre olaraki isci sınıfın yapıcısına bu 5 değeri de gönderin. Eğer isteseniz,
		 * bu gönderilecek değerleri kullanıcıdan alın. Daha sonra bu değerleri sırasıyla ekrana yazdırın.
		 */
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Çalışanın ad,soyad,maas,şehir ve görevini sırayla giriniz");
		
		Isci isci1=new Isci(scn.next(),scn.next() , scn.nextInt(), scn.next(), scn.next());
		
		System.out.println("Ad:"+isci1.getAd()+" Soyad:"+isci1.getSoyad()+" Maaş:"+isci1.getMaas()+" Şehir:"+isci1.getSehir()+" Görev:"+isci1.getGorev());
		
		
		
	}

}
