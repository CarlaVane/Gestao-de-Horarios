/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String dia;
    private String periodo;

    @Temporal(TemporalType.TIME)
    private Date horaInicio;

    @Temporal(TemporalType.TIME)
    private Date horaFim;

    public Horario() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }

}
