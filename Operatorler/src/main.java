import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Siz de 3 adet int tipinde değişken tanımlayın. Bu değişkenleri, gerekli operotörleri
		//kullanarak karşılaştırın ve en büyük,ortanca, en küçük sayıyı bulup ekrana yazdırın
		
		Scanner scn=new Scanner(System.in);
		
		int[] sayilar=new int[3];
		int eb,ek,ort;
		eb=0;
		ek=0;
		ort=0;
		
		System.out.println("Sayıları giriniz");
		
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+". sayi=");
			sayilar[i]=scn.nextInt();
		}
		
		int ara;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(sayilar[i]>sayilar[j]) {
					ara=sayilar[i];
					sayilar[i]=sayilar[j];
					sayilar[j]=ara;
				}
			}
		}
		System.out.println("En büyük:"+sayilar[0]);
		System.out.println("Ortanca:"+sayilar[1]);
		System.out.println("En küçük"+sayilar[2]);

	}

}
