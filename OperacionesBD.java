package test;
import beans.Arrendatario;
import connection.DBConnection1;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesBD {
    
    public static void main(String[] args) {
        actualizarArrendatario(1996, "La beba");
        ListarArrendatarios();
        
       
    }
    
    public static void actualizarArrendatario(int id_arrendatario, String nombre_a){
      //objeto que hace la conexion con la base de datos
        DBConnection1 con = new DBConnection1();
      String sql="UPDATE arrendatario SET nombre_a= '"+nombre_a+ "'WHERE id_arrendatario =" +id_arrendatario;
        try {
            // por medio de getCOnnection crear una sentencia SQL
            Statement  st =  con.getConnection1().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
        con.desconectar1();
        }
    }
    public static void ListarArrendatarios(){
    DBConnection1 con = new DBConnection1();
      String sql="SELECT * FROM arrendatario";
       try {
            // por medio de getCOnnection crear una sentencia SQL
            Statement  st =  con.getConnection1().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id_arrendatario=rs.getInt("id_arrendatario");
                String nombre_a= rs.getString("nombre_a");
                String apellido_a= rs.getString("apellido_a");
                String email_a = rs.getString("email_a");
                int telefono_a=rs.getInt("telefono_a");
                String direccion_a = rs.getString("direccion_a");
                String ciudad_a = rs.getString("ciudad_a");
                Arrendatario arrendatario = new Arrendatario(id_arrendatario, nombre_a, apellido_a, email_a, telefono_a, direccion_a, ciudad_a);
                System.out.println(arrendatario.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
        con.desconectar1();
        }
    }
}
