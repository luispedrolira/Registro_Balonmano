public class Portero extends Jugador{
    private int paradas;
    private int golesRecibidos;



    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    
    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "País: " + this.pais + "\n" +
                "Faltas: " + this.faltas + "\n" +
                "Goles directos: " + this.golesDirectos + "\n" +
                "Lanzamientos: " + this.lanzamientos + "\n" +
                "Paradas: " + this.paradas + "\n" +
                "Goles recibidos: " + this.golesRecibidos + "\n\n";
    }
}