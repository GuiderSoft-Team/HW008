public class Sehpa extends Mobilya implements Dortgen {


    private double genislik;
    private double derinlik;


    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Sehpa() {
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
        if (isKapaliMi() == false) {
            return genislik * derinlik;
        } else {
            return 6 * genislik * derinlik;
        }
    }

        @Override
        public double hacimHesapla() {
            return genislik*derinlik*getYukseklik();
        }

        @Override
        public String toString () {
            return super.toString() + String.format("%5.2f x %5.2f x %5.2f",genislik,derinlik,getYukseklik());
        }
    }



