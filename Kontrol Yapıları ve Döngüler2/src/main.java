
public class main {

	public static void main(String[] args) {
		/*
		 * 20 ile 90 arasındaki asal sayıları , uygun dögüleri kullamarak nulmaya çalışın
		 */

		int sayi=20;
		
		do {
			if(asal(sayi))
				System.out.println(sayi);
			
			sayi++;
						
		}while(sayi<90);
		
	}

	private static boolean asal(int a) {
		boolean asal=true;
		
		for(int i=2;i<a;i++) {
			if(a%i==0)
				asal=false;
		}
	
		return asal;
	}
}
