
public class Isci {

		private String ad;
		private String soyad;
		private int maas;
		private String sehir;
		private String gorev;
		

		public Isci(String ad, String soyad, int maas, String sehir, String gorev) {
			super();
			this.ad = ad;
			this.soyad = soyad;
			this.maas = maas;
			this.sehir = sehir;
			this.gorev = gorev;
		}
		
		public String getAd() {
			return ad;
		}
		public void setAd(String ad) {
			this.ad = ad;
		}
		public int getMaas() {
			return maas;
		}
		public void setMaas(int maas) {
			this.maas = maas;
		}
		public String getSehir() {
			return sehir;
		}
		public void setSehir(String sehir) {
			this.sehir = sehir;
		}
		public String getGorev() {
			return gorev;
		}
		public void setGorev(String gorev) {
			this.gorev = gorev;
		}

		public String getSoyad() {
			return soyad;
		}

		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}

		
		

}
