public class Mobilya {

    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        this.aciklama = aciklama;
        this.yukseklik = yukseklik;
        this.kapaliMi = kapaliMi;
    }

    public Mobilya() {
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public boolean isKapaliMi() {
        return !kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return aciklama;
    }
}
