public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1=new Masa("Ahşap Masa",70,false,120,60);
        System.out.println(mobilya1);
        System.out.println(((Masa)mobilya1).alanHesapla());
        System.out.println(((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println(((YuvarlakSehpa)daire1).alanHesapla());
        System.out.println(((YuvarlakSehpa)daire1).hacimHesapla());
       // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};
        //YuvarlakSehpa Daire interface'i tarafından implemente edildiği için çalışmadı.

    }
}
