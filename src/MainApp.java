public class MainApp {
    public static void main(String[] args) {
        //TODO: Lütfen task.txt dosyasını okuyup, gereğini yapınız.
Masa mobilya1=new Masa("Ahşap Masa= ",120.0, false, 70.0,60);
        System.out.println(mobilya1);
        System.out.println(mobilya1.alanHesapla());
        System.out.println(mobilya1.hacimHesapla());

        Daire daire1;
        daire1 = new YuvarlakSehpa("sehpa",40.0,40.0,false);
        System.out.println(daire1);
        System.out.printf("%5.2f%n",daire1.alanHesapla());

        System.out.println(String.format("%5.2f",daire1.hacimHesapla()));

       // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        //yuvarlak sehpa dörtgen tarafından şmlemant edilmemiştir
    }
}
