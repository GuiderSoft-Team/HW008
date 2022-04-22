public class YuvarlakMasa extends Mobilya implements Daire{

private double yariCap;

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMi, double yariCap) {
        super(aciklama, yukseklik, kapaliMi, 170, 70);
        this.yariCap = yariCap;
    }

    public YuvarlakMasa() {
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }


    @Override
    public void setyariCap(double yariCap) {

    }

    @Override
    public double getYaricap() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if(isKapaliMi()==false){
            return Math.PI*yariCap*yariCap;
        }
        return (2*Math.PI*yariCap*yariCap)+(2*Math.PI*getYukseklik());  }

    @Override
    public double hacimHesapla() {
        return Math.PI*yariCap*yariCap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+String.format("[%5.2fx%5..2f]",yariCap,getYukseklik());
    }
}
