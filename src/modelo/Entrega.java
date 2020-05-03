/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class Entrega {

    private int id_entrega_medicamento;
    private String fecha_entrega;
    private String fecha_proxima_entrega;
    private String nombre_farmaceutico;

    public Entrega() {
    }

    public Entrega(int id_entrega_medicamento, String fecha_entrega, String fecha_proxima_entrega, String nombre_farmaceutico) {
        this.id_entrega_medicamento = id_entrega_medicamento;
        this.fecha_entrega = fecha_entrega;
        this.fecha_proxima_entrega = fecha_proxima_entrega;
        this.nombre_farmaceutico = nombre_farmaceutico;
    }

    public int getId_entrega_medicamento() {
        return id_entrega_medicamento;
    }

    public void setId_entrega_medicamento(int id_entrega_medicamento) {
        this.id_entrega_medicamento = id_entrega_medicamento;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getFecha_proxima_entrega() {
        return fecha_proxima_entrega;
    }

    public void setFecha_proxima_entrega(String fecha_proxima_entrega) {
        this.fecha_proxima_entrega = fecha_proxima_entrega;
    }

    public String getNombre_farmaceutico() {
        return nombre_farmaceutico;
    }

    public void setNombre_farmaceutico(String nombre_farmaceutico) {
        this.nombre_farmaceutico = nombre_farmaceutico;
    }
       
    
}
