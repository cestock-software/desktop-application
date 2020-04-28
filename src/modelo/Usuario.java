/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class Usuario {
    private int id_usuario;
    private String rut_usuario;
    private String contrasena;
    private String tipo_usuario;
    private int nivel_usuario;
    private String nombre_completo;

    public Usuario() {
    }

    public Usuario(int id_usuario, String rut_usuario, String contrasena, String tipo_usuario, int nivel_usuario, String nombre_completo) {
        this.id_usuario = id_usuario;
        this.rut_usuario = rut_usuario;
        this.contrasena = contrasena;
        this.tipo_usuario = tipo_usuario;
        this.nivel_usuario = nivel_usuario;
        this.nombre_completo = nombre_completo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRut_usuario() {
        return rut_usuario;
    }

    public void setRut_usuario(String rut_usuario) {
        this.rut_usuario = rut_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getNivel_usuario() {
        return nivel_usuario;
    }

    public void setNivel_usuario(int nivel_usuario) {
        this.nivel_usuario = nivel_usuario;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
 
}
