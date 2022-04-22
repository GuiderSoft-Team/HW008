public class YuvarlakMasa extends Mobilya implements Daire{

    private double yaricap;

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    public YuvarlakMasa() {
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
        return String.format("%s [ %5.2f x %5.2f ]",super.toString(),yaricap,getYukseklik());
    }
}
