import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Registro{
    public static void main(String[] args) {
        boolean isRunning = true;
        ArrayList<Extremo> extremos = new ArrayList<Extremo>();
        ArrayList<Portero> porteros = new ArrayList<Portero>();
        while(isRunning){
            System.out.println("====== REGISTRO JUGADORES CAMPEONATO DE BALONMANO ======");
            System.out.println("1. Registrar jugador\n2. Mostrar jugadores inscritos registrados\n3. Top 3 porteros del campeonato\n4. Mejores extremos del campeonato\n5. Salir");
            System.out.print("Ingrese una opción: ");
            String opcion = System.console().readLine();

            switch(opcion){
                case "1":
                    registrarJugador(extremos, porteros);
                    break;
                case "2":
                    mostrarJugadores(extremos, porteros);
                    break;
                case "3":
                    mejoresPorteros(porteros);
                    break;
                case "4":
                    mejoresExtremos(extremos);
                    break;
                case "5":
                    isRunning = false;
                    break;
            }
        }
    }

    private static void registrarJugador(ArrayList<Extremo> extremos, ArrayList<Portero> porteros){
        System.out.println("==== NUEVO JUGADOR ====");
        System.out.println("1. Extremo\n2. Portero");
        System.out.println("¿Qué tipo de jugador desea registrar?");
        int tipoJugador = Integer.parseInt(System.console().readLine());

        if (tipoJugador == 1) {

            /**
             * Crear un nuevo extremo. Preguntale las siguientes cosas:
             * Nombre, pais, faltas, goles directos, lanzamientos, pases, asistencias
             * 
             */

            Extremo nuevoExtremo = new Extremo();
            
            System.out.print("Nombre: ");
            nuevoExtremo.setNombre(System.console().readLine());
            System.out.print("País: ");
            nuevoExtremo.setPais(System.console().readLine());
            System.out.print("Faltas: ");
            nuevoExtremo.setFaltas(Integer.parseInt(System.console().readLine()));
            System.out.print("Goles directos: ");
            nuevoExtremo.setGolesDirectos(Integer.parseInt(System.console().readLine()));
            System.out.print("Lanzamientos: ");
            nuevoExtremo.setLanzamientos(Integer.parseInt(System.console().readLine()));
            System.out.print("Pases: ");
            nuevoExtremo.setPases(Integer.parseInt(System.console().readLine()));
            System.out.print("Asistencias: ");
            nuevoExtremo.setAsistencias(Integer.parseInt(System.console().readLine()));
            
            try {
                TimeUnit.SECONDS.sleep(3);
                extremos.add(nuevoExtremo);
                System.out.println("Jugador registrado con éxito!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Error al registrar jugador");
            }
        } else if (tipoJugador == 2) {
            /**
             * Crear un nuevo portero. Preguntarle las siguientes cosas:
             * Nombre, pais, faltas, goles directos, lanzamientos, paradas, goles recibidos
             */ 

            Portero nuevoPortero = new Portero();
            
            System.out.print("Nombre: ");
            nuevoPortero.setNombre(System.console().readLine());
            System.out.print("País: ");
            nuevoPortero.setPais(System.console().readLine());
            System.out.print("Faltas: ");
            nuevoPortero.setFaltas(Integer.parseInt(System.console().readLine()));
            System.out.print("Goles directos: ");
            nuevoPortero.setGolesDirectos(Integer.parseInt(System.console().readLine()));
            System.out.print("Lanzamientos: ");
            nuevoPortero.setLanzamientos(Integer.parseInt(System.console().readLine()));
            System.out.print("Paradas: ");
            nuevoPortero.setParadas(Integer.parseInt(System.console().readLine()));
            System.out.print("Goles recibidos: ");
            nuevoPortero.setGolesRecibidos(Integer.parseInt(System.console().readLine()));

            try {
                TimeUnit.SECONDS.sleep(3);
                porteros.add(nuevoPortero);
                System.out.println("Jugador registrado con éxito!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Error al registrar jugador");
            }

        } else {
            System.out.println("Opción inválida");
        }
    }

    private static void mostrarJugadores(ArrayList<Extremo> extremos, ArrayList<Portero> porteros){
        try{
            System.out.println("Consultando jugadores disponibles...");
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("==== EXTREMOS REGISTRADOS ====");
        if (extremos.size() == 0) {
            System.out.println("No hay extremos registrados");
        } else {
            System.out.println(extremos);
        }
        System.out.println("\n==== PORTEROS REGISTRADOS ====");
        if (porteros.size() == 0) {
            System.out.println("No hay porteros registrados");
        } else {
            System.out.println(porteros);
        }
    }

    private static void mejoresPorteros(ArrayList<Portero> porteros){
        System.out.println("==== TOP 3 PORTEROS ====");
        if (porteros.size() == 0) {
            System.out.println("No hay porteros registrados");
        } else {
            for (Portero portero : porteros){
                int efectividad = ((portero.getParadas() - portero.getGolesRecibidos()) * 100 / (portero.getParadas() + portero.getGolesRecibidos())) + portero.golesDirectos * 100 / portero.lanzamientos;
                System.out.println("Nombre: " + portero.getNombre() + "\n" +
                                    "País: " + portero.getPais() + "\n" +
                                    "Efectividad: " + efectividad + "\n\n");
            }
        }
    }

    private static void mejoresExtremos(ArrayList<Extremo> extremos){
        System.out.println("==== MEJORES EXTREMOS ====");
        if (extremos.size() == 0) {
            System.out.println("No hay extremos registrados");
        } else {
            for (Extremo extremo : extremos){
                int efectividad = (extremo.getPases() * 100 / extremo.getLanzamientos()) + (extremo.getAsistencias() * 100 / extremo.getLanzamientos());
                if (efectividad > 85) {
                    System.out.println("Nombre: " + extremo.getNombre() + "\n" +
                                        "País: " + extremo.getPais() + "\n" +
                                        "Efectividad: " + efectividad + "\n\n");
                }
            }
        }
        
    }
}
