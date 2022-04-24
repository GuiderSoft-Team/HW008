public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1 = new Masa("ahsap masa", 120, 60, 70, false);
        System.out.println(mobilya1);

        Daire daire1 = new YuvarlakSehpa("beyaz sehpa", 40, 40, false);
        System.out.println(daire1);
        Dortgen[] mobilyalar = new Dortgen[]{
                new Sehpa(),
                new Masa(),
                //(Dortgen) new YuvarlakMasa()};
        };
        //new yuvarlakMasa object'inin adresi Dortgen interface'sinde tutulamaz. Her ikisi arasinda sub-bas iliskisi yoktur.
    }
}
/* Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        - sout(mobilya1);
        - sout(mobilya1'in alanını gösteriniz);//unboxing
        - sout(mobilya1'in hacmini gösteriniz);//unboxing
        - Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        - sout(daire1);
        - sout(daire1'in alanını gösteriniz);//unboxin gerekli mi?
        - sout(daire1'in hacmini gösteriniz);//unboxing gerekli mi?
        - Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};//Doğru çalışıyor mu? Neden?*/