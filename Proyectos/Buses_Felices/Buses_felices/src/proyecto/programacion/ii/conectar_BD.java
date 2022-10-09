
package proyecto.programacion.ii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conectar_BD{
    Connection conectar = null;

    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/buses_felices","root","");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            
        }
        return conectar;
    }
    Statement nuevoStatement(){
        throw new UnsupportedOperationException ("No soportado.");
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
