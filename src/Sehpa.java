public class Sehpa extends Mobilya implements Dortgen {

    private  double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double genislik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;

    }

    @Override
    public String toString() {
        return super.toString()+String.format("[%.2f x %.2f x %.2f]",genislik, derinlik,yukseklik);
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public double alanHesapla() {
        return genislik * derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * yukseklik;
    }
}
