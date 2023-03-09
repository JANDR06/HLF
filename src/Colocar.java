public class Colocar {

    /**
     *
     * @param tablero es el tablero del jugador (donde coloca sus barcos)
     * @param barcos la cantidad y longitud de barcos de la partida
     */
    public static void barcosJugador(char[][] tablero, int[] barcos) {

        int fila, columna, orientacion, longitud;
        String coordenada;

        System.out.println("--------- ¡ COLOCA TUS BARCOS DE LA MEJOR MANERA POSIBLE ! ---------");
        System.out.println();

        for (longitud = 0; longitud < barcos.length; longitud++) {

            //RECORREMOS HASTA QUE NO QUEDEN BARCOS POR POSICIONAR
            coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");


            // COMPROBAMOS SI LA COORDENADA TIENE LONGITUD = 2 (EJ: B5)
            while (coordenada.length() != 2) {
                System.err.println("¡¡ ERROR DE COORDENADA !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");

            }

            fila = (int) coordenada.charAt(0) - 65;
            columna = (int) coordenada.charAt(1) - 48;

            // COMPROBAMOS QUE LOS DATOS DE LA COORDENADA SON VALIDOS
            while (fila < 0 || fila > 9 || columna < 0 || columna > 11) {
                System.err.println("¡¡ ERROR DE COORDENADA !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");


                while (coordenada.length() != 2) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");

                }

                fila = (int) coordenada.charAt(0) - 65;
                columna = (int) coordenada.charAt(1) - 48;

            }


            orientacion = Obtener.obtenerEntero("PULSE 1 O 2 PARA DETERMINAR LA ORIENTACION DEL BARCO CON LONGITUD " + barcos[longitud] + " (1 - HORIZONTAL  /  2 - VERTICAL): ");


            // COMPROBAMOS QUE LA ORIENTACION ES O 1 O 2
            while (orientacion < 1 || orientacion > 2) {
                System.err.println("¡¡ ERROR DE ORIENTACION !!");
                orientacion = Obtener.obtenerEntero("PULSE 1 O 2 PARA DETERMINAR LA ORIENTACION DEL BARCO CON LONGITUD " + barcos[longitud] + " (1 - HORIZONTAL  /  2 - VERTICAL): ");
            }
            System.out.println();


            // PARA SABER SI EL BARCO SE ENCUENTRA DENTRO DE LOS LÍMITES DEL TABLERO Y REPETIR EL PROCESO
            while (orientacion == 1 && columna + barcos[longitud] > 10 || orientacion == 2 && fila + barcos[longitud] > 10) {
                System.err.println("¡¡ ERROR DE COORDENADA, SITUA EL BARCO DENTRO DE LOS LIMITES DEL TABLERO !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");

                while (coordenada.length() != 2) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");

                }

                fila = (int) coordenada.charAt(0) - 65;
                columna = (int) coordenada.charAt(1) - 48;


                orientacion = Obtener.obtenerEntero("PULSE 1 O 2 PARA DETERMINAR LA ORIENTACION DEL BARCO CON LONGITUD " + barcos[longitud] + " (1 - HORIZONTAL  /  2 - VERTICAL): ");



                while (fila < 0 || fila > 9 || columna < 0 || columna > 11) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA POSICIONAR EL BARCO CON LONGITUD " + barcos[longitud] + ": ");
                    fila = (int) coordenada.charAt(0) - 65;
                    columna = (int) coordenada.charAt(1) - 48;
                }

                while (orientacion < 1 || orientacion > 2) {
                    System.err.println("¡¡ ERROR DE ORIENTACION !!");
                    orientacion = Obtener.obtenerEntero("PULSE 1 O 2 PARA DETERMINAR LA ORIENTACION DEL BARCO CON LONGITUD " + barcos[longitud] + " (1 - HORIZONTAL  /  2 - VERTICAL): ");
                }
                System.out.println();
            }
            //


            // MARCAMOS CON UNA 'X' LOS BARCOS DONDE HEMOS POSICIONADO CON SU ORIENTACION
            if (orientacion == 1) {

                if (barcos[longitud] == 4) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila][columna + 2] = 'X';
                    tablero[fila][columna + 3] = 'X';
                    tablero[fila][columna + 4] = 'X';

                }


                if (barcos[longitud] == 3) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila][columna + 2] = 'X';
                    tablero[fila][columna + 3] = 'X';

                }
                if (barcos[longitud] == 2) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila][columna + 2] = 'X';

                }
                if (barcos[longitud] == 1) {
                    tablero[fila][columna + 1] = 'X';
                }


            } else {

                if (barcos[longitud] == 4) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila + 1][columna + 1] = 'X';
                    tablero[fila + 2][columna + 1] = 'X';
                    tablero[fila + 3][columna + 1] = 'X';

                }
                if (barcos[longitud] == 3) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila + 1][columna + 1] = 'X';
                    tablero[fila + 2][columna + 1] = 'X';

                }
                if (barcos[longitud] == 2) {
                    tablero[fila][columna + 1] = 'X';
                    tablero[fila + 1][columna + 1] = 'X';

                }
                if (barcos[longitud] == 1) {
                    tablero[fila][columna + 1] = 'X';
                }


            }


            Visualizar.tableroJugador(tablero);
            System.out.println();
        }
    }

    /**
     *
     * @param tableroPC es el tablero del PC (donde coloca sus barcos)
     * @param barcos la cantidad y longitud de barcos de la partida
     */
    public static void barcosPC(char[][] tableroPC, int[] barcos) {

        int fila, columna, orientacion, longitud;

        for (longitud = 0; longitud < barcos.length; longitud++) {

            //RECORREMOS HASTA QUE NO QUEDEN BARCOS POR POSICIONAR

            fila = (int) (Math.random() * (74 - 65));
            columna = (int) (Math.random() * 10);
            orientacion = (int) (Math.random() * 2 + 1);



            // PARA SABER SI EL BARCO SE ENCUENTRA DENTRO DE LOS LÍMITES DEL TABLERO Y REPETIR EL PROCESO
            while (orientacion == 1 && columna + barcos[longitud] > 10 || orientacion == 2 && fila + barcos[longitud] > 10) {
                fila = (int) (Math.random() * (74 - 65));
                columna = (int) (Math.random() * 10);
                orientacion = (int) (Math.random() * 2 + 1);

                while (tableroPC[fila][columna+1] != '~') {

                    fila = (int) (Math.random() * (74 - 65));
                    columna = (int) (Math.random() * 10);
                }
                orientacion = (int) (Math.random() * 2 + 1);
            }
            //

            // COMPROBAMOS QUE NO HAYA "CASI" COLISION
            while (tableroPC[fila][columna+1] != '~') {

                fila = (int) (Math.random() * (74 - 65));
                columna = (int) (Math.random() * 10);
                orientacion = (int) (Math.random() * 2 + 1);
            }



            // MARCAMOS CON UNA 'X' LOS BARCOS DONDE HEMOS POSICIONADO CON SU ORIENTACION
            if (orientacion == 1) {

                if (barcos[longitud] == 4) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila][columna + 2] = 'X';
                    tableroPC[fila][columna + 3] = 'X';
                    tableroPC[fila][columna + 4] = 'X';

                }
                if (barcos[longitud] == 3) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila][columna + 2] = 'X';
                    tableroPC[fila][columna + 3] = 'X';

                }
                if (barcos[longitud] == 2) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila][columna + 2] = 'X';

                }
                if (barcos[longitud] == 1) {
                    tableroPC[fila][columna + 1] = 'X';
                }

            } else if (orientacion == 2) {

                if (barcos[longitud] == 4) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila + 1][columna + 1] = 'X';
                    tableroPC[fila + 2][columna + 1] = 'X';
                    tableroPC[fila + 3][columna + 1] = 'X';

                }
                if (barcos[longitud] == 3) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila + 1][columna + 1] = 'X';
                    tableroPC[fila + 2][columna + 1] = 'X';

                }
                if (barcos[longitud] == 2) {
                    tableroPC[fila][columna + 1] = 'X';
                    tableroPC[fila + 1][columna + 1] = 'X';

                }
                if (barcos[longitud] == 1) {
                    tableroPC[fila][columna + 1] = 'X';
                }

            }

        }


    }
}







