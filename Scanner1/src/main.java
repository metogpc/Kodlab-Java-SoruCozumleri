import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de bir dizi tanımlayın ve dizinin eleman sayısını, kullancıdan girmesini isteyin.
		 *  Kullanıcın istediği uzunlukta bir dizi oluşturduktan sonra, bu tek boyutlu dizinin elemanlarını JOptionPane kullanarak
		 *  kullanıcıdan alın ve diziyi doldurun.
		 */
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Lütfen dizinin boyutunu giriniz");
		int a=scn.nextInt();
		
		int[] dizi=new int[a];
		degerAl(dizi);
		yazdir(dizi);
		
	}
	
	private static void degerAl(int[] dizi) {
		for(int i=0;i<dizi.length;i++) {
			dizi[i]=Integer.parseInt(JOptionPane.showInputDialog("Bir değer giriniz", "sayı"));
		}
	}
	
	private static void yazdir(int[] dizi) {
		for(int a: dizi)
			System.out.println(a);
	}

}
