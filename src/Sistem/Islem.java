package Sistem;


import java.util.Scanner;

public class Islem {
    static MerkeziIslemBirimi mib = new MerkeziIslemBirimi();
    public static void Secim() {
        Scanner sc = new Scanner(System.in);
         int secim;


        System.out.println("Lütfen 1-4 arasinda secim yapiniz");

        System.out.println("1-Sicaklik Getir");
        System.out.println("2-Sogutucu Ac");
        System.out.println("3-Sogutucu Kapa");
        System.out.println("4-Cikis");
        secim = sc.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Sicaklik: " + mib.SıcaklıkGetir());
                break;
            case 2:
                mib.SogutucuAc();
                break;
            case 3:
                mib.SogutucuKapa();
            case 4:
                System.out.println("çıkıs yapildi");
            default:
                System.out.println("Uygun rakam giriniz.");
        }

    }
}
