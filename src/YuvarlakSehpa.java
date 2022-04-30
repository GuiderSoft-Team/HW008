public class YuvarlakSehpa extends Mobilya implements Daire{
   private double yaricap;

    public YuvarlakSehpa(String aciklama, double yukseklik, double v, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
    }
    public YuvarlakSehpa() {
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
        if (isKapaliMi()){
            return Math.PI*yaricap*yaricap;
        }
        return (2*Math.PI*yaricap*yaricap)+(2*Math.PI*yaricap*getYukseklik());
        }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*getYukseklik();

    }

    @Override
    public String toString() {
        return super.toString()+String.format("%5.2fx%5.2f",yaricap,getYukseklik());
    }
}
