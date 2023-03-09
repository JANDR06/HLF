public class Visualizar {

    /**
     * @param tablero es el tablero del jugador (donde coloca sus barcos)
     */
    public static void tableroJugador(char[][] tablero) {

        System.out.println("TABLERO DEL JUGADOR");
        System.out.println("------------------------------------------");
        System.out.println();

        // VISUALIZAMOS EL TABLERO QUE HEMOS INICIALIZADO ANTERIORMENTE MARCANDO 3 ESPACIOS ENTRE COORDENADA
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {

                System.out.print(tablero[fila][columna] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * @param tableroDisparos es el tablero del jugador donde marca en que coordenada dispara
     */
    public static void tableroDisparosJugador(char[][] tableroDisparos) {

        // VISUALIZAMOS EL TABLERO QUE HEMOS INICIALIZADO ANTERIORMENTE MARCANDO 3 ESPACIOS ENTRE COORDENADA
        for (int fila = 0; fila < tableroDisparos.length; fila++) {
            for (int columna = 0; columna < tableroDisparos[fila].length; columna++) {

                System.out.print(tableroDisparos[fila][columna] + "   ");
            }
            System.out.println();
        }

    }
}
