public class Mobilya {
   private String aciklama;
   private double yukseklik;
   private boolean kapalimi;

    Mobilya() {}
    public Mobilya(String aciklama, double yukseklik, boolean kapalimi) {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.kapalimi = kapalimi;
    }
    public String getAciklama() {
        return aciklama;
    }
    public boolean getKapalimi()
    {
        return this.kapalimi;
    }

    public double getYukseklik()
    {
        return this.yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik>0) {
            this.yukseklik = yukseklik;
        }
        this.yukseklik=0;
    }


    public String toString() {
        return aciklama;
    }
}
