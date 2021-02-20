import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Klavyeden iki String girilsin. bu Stringlerin anagram olup olmadığını kontrol eden uygulamanın kodlarını yazınız.
		 */
		
		while(true) {
			
			if(anagram(girdi(),girdi()))
				System.out.println("Anagramdır");
			else System.out.println("Değildir");
		}

	}
	
	private static boolean anagram(String metin,String metin2) {
		boolean a=true;
		
		if(metin.length()!=metin2.length())
			return false;
		
		char[] c=new char[metin.length()];
		char[] c2=new char[metin.length()];
		
		for(int i=0;i<metin.length();i++) {
			c[i]=metin.charAt(i);
			c2[i]=metin2.charAt(i);
		}
		
		Arrays.sort(c);
		Arrays.sort(c2);
		
		
		return Arrays.equals(c, c2);
	}
	
	private static String girdi() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		return scn.nextLine();
	}

}
