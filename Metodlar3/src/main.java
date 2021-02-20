import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Bir metod tanımlayın. Bu metod, parametre olarak aldığı karakteri kullanarak 
		 * döngüer yardımıyla aşağıdaki gibi bir şekil oluştursun. Örnek olarak a harfini 
		 * aldıysa aşağıdaki gibi dikdörtgen oluştursun
		 */
		
		sekil('a');
		
	}
	
	private static void sekil(char a) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				
				if(i==0 || i==4)
					System.out.print(a);
				
				else {
					if(j==0 || j==9)
						System.out.print(a);
					else
						System.out.print(" ");
				}
					
			}
			
			System.out.println();
		}
	}

}
