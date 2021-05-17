package Sistem;
import java.sql.*;

public class DatabaseConnection {
    public static Connection conn;
    private static DatabaseConnection instance ;
    private static String veritabanı = "jdbc:postgresql://localhost:5432/Sistem";
    private DatabaseConnection()
    {
        try
        {   /***** Baglanti kurulumu *****/
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sistem",
                    "postgres", "0703");
            if (conn != null)
                System.out.println("Veritabanina Baglandi!");
            else
                System.out.println("Bağlanti girisi basarisiz!");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static synchronized DatabaseConnection getInstance(){
        instance=new DatabaseConnection();
        return instance;
    }

    public static Connection getConnection() {

            Connection dbConn=null;
            try{
                Class.forName("org.postgresql.Driver");//hangi veritabanı türü ile çalışacağımızı tanımlıyoruz
                dbConn = DriverManager.getConnection(veritabanı,"postgres","0703");//veri tabanına ait host ve veritabanı adını ve veritabanına ulaşacak olan kullanıcı adı ve şifresini tanımlıyoruz
                System.out.println("-******************-");
            }catch(SQLException e) {
                System.err.println(" Hata bulundu "+e.getMessage());
            }catch(ClassNotFoundException e){
                System.err.println(" Hata bulundu "+e.getMessage());
            }
            return dbConn;
        }
}

