

public class Sehpa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;

    public Sehpa(String aciklama,double genislik,double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setDerinlik(derinlik);
        setGenislik(genislik);
    }

    public Sehpa() {
    }

    public double getGenislik() {
        return genislik;
    }


    public void setGenislik(double genislik) {
        if (genislik>0){
            this.genislik = genislik;
        }

    }

    public double getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(double derinlik) {
        if(derinlik>0){
            this.derinlik=derinlik;
        }

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
        return derinlik*genislik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+String.format(";Genislik:%5.2f,Derinlik:%5.2f,Yükseklik:%5.2f",genislik,derinlik,getYukseklik());
    }
}





