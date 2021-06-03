package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AccesoJDBC {
    
    //public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    public static final String DRIVER_SQLITE = "org.sqlite.JDBC";
    
  //  public static final String DBURL_MYSQL = "jdbc:mysql://localhost/paradigmas2020?user=root&password=root";
    										
    										//aca va la direccion en donde se encuentra la base de datos
    public static final String DBURL_SQLITE = "jdbc:sqlite:C:\\SQLiteSpy_1.9.11//probando.sqlite";

    // method to create JDBC connections
    public static Connection createConnection() {
        // Use DRIVER and DBURL to create a connection
        
        Connection conexion = null;
        try {
            //Cargar clase de controlador de base de datos
            Class.forName(DRIVER_SQLITE);
            
            //DriverManager.registerDriver(new org.sqlite.JDBC());
        
            //Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(DBURL_SQLITE);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return conexion;
    }
    
}
