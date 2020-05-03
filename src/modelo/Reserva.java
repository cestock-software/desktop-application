/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class Reserva {
    
    private int id_reserva;
    private int id_medicamento_recetado;
    private String id_estado_reserva;
    private int cant_reservada;
    private String fecha_reserva;
    private String fecha_retiro;

    public Reserva() {
    }

    public Reserva(int id_reserva, int id_medicamento_recetado, String id_estado_reserva, int cant_reservada, String fecha_reserva, String fecha_retiro) {
        this.id_reserva = id_reserva;
        this.id_medicamento_recetado = id_medicamento_recetado;
        this.id_estado_reserva = id_estado_reserva;
        this.cant_reservada = cant_reservada;
        this.fecha_reserva = fecha_reserva;
        this.fecha_retiro = fecha_retiro;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_medicamento_recetado() {
        return id_medicamento_recetado;
    }

    public void setId_medicamento_recetado(int id_medicamento_recetado) {
        this.id_medicamento_recetado = id_medicamento_recetado;
    }

    public String getId_estado_reserva() {
        return id_estado_reserva;
    }

    public void setId_estado_reserva(String id_estado_reserva) {
        this.id_estado_reserva = id_estado_reserva;
    }

    public int getCant_reservada() {
        return cant_reservada;
    }

    public void setCant_reservada(int cant_reservada) {
        this.cant_reservada = cant_reservada;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public String getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(String fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }
   
}
