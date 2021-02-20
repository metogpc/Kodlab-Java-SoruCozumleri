import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de belirlediğiniz uygun int tipindeki bir sayının faktoriyelini, uygun yapılar
		 * kullanarak bulunuz
		 */

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Sayi giriniz");
		int a=scn.nextInt();
		
		System.out.println("Faktoriyeli="+f(a));
	}
	
	private static int f(int b) {
		
		if(b==1) 
			return 1;
		
		else if(b==0)
			return 1;
		
		else 
			return b*f(b-1);
		
		
	}

}
