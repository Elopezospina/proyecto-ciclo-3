
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection1 {
    //importar Connection para conectar con la base de datos.
  Connection connection1;
  //aqui se coloca el nombre de la base de datos
static String bd1="cliente";
//aqui se coloca el numero de puerto de mariaDB
static String port1="3306";
//nombre de usuario mariaDB
static String login1="root";
//contraseña de mariaDB
static String password1 ="admin";

    public DBConnection1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:"+this.port1+"/"+this.bd1;
            connection1= DriverManager.getConnection(url,this.login1,this.password1);
            System.out.println("Conexion establecida");
        } catch (Exception ex) {
            System.out.println("Error en la conexion");
        }
    }
    
   public Connection getConnection1(){
       return connection1;
   } 

public void desconectar1(){
    connection1= null;
}



}
