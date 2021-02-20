import java.util.Random;

public class main {

	public static void main(String[] args) {
		/*
		 * 3*3'lük 2 matris tanımlayın ve döngüler ile bu matrislerin içerisini istediğiniz gibi 
		 * doldurun. Daha sonra bu matrisleri çarparak bir sonuç matrisleri oluşturun.
		 */
		
		int[][] matris=new int[3][3];
		int[][] matris2=new int[3][3];
		
		doldur(matris);
		doldur(matris2);
		yazdir(matris);
		yazdir(matris2);
		
		carp(matris, matris2);
		
	}
	
	private static void doldur(int[][] matris) {
		
		Random r=new Random();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				matris[i][j]=r.nextInt(10);
			
			}
		}
		
		System.out.println("");
		
	}
	
	private static void yazdir(int[][] matris) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(matris[i][j]+" ");
			
			}
			System.out.println("");
		}	
		
		System.out.println("");
	}

	private static void carp(int[][] matris,int[][] matris2) {
		int[][] sonuc=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
					for(int k=0;k<3;k++) {
						sonuc[i][j]+=matris[j][k]*matris2[k][j];
					}
					System.out.print(sonuc[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
	}
}
