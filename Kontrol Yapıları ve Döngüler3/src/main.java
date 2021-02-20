import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Uygun veri tipini kullanarak bir karakter tanımlayın. Bu herhangi bit karakter olabilir. 
		 * Örnek olarak * karakteri tanımladıysanız, anlattığımız döngüler kullanarak aşağıdaki(ters dik üçgen)
		 * gibi bir şekil oluşturun
		 */
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Lütfen bir karakter giriniz");
		
		char a=scn.next().charAt(0);
		
		sekil(a);
		
	}
	
	private static void sekil(char a) {
		
		for(int i=0;i<10;i++) {
			for(int j=i;j<10;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
