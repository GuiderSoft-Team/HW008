public class Masa extends Mobilya implements Dortgen {

    double genislik;
    double derinlik;

    public Masa() {
    }

    public Masa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setDerinlik(derinlik);
        setGenislik(genislik);
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
        if(kapaliMi){
            return genislik * derinlik;
        }else {
            return 6*(genislik * derinlik);
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * yukseklik;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format("[%.2f x %.2f x %.2f]",genislik,derinlik,yukseklik);
    }
}
