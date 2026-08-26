package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Reto {
    private int idReto;
    private Date fecha;
    private ArrayList<Equipo> listaEquipos;
    private int duracion;
    private Equipo ganador;
    private String premio;

    public Reto() {
        this.idReto = 0;
        this.fecha = new Date();
        this.listaEquipos = new ArrayList<Equipo>();
        this.duracion = 5;
        this.ganador = new Equipo();
        this.premio = "1000 USD";
    }

   
    public Reto(int idReto, Date fecha, ArrayList<Equipo> listaEquipos, int duracion, Equipo ganador, String premio) {
        this.idReto = idReto;
        this.fecha = fecha;
        this.listaEquipos = listaEquipos;
        this.duracion = duracion;
        this.ganador = ganador;
        this.premio = premio;
    }

    public int getIdReto() { return idReto; }
    public void setIdReto(int idReto) { this.idReto = idReto; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public ArrayList<Equipo> getListaEquipos() { return listaEquipos; }
    public void setListaEquipos(ArrayList<Equipo> listaEquipos) { this.listaEquipos = listaEquipos; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public Equipo getGanador() { return ganador; }
    public void setGanador(Equipo ganador) { this.ganador = ganador; }

    public String getPremio() { return premio; }
    public void setPremio(String premio) { this.premio = premio; }
}
