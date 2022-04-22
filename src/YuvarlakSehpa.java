import static java.lang.Math.PI;

public class YuvarlakSehpa extends Mobilya implements Daire {

    private double yaricap;

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }


    @Override
    public String toString() {
        return super.toString() + String.format("[%.2f x %.2f]", yaricap, yukseklik);

    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi) {
            return Math.round((2 * PI * yaricap * yaricap) + (2 * PI * yaricap * yukseklik))
                    ;
        } else {
            return Math.round((PI * yaricap * yaricap));
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.round((PI * yaricap * yaricap * yukseklik));
    }
}
