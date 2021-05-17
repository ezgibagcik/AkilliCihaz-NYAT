package Sistem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class KullanıcıKontrol {
    static ArrayList<String> kullanici = new ArrayList<String>();
    static ArrayList<String> parola = new ArrayList<String>();
    public KullanıcıKontrol(Connection dbConn) {

        try {
            Statement statement = dbConn.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet resultset = statement.executeQuery(sql);
            while(resultset.next()){
                //Kullanıcı kontrol etmek istendiginde veritabanıimdaki kullanici adi ve sifre ilgili listelere eklenir
                kullanici.add(resultset.getString("user_name"));
                parola.add(resultset.getString("password"));

            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public static boolean Kontrol(String name,String pass) {
        int k = 0;
        for(String i:kullanici) {
            if(i.equals(name)) {
                if(parola.get(k).equals(pass))
                    return true;

                System.out.println("Sifre hatali");
                return false;
            }
            k++;
        }
        System.out.println("Kullanici kayitli degil");
        return false;
    }
}
