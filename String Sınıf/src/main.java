
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de klavyeden girilen metnin polindrome olup olamdığını  kontrol eden;polindrome ise metni büyük harflerle ekrana 
		 * yazan değil ise metni küçük harflerle ekrana yazan uygulamanın kodlarını yazınız.
		 */
		
		String a;
		
		while(true) {
			a=girdi();
			cikti(polindrome(a),a);
		}


		
		
	}
	
	private static boolean polindrome(String metin) {
		String ters=metin;
		ters=new StringBuilder(metin).reverse().toString();
		
		boolean a=false;
		if(metin.equals(ters))
			a=true;
			
		return a;
	}
	
	private static void cikti(boolean a,String metin) {
		if(a)
			System.out.println(metin.toUpperCase());
		else
			System.out.println(metin.toLowerCase());
	}
	
	private static String girdi() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Lütfen bir metin giriniz");
		return scn.nextLine();
	}
	
	

}
