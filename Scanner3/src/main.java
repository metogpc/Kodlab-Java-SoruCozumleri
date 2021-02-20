import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Bir tahmin oyunu yapın. İlk olarak rastgele sayı belirleyin. Scanner sınıfını kullanarak klavyeden tahminleri alın.
		 * Eğer tahmininiz sayıdan büyükse , "Daha küçük bir tahmin giriniz"; eğer tahmininiz sayıdan büyükse," Daha büyük bir
		 * tahmin girin" , tahminle sayı eşitse "Tahmininiz doğru, i.adımda buldunuz " şeklinde bir mesaj gösteriniz.
		 */
		Scanner scn=new Scanner(System.in);
		
		int sayi,sayac,tahminSayi;
		boolean tahmin;
		
		System.out.println("Tahmin oyununa hoşgeldiniz");
		
		sayi=sayiAta();
		sayac=1;
		tahmin=true;
		
		System.out.println(sayi);
		
		while(tahmin) {
			
			System.out.println("Lütfen bir sayı giriniz");
			tahminSayi=scn.nextInt();
			
			yazdir(tahmin(sayi, tahminSayi), sayi, tahminSayi, sayac);
			
			if(tahmin(sayi, tahminSayi)==true)
				tahmin=false;
			
			sayac++;
		}
		

	}
	
	private static int sayiAta() {
		Random r=new Random();
		return r.nextInt(10)+1;
	}

	private static boolean tahmin(int sayi,int tahmin) {
		if(sayi==tahmin)
			return true;
		else
			return false;
	}
	
	private static void yazdir(boolean tahmin, int sayi , int tahminSayi, int sayac) {
		
		if(tahmin==true)
			System.out.println("Tebrikler..."+sayac+". denemde buldunuz");
		else {
			if(sayi<tahminSayi)
				System.out.println("Lütfen daha küçük bir sayı giriniz");
			else
				System.out.println("Lütfen daha büyük bir sayı giriniz");
		}
		
	}
}
