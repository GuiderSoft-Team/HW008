public class Masa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;

    public Masa(String aciklama, double yukseklik, boolean kapaliMi,double genislik,double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.derinlik=derinlik;
        this.genislik=genislik;
    }

    public Masa() {
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik=genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik=derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi()==false){
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
        return String.format("%s [ %5.2f x %5.2f x %5.2f ]",super.toString(),genislik,derinlik,getYukseklik());
    }
}
