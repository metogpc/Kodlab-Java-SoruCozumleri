import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		/*
		 * JOptionPane ile klavyeden iki sayı alın. Bu sayıları bir metoda parametre olarak gönderin.Metod içerisinde de bu 
		 * sayılar arasındaki mükemmel sayıyıları bulunuz.
		 * Mukemmel sayı kendisi hariç tüm çarpanlarının toplamı kendisine eşit olan sayıdır.
		 */
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("1.Sayıyı giriniz", "Sayi"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("2.Sayıyı giriniz", "Sayi"));
		
		sayilariBul(a, b);
		

	}
	
	private static boolean mukemmelSayi(int a) {
		boolean b=false;
		int toplam=0;
		
		for(int i=1;i<a;i++) {
			if(a%i==0)
				toplam+=i;
		}
		
		if(toplam==a)
			b=true;
			
		return b;	
		
	}

	private static void sayilariBul(int a,int b) {
		
		for(int i=a+1;i<b;i++) {
			if(mukemmelSayi(i))
				System.out.println(i);
		}
		
	}
}
