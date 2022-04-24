public class Sehpa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapalimi) {
        super(aciklama, yukseklik, kapalimi);


    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik=genislik>0?genislik:0;
    }
    @Override
    public double getGenislik() {
        return this.genislik;
    }
    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik=derinlik>0?derinlik:0;
    }
    @Override
    public double getDerinlik() {
        return this.derinlik;
    }
    @Override
    public double alanHesapla() {
        if(super.getKapalimi())
        {return this.getGenislik()*this.getDerinlik();}else
        {return 6*this.getGenislik()*this.getDerinlik();}
    }
    @Override
    public double hacimHesapla() {
            return this.getGenislik()*this.getDerinlik()*super.getYukseklik();
    }
    @Override
    public String toString() {
        return String.format("cinsi=%s\ngenislik=%5.2f\nderinlik=%5.2f\nyukseklik=%5.2falan=%5.2f\nhacim=%5.2f",
                super.toString(),getGenislik(),getDerinlik(),getYukseklik(),alanHesapla(),hacimHesapla());
    }


}


