/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class RecetaMedica {
    private int id_receta_medica;
    private int id_atencion_medica;

    public RecetaMedica() {
    }

    public RecetaMedica(int id_receta_medica, int id_atencion_medica) {
        this.id_receta_medica = id_receta_medica;
        this.id_atencion_medica = id_atencion_medica;
    }

    public int getId_receta_medica() {
        return id_receta_medica;
    }

    public void setId_receta_medica(int id_receta_medica) {
        this.id_receta_medica = id_receta_medica;
    }

    public int getId_atencion_medica() {
        return id_atencion_medica;
    }

    public void setId_atencion_medica(int id_atencion_medica) {
        this.id_atencion_medica = id_atencion_medica;
    }
    
}
