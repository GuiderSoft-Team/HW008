
public class Masa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;


    public Masa(String aciklama, double yukseklik, boolean kapalimi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapalimi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Masa() {
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (isKapalimi() == false) {
            return genislik * derinlik;
        }
        return 6 * genislik * derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s[%5.2f*%5.2f*%5.2f]", super.toString(), genislik, derinlik, getYukseklik());
    }
}
