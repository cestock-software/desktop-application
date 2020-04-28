/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class CarnetPaciente {
    String rut_paciente;
    String sector;
    String prevision;
    String grupo_sanguineo;
    String cesfam;

    public CarnetPaciente() {
    }

    public CarnetPaciente(String rut_paciente, String sector, String prevision, String grupo_sanguineo, String cesfam) {
        this.rut_paciente = rut_paciente;
        this.sector = sector;
        this.prevision = prevision;
        this.grupo_sanguineo = grupo_sanguineo;
        this.cesfam = cesfam;
    }

    public String getRut_paciente() {
        return rut_paciente;
    }

    public void setRut_paciente(String rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public String getCesfam() {
        return cesfam;
    }

    public void setCesfam(String cesfam) {
        this.cesfam = cesfam;
    }
    
    
}
