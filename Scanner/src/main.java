import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		/*
		 * Siz de Scanner sınıfı ile klavyeden 10 sayı alın. Girilen bu 10 sayıdan pozitif olanların
		 * ortalamasını , negatif olanların ise toplamını bularak ekrana yazdırın.
		 */
		
		int[] sayi=new int[10];
		
		System.out.println("10 adet sayı giriniz");
		
		sayiAl(sayi);
		
		sonuc(sayi);
		
		
		
	}
	
	public static void sayiAl(int[] sayi) {
		
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<sayi.length;i++) {
			sayi[i]=scn.nextInt();
		}
		
	}

	static void sonuc(int[] sayi) {
		int toplam=0;
		int sayac=0;
		int negatif=0;
		for(int a: sayi) {
			if(a>0) {
				toplam+=a;
				sayac++;
			}
			else {
				negatif+=a;
			}
		}
		
		System.out.println("Pozitif sayıların ortalaması:"+toplam/sayac);
		System.out.println("Negatif sayıların toplamı:"+negatif);
		
	}
}
