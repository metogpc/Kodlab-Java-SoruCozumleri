import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de 2 adet int tipinde değişken tanımlayın. Bu değişkenleri islemyap() adlı 
		 * metoda parametre olarak gönderin. Bu metodda , alınan sayılar arasındaki 5'e
		 * bölünebilen sayıları bulun ve ekrana yazdırın
		 */
		
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		islemYap(a, b);

	}
	
	private static void islemYap(int a,int b) {
		
		for(int i=a;i<b;i++) {
			if(i%5==0)
				System.out.println(i);
		}
		
	}

}
