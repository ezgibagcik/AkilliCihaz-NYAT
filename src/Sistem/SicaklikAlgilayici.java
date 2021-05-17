package Sistem;

import java.util.Random;

public class SicaklikAlgilayici extends SicaklikGetir{
    private int sicaklik;

    @Override
    protected int SicaklikOku() {
        Random random = new Random();
        sicaklik = random.nextInt(30)+20;
        return sicaklik;
    }

    @Override
    public int SicaklikGetir() {
        if(sicaklik <= 0)
            sicaklik = SicaklikOku();
        String m = "Ortam Sicakligi: "+sicaklik;
        return sicaklik;
    }

}
