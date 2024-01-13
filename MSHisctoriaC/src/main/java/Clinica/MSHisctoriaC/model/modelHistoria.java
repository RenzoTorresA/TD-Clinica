package Clinica.MSHisctoriaC.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historia")
public class modelHistoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistoria")
    private int idhistoria;

    @Column(name = "pacienteid")
    private int pacienteid;

    @Column(name = "fechacreacion")
    private Date fechacreacion;

    @Column(name = "medico")
    private String medico;

    @Column(name = "diagnostico")
    private String diagnostio;

    public int getIdhistoria() {
        return idhistoria;
    }

    public void setIdhistoria(int idhistoria) {
        this.idhistoria = idhistoria;
    }

    public int getPacienteid() {
        return pacienteid;
    }

    public void setPacienteid(int pacienteid) {
        this.pacienteid = pacienteid;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDiagnostio() {
        return diagnostio;
    }

    public void setDiagnostio(String diagnostio) {
        this.diagnostio = diagnostio;
    }

    
    

}
