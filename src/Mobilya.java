public class Mobilya {
    String aciklama;
    double yukseklik;
    boolean kapaliMi;

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.kapaliMi = kapaliMi;
    }

    public Mobilya() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik>0) this.yukseklik=yukseklik;
    }

    @Override
    public String toString() {
        return aciklama;
    }
}
