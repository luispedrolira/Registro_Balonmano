public class Extremo extends Jugador{
    private int pases;
    private int asistencias;


    public int getPases() {
        return pases;
    }
    public void setPases(int pases) {
        this.pases = pases;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "País: " + this.pais + "\n" +
                "Faltas: " + this.faltas + "\n" +
                "Goles directos: " + this.golesDirectos + "\n" +
                "Lanzamientos: " + this.lanzamientos + "\n" +
                "Pases: " + this.pases + "\n" +
                "Asistencias: " + this.asistencias + "\n\n";
    }
}