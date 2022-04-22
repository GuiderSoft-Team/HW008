import static java.lang.Math.PI;

public class YuvarlakMasa extends Mobilya implements Daire {
    private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("[%2.f x %2.f]",yaricap,yukseklik);

    }


    @Override
    public double getYaricap() {
        return 0;
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double alanHesapla() {
        if(kapaliMi)
        {
           return Math.round((2 * PI * yaricap * yaricap) + (2 * PI * yaricap * yukseklik))
                   ;
        }else{
            return Math.round((PI * yaricap * yaricap));
        }

    }

    @Override
    public double hacimHesapla() {
        return Math.round((PI * yaricap * yaricap * yukseklik));
    }


}
