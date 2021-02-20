
public class main {

	public static void main(String[] args) {
		/*
		 * Urun isimli bir üst sınfımız olsun. Üst sınfımızda ürün adıi fiyatı gibi bilgileri bulunsun. Teknoloji , Tekstil ve
		 * Gida sınıfları bu üst sınıfı miras alsın. Tekstil sınıfında, ürün bedeni ve türü gibi özellikleri olsun. Teknoloji sınıfında
		 * marka ve model gibi özellikleri olsun. Gida sınıfının ise türü ve gramaj bilgileri bulunsun. Her sınıfın yapıcı metodu, dışarıdan 
		 * aldığı bu özellikleri sınıftaki özelliklerine aktaracak. Üst sınıfta KDV() metodu bulunacak ve bu gönderildiğinde, ekrana önce 
		 * sınıfın ismini yazdıran daha sonra fiyatı(KDV dahil ) ve sınıf özelliklerini yazdıran uygulamayı yazınız
		 */
		
		Teknoloji tek=new Teknoloji("İphone 10", 10000, "Apple", 2018);
		
		tek.KDV();
	}

}
