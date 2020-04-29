/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class ReposicionMedicamento {
    private int id_reposicion;
    private int id_medicamento;
    private int cantidad_repuesta;
    private String fecha_reposicion;
    private String fecha_vencimiento;
    private String nombre_farmaceutico;

    public ReposicionMedicamento() {
    }

    public ReposicionMedicamento(int id_reposicion, int id_medicamento, int cantidad_repuesta, String fecha_reposicion, String fecha_vencimiento, String nombre_farmaceutico) {
        this.id_reposicion = id_reposicion;
        this.id_medicamento = id_medicamento;
        this.cantidad_repuesta = cantidad_repuesta;
        this.fecha_reposicion = fecha_reposicion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.nombre_farmaceutico = nombre_farmaceutico;
    }

    public int getId_reposicion() {
        return id_reposicion;
    }

    public void setId_reposicion(int id_reposicion) {
        this.id_reposicion = id_reposicion;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public int getCantidad_repuesta() {
        return cantidad_repuesta;
    }

    public void setCantidad_repuesta(int cantidad_repuesta) {
        this.cantidad_repuesta = cantidad_repuesta;
    }

    public String getFecha_reposicion() {
        return fecha_reposicion;
    }

    public void setFecha_reposicion(String fecha_reposicion) {
        this.fecha_reposicion = fecha_reposicion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getNombre_farmaceutico() {
        return nombre_farmaceutico;
    }

    public void setNombre_farmaceutico(String nombre_farmaceutico) {
        this.nombre_farmaceutico = nombre_farmaceutico;
    }

    
}
