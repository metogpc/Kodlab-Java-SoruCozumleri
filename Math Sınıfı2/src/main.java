import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Sayfa 355 de ki işlemin yapılması
		 */
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Bir x degeri giriniz:");
		int x=scn.nextInt();
		
		if(x>0)
			System.out.println(islem1(x));
		else
			System.out.println(islem2(x));
		
		
	}
	
	private static double islem1(int x) {
		return Math.pow(x, 4)*Math.pow(x, Math.sin(Math.toRadians(x)))*Math.pow(x, 2/3);
	}
	
	private static double islem2(int x) {
		return Math.abs(Math.log(x)+1/Math.cos(Math.toRadians(x)));
	}
}
