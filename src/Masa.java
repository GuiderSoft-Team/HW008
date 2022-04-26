public class Masa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;



    public Masa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);
        setDerinlik(derinlik);

    }

    public Masa() {
    }

    @Override
    public void setGenislik(double genislik) {
        if (genislik>0) this.genislik=genislik;
    }
    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        if (derinlik>0) this.derinlik=derinlik;

    }
    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi()){
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
        return String.format("%s  [%.2f x %.2f x %.2f] ",super.toString(),genislik,derinlik,getYukseklik());
    }
}
