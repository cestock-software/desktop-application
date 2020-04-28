/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class Paciente {
    String rut_paciente;
    String nombre;
    String ap_paterno;
    String ap_materno;
    String direccion;
    String email;
    String nro_celular;
    String fecha_nacimiento;
    String sexo;
    String comuna;
    String nombre_familiar;
    String nro_familiar;
    String email_familiar;

    public Paciente() {
    }

    public Paciente(String rut_paciente, String nombre, String ap_paterno, String ap_materno, String direccion, String email, String nro_celular, String fecha_nacimiento, String sexo, String comuna, String nombre_familiar, String nro_familiar, String email_familiar) {
        this.rut_paciente = rut_paciente;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.direccion = direccion;
        this.email = email;
        this.nro_celular = nro_celular;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.comuna = comuna;
        this.nombre_familiar = nombre_familiar;
        this.nro_familiar = nro_familiar;
        this.email_familiar = email_familiar;
    }

    public String getRut_paciente() {
        return rut_paciente;
    }

    public void setRut_paciente(String rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNro_celular() {
        return nro_celular;
    }

    public void setNro_celular(String nro_celular) {
        this.nro_celular = nro_celular;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getNombre_familiar() {
        return nombre_familiar;
    }

    public void setNombre_familiar(String nombre_familiar) {
        this.nombre_familiar = nombre_familiar;
    }

    public String getNro_familiar() {
        return nro_familiar;
    }

    public void setNro_familiar(String nro_familiar) {
        this.nro_familiar = nro_familiar;
    }

    public String getEmail_familiar() {
        return email_familiar;
    }

    public void setEmail_familiar(String email_familiar) {
        this.email_familiar = email_familiar;
    }
    
    
}
