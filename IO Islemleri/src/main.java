import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Siz de klavyeden girilecek ogrenci bilgilerini ogrenci.txt isimli dosyada ve ogrenci not bilgilerini not.txt
		 *  isimli dosyada saklayan; ogrenci bilgileri degistirildiginde not.txt icerisindeki ogrenci bilgilerini de duzenleyen
		 *  uygulamanin kodlarini yaziniz.(ogrenci.txt ogrenci no,isim,soyisim,telefon,adres bilgilerini icerecek; not.txt ise 
		 *  ogrenci no,isim,soyisim,der adi,ve not bilgilerini icrecek)
		 */

		File f=new File("/home/metin/Masaüstü/Ogrenci.txt");
		File f2=new File("/home/metin/Masaüstü/Not.txt");
		
		Scanner scn=new Scanner(System.in);

		
		String ogrenci_no,ad,soyad,telefon,adres,dersAdi,not;
		System.out.print("Ogrenci no:");
		ogrenci_no=scn.next();
		System.out.print("Ad:");
		ad=scn.next();
		System.out.print("Soyad:");
		soyad=scn.next();
		System.out.print("Telefon:");
		telefon=scn.next();
		System.out.print("Adres:");
		adres=scn.next();
		System.out.print("Ders adı");
		dersAdi=scn.next();
		System.out.print("Notu");
		not=scn.next();
		
		Ogrenci ogrenci=new Ogrenci(ogrenci_no, ad, soyad, telefon, adres);
		Not notu=new Not(ogrenci_no, ad, soyad, telefon, adres, dersAdi, not);

		
		
		
	}
	
	private static void bilgiYaz(Ogrenci o,Not n,File f,File f2) throws FileNotFoundException {
		
		BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream(f));
		BufferedOutputStream bf2=new BufferedOutputStream(new FileOutputStream(f2));
		
		try {
			
			bf.write(o.toString().getBytes());
			bf2.write(n.toString().getBytes());
			bf.flush();
			bf2.flush();
			bf.close();
			bf2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void BilgileriDengele(Ogrenci o,Not n,File f,File f2) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(f));
		BufferedOutputStream bf2=new BufferedOutputStream(new FileOutputStream(f2));
		
		String[] str=new String[3];

		str[0]=br.readLine();
		str[1]=br.readLine();
		str[2]=br.readLine();
		
		n.setOgrenci_no(str[0]);
		n.setAd(str[1]);
		n.setSoyad(str[2]);
		
		bf2.write(n.toString().getBytes());
		bf2.flush();
		
		bf2.close();
		
		br.close();
		
	
	}




}
