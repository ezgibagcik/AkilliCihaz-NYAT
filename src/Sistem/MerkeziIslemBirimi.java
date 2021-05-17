package Sistem;

public class MerkeziIslemBirimi {

    private int temp;

    SubjectClass s = new SubjectClass();
    Observerclass o = new Observerclass();

    public MerkeziIslemBirimi() {
        s.attach(o);
    }

    SicaklikAlgilayici sa = new SicaklikAlgilayici();
    Eyleyici ey = new Eyleyici();

    public int SıcaklıkGetir() {
        if(temp == 0)
            temp = sa.SicaklikGetir();
        return temp;
    }

    public void SogutucuAc() {
        String mesaj = "Sogutucu Acildi";
        temp = ey.SogutucuAc(temp);
        s.notify(mesaj);
    }

    public void SogutucuKapa() {
        String mesaj = "Sogutucu Kapatildi";
        temp = ey.SogutucuKapa(temp);
        s.notify(mesaj);
    }
}
