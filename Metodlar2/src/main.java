import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * iki adet aynı isimli metod tanımlayın(overload). Bu metodlardan birisi int tipinde
		 * iki parametre diğeri ise int tipinde 3 parametre alsın. Bu metodlar aldığı sayıları
		 * çarpıp geriye sonucu döndürsün. Daha sonra metodlara parametreleri ayrı ayrı gönderin 
		 * ve dönen sonuçları ekrana yazdırın.
		 */
		
		System.out.println(carp(21, 2));
		System.out.println(carp(12, 4, 123));

	}
	
	private static int carp(int a, int b) {
		return a*b;
	}
	
	private static int carp(int a,int b,int c) {
		return a*b*c;
	}

}
