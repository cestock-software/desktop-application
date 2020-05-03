/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class AtencionMedica {
    private int id_atencion_medica;
    private int nro_ficha;
    private String fecha_atencion_medica;
    private String nombre_medico;
    private String fecha_prox_atencion;

    public AtencionMedica() {
    }

    public AtencionMedica(int id_atencion_medica, int nro_ficha, String fecha_atencion_medica, String nombre_medico, String fecha_prox_atencion) {
        this.id_atencion_medica = id_atencion_medica;
        this.nro_ficha = nro_ficha;
        this.fecha_atencion_medica = fecha_atencion_medica;
        this.nombre_medico = nombre_medico;
        this.fecha_prox_atencion = fecha_prox_atencion;
    }

    public int getId_atencion_medica() {
        return id_atencion_medica;
    }

    public void setId_atencion_medica(int id_atencion_medica) {
        this.id_atencion_medica = id_atencion_medica;
    }

    public int getNro_ficha() {
        return nro_ficha;
    }

    public void setNro_ficha(int nro_ficha) {
        this.nro_ficha = nro_ficha;
    }

    public String getFecha_atencion_medica() {
        return fecha_atencion_medica;
    }

    public void setFecha_atencion_medica(String fecha_atencion_medica) {
        this.fecha_atencion_medica = fecha_atencion_medica;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }

    public String getFecha_prox_atencion() {
        return fecha_prox_atencion;
    }

    public void setFecha_prox_atencion(String fecha_prox_atencion) {
        this.fecha_prox_atencion = fecha_prox_atencion;
    }
    
}
