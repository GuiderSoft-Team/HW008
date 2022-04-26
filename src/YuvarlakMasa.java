public class YuvarlakMasa extends Mobilya implements Daire{
    private double yaricap;

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapalimi, double yaricap) {
        super(aciklama, yukseklik, kapalimi);
        this.yaricap=yaricap;
    }

    public YuvarlakMasa() {
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if(isKapalimi()==false){
            return Math.PI*yaricap*yaricap;
        }
        return (2 * Math.PI * yaricap * yaricap + 2 * Math.PI * yaricap * getYukseklik());
    }



    @Override
    public double hacimHesapla() {
        return Math.PI * yaricap * yaricap * getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s[%5.2f*%5.2f]",super.toString(),yaricap,getYukseklik());
    }
}
 /*Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};//Doğru çalışıyor mu? Neden?

        Doğru çalışmaz. Çünkü YuvarlakSehpa sınıfı Dortgen interface'inden implement edilmediği için Dortgenden
        aldığı herhangi bir davranışda yoktur-herhangi bir ortak bağıda yoktur. YuvarlakSehpa nesnesini
        En fazla casting ile dörtgene zorla dönüştürmeye çalışabiliriz. Buda zaten anlamlı olmaz.*/