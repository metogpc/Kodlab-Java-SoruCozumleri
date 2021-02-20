
public class main {

	public static void main(String[] args) {
		/*
		 * Siz de tek boyutlu bir dizi tanımlayın. Bu diziyi bir metoda parametre olarak 
		 * gönderin. Metod içerisinde döngüleri kullanrak dizinin elemanlarına değer olarak, o
		 * elemanın indisinin 5 fazlasını atayın
		 */

		int[] dizi=new int[10];
		
		diziAta(dizi);
		
	}
	
	private  static void diziAta(int[] dizi) {
		
		for(int i=0;i<dizi.length;i++) {
			dizi[i]=i+5;
		}
		
		for(int a: dizi) {
			System.out.println(a);
		}
		
	}

}
