/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda * */
package modelo;

public class MedicamentoEntregado {

    private int id_entrega_medicamento;
    private int id_medicamento_recetado;
    private int cantidad_recetado;

    public MedicamentoEntregado() {
    }

    public MedicamentoEntregado(int id_entrega_medicamento, int id_medicamento_recetado, int cantidad_recetado) {
        this.id_entrega_medicamento = id_entrega_medicamento;
        this.id_medicamento_recetado = id_medicamento_recetado;
        this.cantidad_recetado = cantidad_recetado;
    }

    public int getId_entrega_medicamento() {
        return id_entrega_medicamento;
    }

    public void setId_entrega_medicamento(int id_entrega_medicamento) {
        this.id_entrega_medicamento = id_entrega_medicamento;
    }

    public int getId_medicamento_recetado() {
        return id_medicamento_recetado;
    }

    public void setId_medicamento_recetado(int id_medicamento_recetado) {
        this.id_medicamento_recetado = id_medicamento_recetado;
    }

    public int getCantidad_recetado() {
        return cantidad_recetado;
    }

    public void setCantidad_recetado(int cantidad_recetado) {
        this.cantidad_recetado = cantidad_recetado;
    }
}
