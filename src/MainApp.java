public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);

        System.out.println(((Masa)mobilya1).alanHesapla());//unboxing executed
        System.out.println(((Masa)mobilya1).hacimHesapla());//unboxing executed
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.println(daire1.alanHesapla());//Daire içerisinde zaten alanHesabı() metodu oldugu için unboxing gereksiz
        System.out.println(daire1.hacimHesapla());//Daire içerisinde zaten hacimHesabı() metodu oldugu için unboxing gereksiz

       // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        // Doğru çalışmıyor çünkü YuvarlakSehpa Dortgen interface ini implemente etmiyor


    }
}
