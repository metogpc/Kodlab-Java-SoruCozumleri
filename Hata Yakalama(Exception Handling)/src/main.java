import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		/*
		 * Siz de klavyeden karakterleri tek tek alıp bir diziye atan ve sadece harfleri kabul eden; karakter ve rakam 
		 * girildiğinde hata olarak algılayan ve bu hatayı, çağrıldığı yerde kontrol eden Exception türünün kodunu yazınız
		 * 
		 */
		Scanner scn=new Scanner(System.in);
		char c;
		ArrayList<Character> characterArray=new ArrayList<Character>();
		
		while(true) {
			
			c=scn.next().charAt(0);
			
			if(Character.isLetter(c))
				characterArray.add(c);
			else
				throw new Exception("Lütfen sadece harf giriniz");
			
			
		}

		
	}

}
