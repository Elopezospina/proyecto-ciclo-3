
package beans;


public class Arrendatario {
   private int id_arrendatario;
   private String nombre_a;
   private String apellido_a;
   private String email_a;
   private int telefono_a;
   private String direccion_a;
   private String ciudad_a;

    public Arrendatario(int id_arrendatario, String nombre_a, String apellido_a, String email_a, int telefono_a, String direccion_a, String ciudad_a) {
        this.id_arrendatario = id_arrendatario;
        this.nombre_a = nombre_a;
        this.apellido_a = apellido_a;
        this.email_a = email_a;
        this.telefono_a = telefono_a;
        this.direccion_a = direccion_a;
        this.ciudad_a = ciudad_a;
    }

    public int getId_arrendatario() {
        return id_arrendatario;
    }

    public void setId_arrendatario(int id_arrendatario) {
        this.id_arrendatario = id_arrendatario;
    }

    public String getNombre_a() {
        return nombre_a;
    }

    public void setNombre_a(String nombre_a) {
        this.nombre_a = nombre_a;
    }

    public String getApellido_a() {
        return apellido_a;
    }

    public void setApellido_a(String apellido_a) {
        this.apellido_a = apellido_a;
    }

    public String getEmail_a() {
        return email_a;
    }

    public void setEmail_a(String email_a) {
        this.email_a = email_a;
    }

    public int getTelefono_a() {
        return telefono_a;
    }

    public void setTelefono_a(int telefono_a) {
        this.telefono_a = telefono_a;
    }

    public String getDireccion_a() {
        return direccion_a;
    }

    public void setDireccion_a(String direccion_a) {
        this.direccion_a = direccion_a;
    }

    public String getCiudad_a() {
        return ciudad_a;
    }

    public void setCiudad_a(String ciudad_a) {
        this.ciudad_a = ciudad_a;
    }

    @Override
    public String toString() {
        return "Arrendatario{" + "id_arrendatario=" + id_arrendatario + ", nombre_a=" + nombre_a + ", apellido_a=" + apellido_a + ", email_a=" + email_a + ", telefono_a=" + telefono_a + ", direccion_a=" + direccion_a + ", ciudad_a=" + ciudad_a + '}';
    }
 
    
   
}
