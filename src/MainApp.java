public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1 = new Masa("Ahşap Masa", 120, 60, 70, false);
        System.out.println(mobilya1);
        System.out.println(((Masa) mobilya1).alanHesapla());

        Daire daire1 = new YuvarlakSehpa("Beyaz Sehpa", 40, 40, false);
        System.out.println(daire1);
        System.out.println(((YuvarlakSehpa)daire1).alanHesapla()); //unboxin gerekli mi?
        System.out.println(((YuvarlakSehpa) daire1).hacimHesapla()); //unboxin gerekli mi?

        /*İkisinde de Unboxing gereksiztir, derleyici tarafından REDUNDANT uyarısı da veriliyor. Çünkü;
        * Daire interface'in de alanHesapla() ve hacimHesapla() metotları bulunmakta ve
        * YuvarlakSehpa tipindeki nesnem tarafından Override edilmiştir. */

        Dortgen[] mobilyalar = new Dortgen[]{new Sehpa(), new Masa()};
        // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};//Doğru çalışıyor mu? Neden?

        /* 18. kod satırı doğru çalışmıyor. Çünkü;
        Üst sınıflar/interface'ler alt sınıf örneklerine referans olabilirler.
        Dörtgen interface'i kendisini implemente etmeyen YuvarlakSehpa sınıfının referansı olamaz.*/
    }
}
