import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Klavyeden tek tek değer alan ve bu değer sayı olduğunda çalışmaya devam eden, sayı dışında bir karakter olduğunda önce
		 * hata mesajı yayınlayıp, daha sonra sonlanan uygulamanın kodlarını yazınız.
		 */
		
		while(kontrol()) {}
		
	
	}
	
	private static int degerAl() throws InputMismatchException {
		
		Scanner scn=new Scanner(System.in);
		
		return scn.nextInt();
	}
	
	private static boolean kontrol() {
		int x;
		boolean a=true;
		try {
			x=degerAl();
		}
		catch(Exception e) {
			System.out.println("Lütfen sayısal bir değer giriniz");
			a=false;
		}
			
		return a;
	}

}
