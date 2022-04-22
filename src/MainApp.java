public class MainApp {
        public static void main(String[] args) {
            //TODO: Lütfen task.txt dosyasını okuyup, gereğini yapını

            Mobilya mobilya1=new Masa("Ahşap Masa",60,false,170,70);
            System.out.println(mobilya1);
            System.out.println(((Masa)mobilya1).alanHesapla());
            System.out.println(((Masa)mobilya1).hacimHesapla());

            System.out.println("=".repeat(215));

            Daire daire=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
            System.out.println(daire);
            System.out.println(((YuvarlakSehpa)daire).alanHesapla());
            System.out.println(((YuvarlakSehpa)daire).hacimHesapla());



        /*Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};

        not:çalışmadı
        çünkü :Masa ve Sehpa sınıfları Dortgen İnterface ne imlementli
        fakat YuvarlakSehpa ise Daire İnterface imlementli olduğu için
*/
        }


}
