/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class Medicamento {
    private int codigo_medicamento;
    private String nombre_medicamento;
    private String formato;
    private String gr_ml;
    private String laboratorio;
    private int total_disponible;
    private int total_reservado;
    private int total_retirado;

    public Medicamento() {
    }

    public Medicamento(int codigo_medicamento, String nombre_medicamento, String formato, String gr_ml, String laboratorio, int total_disponible, int total_reservado, int total_retirado) {
        this.codigo_medicamento = codigo_medicamento;
        this.nombre_medicamento = nombre_medicamento;
        this.formato = formato;
        this.gr_ml = gr_ml;
        this.laboratorio = laboratorio;
        this.total_disponible = total_disponible;
        this.total_reservado = total_reservado;
        this.total_retirado = total_retirado;
    }

    public int getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(int codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getGr_ml() {
        return gr_ml;
    }

    public void setGr_ml(String gr_ml) {
        this.gr_ml = gr_ml;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getTotal_disponible() {
        return total_disponible;
    }

    public void setTotal_disponible(int total_disponible) {
        this.total_disponible = total_disponible;
    }

    public int getTotal_reservado() {
        return total_reservado;
    }

    public void setTotal_reservado(int total_reservado) {
        this.total_reservado = total_reservado;
    }

    public int getTotal_retirado() {
        return total_retirado;
    }

    public void setTotal_retirado(int total_retirado) {
        this.total_retirado = total_retirado;
    }

    
}
