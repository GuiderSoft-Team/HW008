public class MainApp {
    public static void main(String[] args) {


        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,70,60);
        System.out.println(mobilya1);;
        System.out.println(((Masa)mobilya1).alanHesapla());
        System.out.println(((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.println(String.format("%5.2f",daire1.alanHesapla()));//Gerekli değil
        System.out.println(String.format("%5.2f",daire1.hacimHesapla()));//Gerekli değil
        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        //YuvarlakSehpa Dortgen tarafından implement edilmediği için bu satır çalışmıyor.
    }
}
