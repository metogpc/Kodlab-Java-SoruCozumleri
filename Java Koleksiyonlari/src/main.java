import java.util.LinkedList;
import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		/*
		 * Siz de LinkedList yapisini kullanarak stack(yigit) yapisini isleyen uygulamanin kodlarini yazin.(Stack yapisina son giren 
		 * eleman stack yapisindan en son cikar)
		 */
		String islemler="1-push\n"
				+ "2-pop\n"
				+ "3-peek\n"
				+ "4-Listele";
		Scanner scn=new Scanner(System.in);
		int a;

		Stack01 s=new Stack01();
		
		while(true) {
			System.out.println(islemler);
			a=scn.nextInt();
			switch(a) {
			case 1:s.push(new Integer(4));
			case 2:s.pop();
			case 3:s.peek();
			}
		}
		
	}
	
	public static Object degerAl() {
		System.out.println("Lütfen bir değer giriniz");
		Scanner scn=new Scanner(System.in);
		return scn.nextInt();
	}

}
