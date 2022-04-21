public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1=new Masa("Ahşap Masa",60,false,120,70);
        System.out.println(mobilya1);
        System.out.println(((Masa)mobilya1).alanHesapla());
        System.out.println(((Masa)mobilya1).hacimHesapla());

        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println(((YuvarlakSehpa)daire1).alanHesapla());
        System.out.println(((YuvarlakSehpa)daire1).hacimHesapla());

       // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};
       // Doğru çalışmadı. Çünkü dizinin son üyesi new YuvarlakSehpa() Dortgen interface'ini implement etmedi.
       // Daire interface'ini implement ettiği için Dortgen dizisine üye olarak ekliyemedik
    }
}
