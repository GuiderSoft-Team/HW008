public class YuvarlakMasa extends Mobilya implements Daire {

    private double yaricap;

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setYaricap(yaricap);
    }

    public YuvarlakMasa() {
    }

    @Override
    public void setYaricap(double yaricap) {
        if (yaricap > 0) this.yaricap = yaricap;

    }
    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (!isKapaliMi()) {
            return Math.round(Math.PI * Math.pow(yaricap, 2));
        }

        return Math.round(2 * Math.PI * Math.pow(yaricap, 2) + 2 * Math.PI * yaricap * getYukseklik());
    }

    @Override
    public double hacimHesapla() {
        return Math.round(Math.PI*Math.pow(yaricap,2)*getYukseklik());
    }

    @Override
    public String toString() {
        return String.format("%s  [%.2f x %.2f]",super.toString(),yaricap,getYukseklik());
    }
}
