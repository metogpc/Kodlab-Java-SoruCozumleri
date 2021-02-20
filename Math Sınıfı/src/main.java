import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de klavyeden 0 ile 180 arasında bir açı girilen ve bu açının sin,cos,tan,cot,sec ve cosec değerlerini hesaplayan uygulamanın
		 * kodunu yazınız.
		 */
		
		int aci;
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Lütfen bir açı değeri giriniz");
		aci=scn.nextInt();
		
		System.out.println("Sin:"+Math.sin(Math.toRadians(aci)));
		System.out.println("Cos:"+Math.cos(Math.toRadians(aci)));
		System.out.println("Tan:"+Math.tan(Math.toRadians(aci)));
		System.out.println("Cot:"+Math.cos(Math.toRadians(aci))/Math.sin(Math.toRadians(aci)));
		System.out.println("Sec:"+1/Math.cos(Math.toRadians(aci)));
		System.out.println("Cosec:"+1/Math.sin(Math.toRadians(aci)));


		

	}

}
