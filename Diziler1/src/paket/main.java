package paket;

public class main {
	public static void main(String[] args) {
		/*
		 * Tek boyutlu int tipinde değer alan 4 elemanlı bir dizi oluşturun. Budizinin elemanlarının
		 * toplamını ilk elemn; elemanlarının çarpımını ikinci eleman; tek sayılarının toplamını 3.eleman;
		 * çift sayılarının toplamını ise 4. eleman olarak tekrar yapın.
		 */
		
		int[] dizi= {5,12,4,3};
		
		elemanDegis(dizi);
		
	}
	
	private static void elemanDegis(int[] dizi) {
		int toplam=0;
		int carpim=1;
		int tekToplam=0;
		int ciftToplam=0;
		
		for(int i=0;i<dizi.length;i++) {
			
			toplam+=dizi[i];
			carpim*=dizi[i];
			
			if(dizi[i]%2==1)
				tekToplam+=dizi[i];
			if(dizi[i]%2==0)
				ciftToplam+=dizi[i];
			
		}
		
		dizi[0]=toplam;
		dizi[1]=carpim;
		dizi[2]=tekToplam;
		dizi[3]=ciftToplam;
		
		for(int a: dizi)
			System.out.println(a);
		
	}
}

