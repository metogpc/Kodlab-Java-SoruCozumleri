import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5 adet int tipinde değişken tanımlayın. Bu değşkenlerim çift sayı olup olmadığını
		 * gerekli operatörü kullanarak kontrol edin. eğer çift ise ekrana yazdırın
		 */
		Scanner scn=new Scanner(System.in);
		
		int[] sayi=new int[5];
		
		System.out.println("Lütfen sayıları giriniz");
		
		for(int i=0;i<5;i++) {
			sayi[i]=scn.nextInt();
		}
		
		System.out.println("Çift sayılar");
		
		for(int b: sayi) {
			if(b%2==0) {
				System.out.println(b);
			}
		}
	}

}
