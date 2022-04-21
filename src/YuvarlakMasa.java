public class YuvarlakMasa extends Mobilya implements Daire{
    private double yariCap;
    public YuvarlakMasa(String aciklama,double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yariCap = yaricap;
    }

    public YuvarlakMasa() {
    }
    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi()==false){
            return Math.PI*yariCap*yariCap;
        }
        return (2*Math.PI*yariCap*yariCap)+(2*Math.PI*yariCap*getYukseklik());
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yariCap*yariCap*getYukseklik();
    }
    @Override
    public String toString() {
        return super.toString()+ String.format(" =%5.2f x %5.2f ",yariCap,getYukseklik());
    }
}
