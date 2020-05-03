/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class MedicamentoRecetado {
    private int id_medicamento_recetado;
    private int id_medicamento;
    private int id_receta_medica;
    private String duracion;
    private String frecuencia;
    private int cantidad_recetada;

    public MedicamentoRecetado() {
    }

    public MedicamentoRecetado(int id_medicamento_recetado, int id_medicamento, int id_receta_medica, String duracion, String frecuencia, int cantidad_recetada) {
        this.id_medicamento_recetado = id_medicamento_recetado;
        this.id_medicamento = id_medicamento;
        this.id_receta_medica = id_receta_medica;
        this.duracion = duracion;
        this.frecuencia = frecuencia;
        this.cantidad_recetada = cantidad_recetada;
    }

    public int getId_medicamento_recetado() {
        return id_medicamento_recetado;
    }

    public void setId_medicamento_recetado(int id_medicamento_recetado) {
        this.id_medicamento_recetado = id_medicamento_recetado;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public int getId_receta_medica() {
        return id_receta_medica;
    }

    public void setId_receta_medica(int id_receta_medica) {
        this.id_receta_medica = id_receta_medica;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getCantidad_recetada() {
        return cantidad_recetada;
    }

    public void setCantidad_recetada(int cantidad_recetada) {
        this.cantidad_recetada = cantidad_recetada;
    }
    
    
}
