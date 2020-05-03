/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package modelo;

public class EstadoReserva {
    private String id_estado_reserva;
    private String tipo_reserva;

    public EstadoReserva() {
    }

    public EstadoReserva(String id_estado_reserva, String tipo_reserva) {
        this.id_estado_reserva = id_estado_reserva;
        this.tipo_reserva = tipo_reserva;
    }

    public String getId_estado_reserva() {
        return id_estado_reserva;
    }

    public void setId_estado_reserva(String id_estado_reserva) {
        this.id_estado_reserva = id_estado_reserva;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }
    
    
}
