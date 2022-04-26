public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1 = new Masa("Ahşap Masa", 60, false, 120, 70);
        System.out.println(mobilya1);

        System.out.println(((Masa) mobilya1).alanHesapla()); //Unboxing gerekli çünkü bir atasınıf kendinden türetilen alt sınıfların nesnelerine referans olabilir. Ama erişim kısıtlı olacağı için unboxing yapılır.
        System.out.println(((Masa) mobilya1).hacimHesapla());

        Daire daire1 = new YuvarlakSehpa("Beyaz Sehpa", 40, false, 40);
        System.out.println(daire1);
        System.out.println(daire1.alanHesapla()); //unboxing gerekli değil.
        System.out.println(daire1.hacimHesapla());//unboxing gerekli değil
        //unboxing gerekli değil. Çünkü bir ata sınıf ve alt sınıf ilişkisi söz konusu değil.Daire zaten Yuvarlak sehpa sınıfının arayüzü ortada kısıtlı bir erişim yok.
        // Daire koyduğu kuralların implemente edilmek şartıyla uygulmasına izin veriyor. Yazmasada Public bir erişim sözkonusudur. Erişim kısıtlaması yoktur.

//        Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};

//        - Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};//Doğru çalışıyor mu? Neden?
//        Doğru çalışmaz çünkü YuvarlakSehpa sınıfı Dortgen interface'inden implement edilmediği ve Daireden implemente edildiği için Dortgenden
//        aldığı herhangi bir davranış yoktur-herhangi bir ortak bağıda yoktur. YuvarlakSehpa nesnesini
//        En fazla casting ile dörtgene zorla dönüştürmeye çalışabiliriz. Buda zaten anlamlı olmaz.

    }
}
