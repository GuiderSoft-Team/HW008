import static java.lang.Math.PI;

public class YuvarlakMasa extends Mobilya implements Daire {
    private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setYaricap(yaricap);
    }

    @Override
    public String toString() {
        return String.format("%s [%2.f x %2.f]",super.toString(),yaricap,yukseklik);

    }


    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap =yaricap<0?0:yaricap;
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
