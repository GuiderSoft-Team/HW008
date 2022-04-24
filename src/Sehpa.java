public class Sehpa extends Mobilya implements Dortgen {

    private  double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double genislik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);

    }

    @Override
    public String toString() {
        return String.format("%s [%.2f x %.2f x %.2f]",super.toString(), genislik, derinlik,yukseklik);
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
        this.genislik =genislik<0?0: genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik =derinlik<0?0: derinlik;
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
