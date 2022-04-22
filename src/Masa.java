public class Masa extends Mobilya implements Dortgen{

    private double derinlik;
    private double genislik;

    public Masa(String aciklama, double yukseklik, boolean kapaliMi, double derinlik, double genislik) {
        super(aciklama, yukseklik, kapaliMi, 170, 70);
        this.derinlik = derinlik;
        this.genislik = genislik;
    }

    public Masa() {
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if(isKapaliMi()==false){
            return genislik*derinlik;
       }
        return 6*genislik*derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+String.format("[(%5.2f)x(%5.2f)x(%5.2f)]",genislik,derinlik,getYukseklik());
    }
}
