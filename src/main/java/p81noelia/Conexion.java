/*
 * Esta clase aplica el patrón SINGLETON
 */

package p81noelia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

//    private static final String SERVIDOR = "jdbc:mysql://localhost:3306/";
//    private static final String NOMBRE_BASE_DATOS = "p81noeliap?zeroDateTimeBehavior=CONVERT_TO_NULL";
//    private static final String USER = "root";
//    private static final String PASS = "8313";
    
    private static final String SERVIDOR = "jdbc:mysql://192.168.56.101/";
    private static final String NOMBRE_BASE_DATOS = "p81noeliap";
    private static final String USER = "noelia";
    private static final String PASS = "8313";

    private static Connection instancia = null;
    
    // Constructor privado no accesible desde otras clases
    private Conexion() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }

}
