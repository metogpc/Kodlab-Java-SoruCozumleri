
public class main {

	public static void main(String[] args) {
		/*
		 * Sort() metodunu kullanmadan dizileri küçükten büyüğe doğru sıralayan bir algoritma tasarlayın
		 * ve programınızda uygulayın.
		 */
		
		int[] dizi= {12,421,21,312,4,123,45,12,532,3,6236,43};
		
		sirala(dizi);
		
		for(int a: dizi)
			System.out.println(a);
		
	}
	
	private static void sirala(int[] dizi) {
		int ara;
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi.length;j++) {
				if(dizi[j]>dizi[i]) {
					ara=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=ara;					
				}
			}
		}
	}

}
