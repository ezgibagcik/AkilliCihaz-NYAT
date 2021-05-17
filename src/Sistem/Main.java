package Sistem;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
   static DatabaseConnection dbinstance = DatabaseConnection.getInstance();
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Connection c = DatabaseConnection.getConnection();
        KullanıcıKontrol uk = new KullanıcıKontrol(c);
        Islem islem=new Islem();

        int a=0;

        int sinir=0;
        String kullanici;
        String sifre;

        while(sinir<4) {
            System.out.println("Kullanici Adi: ");
            kullanici = scanner.nextLine();
            System.out.println("Parola: ");
            sifre = scanner.nextLine();

            if(uk.Kontrol(kullanici, sifre)) {
                System.out.println("Giris Basarili");
                System.out.println("*******************");
                while(a!=5){
                    islem.Secim();
                    a++;
                }
                islem.Secim();
                break;
            }
            sinir++;
        }

        if(sinir==3)
            System.out.println("Cihaz çok çalıştırıldı.");
        System.out.println("Cikis yapildi");

    }

}

