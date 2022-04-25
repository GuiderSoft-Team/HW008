public class YuvarlakSehpa extends Mobilya implements Daire {

    private double yariCap;

    public YuvarlakSehpa(String aciklama, double yukseklik, boolean kapaliMi, double yariCap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yariCap = yariCap;
    }

    public YuvarlakSehpa() {
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public void getYaricap() {

    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi() == false) {
            return Math.PI * yariCap * yariCap;
        } else {
            return Math.PI * yariCap * yariCap * getYukseklik();
        }
    }



    @Override
    public double hacimHesapla() {
        return Math.PI*yariCap*yariCap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%5.2f*%5.2f",yariCap,getYukseklik());
    }
}
