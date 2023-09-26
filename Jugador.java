public class Jugador {
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int lanzamientos;



    protected String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public int getFaltas() {
        return faltas;
    }
    
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public int getGolesDirectos() {
        return golesDirectos;
    }
    
    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }
    
    public int getLanzamientos() {
        return lanzamientos;
    }
    
    public void setLanzamientos(int lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    
}