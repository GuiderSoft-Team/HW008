public class YuvarlakMasa extends Mobilya implements Daire{
    private  double yaricap;

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    public YuvarlakMasa(double yaricap) {
        this.yaricap = yaricap;
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
