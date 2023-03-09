public class Inicializar {

    /**
     *
     * @param tablero es el tablero del jugador (donde coloca sus barcos)
     */
    public static void tableroJugador(char[][] tablero) {

        char letra = 65, numero = 48, nada = 32, agua = 126;

        // HACEMOS EL TABLERO, POR UN LADO LAS FILAS SON LAS LETRAS (DE LA 'A' A LA 'J') Y LAS COLUMNAS SON LOS NUMEROS
        // (DEL 0 AL 9)
        for (int fila = 0; fila < tablero.length; fila++) {
            tablero[fila][0] = letra;
            letra++;

            for (int columna = 1; columna < tablero[0].length; columna++) {
                if (fila < 10 && columna > 0) {
                    tablero[fila][columna] = agua;

                }
                if (fila == 10) {
                    tablero[10][columna] = numero;
                    numero++;
                }
            }
            tablero[10][0] = nada;

        }

    }

    /**
     *
     * @param tableroPC es el tablero del PC (donde coloca sus barcos)
     */
    public static void tableroPC(char[][] tableroPC) {

        char letra = 65, numero = 48, nada = 32, agua = 126;

        // HACEMOS EL TABLERO, POR UN LADO LAS FILAS SON LAS LETRAS (DE LA 'A' A LA 'J') Y LAS COLUMNAS SON LOS NUMEROS
        // (DEL 0 AL 9)
        for (int fila = 0; fila < tableroPC.length; fila++) {
            tableroPC[fila][0] = letra;
            letra++;

            for (int columna = 1; columna < tableroPC[0].length; columna++) {
                if (fila < 10 && columna > 0) {
                    tableroPC[fila][columna] = agua;

                }
                if (fila == 10) {
                    tableroPC[10][columna] = numero;
                    numero++;
                }
            }
            tableroPC[10][0] = nada;

        }

    }

    /**
     *
     * @param tableroDisparos es el tablero del jugador donde marca en que coordenada dispara
     */
    public static void tableroDisparosJugador(char[][] tableroDisparos) {

        char letra = 65, numero = 48, nada = 32, agua = 126;

        // HACEMOS EL TABLERO, POR UN LADO LAS FILAS SON LAS LETRAS (DE LA 'A' A LA 'J') Y LAS COLUMNAS SON LOS NUMEROS
        // (DEL 0 AL 9)
        for (int fila = 0; fila < tableroDisparos.length; fila++) {
            tableroDisparos[fila][0] = letra;
            letra++;

            for (int columna = 1; columna < tableroDisparos[0].length; columna++) {
                if (fila < 10 && columna > 0) {
                    tableroDisparos[fila][columna] = agua;

                }
                if (fila == 10) {
                    tableroDisparos[10][columna] = numero;
                    numero++;
                }
            }
            tableroDisparos[10][0] = nada;

        }

    }

    /**
     *
     * @param tableroDisparosPC es el tablero del PC donde marca en que coordenada dispara
     */
    public static void tableroDisparosPC(char[][] tableroDisparosPC) {

        char letra = 65, numero = 48, nada = 32, agua = 126;

        // HACEMOS EL TABLERO, POR UN LADO LAS FILAS SON LAS LETRAS (DE LA 'A' A LA 'J') Y LAS COLUMNAS SON LOS NUMEROS
        // (DEL 0 AL 9)
        for (int fila = 0; fila < tableroDisparosPC.length; fila++) {
            tableroDisparosPC[fila][0] = letra;
            letra++;

            for (int columna = 1; columna < tableroDisparosPC[0].length; columna++) {
                if (fila < 10 && columna > 0) {
                    tableroDisparosPC[fila][columna] = agua;

                }
                if (fila == 10) {
                    tableroDisparosPC[10][columna] = numero;
                    numero++;
                }
            }
            tableroDisparosPC[10][0] = nada;

        }

    }
}

