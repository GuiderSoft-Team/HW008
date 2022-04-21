public class YuvarlakSehpa extends Mobilya implements Daire{

    private double yaricap;

    public YuvarlakSehpa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    public YuvarlakSehpa() {
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi()==false){
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
        return super.toString()+ String.format("[ %5.2f x %5.2f ]",yaricap,getYukseklik());
    }
}
