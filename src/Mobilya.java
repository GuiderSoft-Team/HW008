public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapalimi;


    public Mobilya(String aciklama, double yukseklik, boolean kapalimi) {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.kapalimi = kapalimi;

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
        this.yukseklik = yukseklik < 0 ? 0 : yukseklik;
    }

    public boolean isKapalimi() {
        return kapalimi;
    }

    public void setKapalimi(boolean kapalimi) {
        this.kapalimi = kapalimi;
    }

    @Override
    public String toString() {
        return (aciklama);
    }
}
