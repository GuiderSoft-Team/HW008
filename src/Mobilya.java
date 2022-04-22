public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi, int i, int i1) {
        this.aciklama = aciklama;
        this.setYukseklik(yukseklik);
        this.kapaliMi = kapaliMi;
    }

    public Mobilya() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik<=0){
            yukseklik=0;
        }
        this.yukseklik = yukseklik;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return String.format("Açıklama  :  %s......=",aciklama);
    }
}
