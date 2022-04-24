public class YuvarlakSehpa extends Mobilya implements Daire {
    private double yaricap;
    YuvarlakSehpa() {}
    YuvarlakSehpa(String aciklama, double yaricap, double yukseklik, boolean kapalimi) {
        super(aciklama, yukseklik, kapalimi);
        setYaricap(yaricap);
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap > 0 ? yaricap : 0;}
    @Override
    public double getYaricap() {
        return this.yaricap;}
    @Override
    public double alanHesapla() {
        if (super.getKapalimi()) {
            return 2 * Math.PI * yaricap * yaricap + 2 * Math.PI * yaricap * super.getYukseklik();
        }
        return Math.PI * yaricap * yaricap;
    }
    @Override
    public double hacimHesapla() {
        return Math.PI * yaricap * yaricap * super.getYukseklik();
    }
    @Override
    public String toString() {
        return String.format("cinsi=%s\nyaricap=%5.2f\nalan=%5.2f\nhacim=%5.2f",
                super.getAciklama(), yaricap, alanHesapla(), hacimHesapla());
    }
}