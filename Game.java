package modelo;

public class Juego {
    private int idJuego;
    private String nombre;
    private String tipo;
    private int niveles;
    private int jugadores;
    private String meta;

    
    public Juego() {
        this.idJuego = 0;
        this.nombre = "Juego" + this.idJuego;
        this.tipo = "Estrategia";
        this.niveles = 1;
        this.jugadores = 5;
        this.meta = "Superar la puntuación máxima";
    }


    public Juego(int idJuego, String nombre, String tipo, int niveles, int jugadores, String meta) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.tipo = tipo;
        this.niveles = niveles;
        this.jugadores = jugadores;
        this.meta = meta;
    }

    
    public int getIdJuego() { return idJuego; }
    public void setIdJuego(int idJuego) { this.idJuego = idJuego; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNiveles() { return niveles; }
    public void setNiveles(int niveles) { this.niveles = niveles; }

    public int getJugadores() { return jugadores; }
    public void setJugadores(int jugadores) { this.jugadores = jugadores; }

    public String getMeta() { return meta; }
    public void setMeta(String meta) { this.meta = meta; }
}
