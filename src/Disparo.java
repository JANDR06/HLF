public class Disparo {

    /**
     *
     * @param tableroDisparos es el tablero del jugador donde marca en que coordenada dispara
     * @param tableroPC es el tablero del PC (donde coloca sus barcos)
     */
    public static void jugador(char[][] tableroDisparos, char[][] tableroPC, char[][] tableroDisparosPC, char[][] tablero) {

        int fila, columna, contadorBarcosHundidos = 0, totalBarcosPC = 10;
        String coordenada;

        do  {

            coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");

            // COMPROBAMOS SI LA COORDENADA TIENE LONGITUD = 2 (EJ: B5)
            while (coordenada.length() != 2) {
                System.err.println("¡¡ ERROR DE COORDENADA !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");

            }
            fila = (int) coordenada.charAt(0) - 65;
            columna = (int) coordenada.charAt(1) - 48;



            // COMPROBAMOS SI LA COORDENADA ESTA DENTRO DE LOS LIMITES DEL TABLERO
            while (fila < 0 || fila > 9 || columna < 0 || columna > 11) {
                System.err.println("¡¡ ERROR DE COORDENADA !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");


                while (coordenada.length() != 2) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");

                }
                fila = (int) coordenada.charAt(0) - 65;
                columna = (int) coordenada.charAt(1) - 48;

            }



            // COMPROBAMOS QUE NO REPITA LA MISMA COORDENADA
            while (tableroDisparos[fila][columna+1] != '~') {



                System.err.println("¡¡ ERROR, YA HAS MARCADO ESA COORDENADA ANTERIORMENTE !!");
                coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");


                while (coordenada.length() != 2) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");

                }


                while (fila < 0 || fila > 9 || columna < 0 || columna > 11) {
                    System.err.println("¡¡ ERROR DE COORDENADA !!");
                    coordenada = Obtener.obtenerCadena("ESCRIBE LA COORDENADA PARA DISPARAR: ");
                    fila = (int) coordenada.charAt(0) - 65;
                    columna = (int) coordenada.charAt(1) - 48;

                }

                fila = (int) coordenada.charAt(0) - 65;
                columna = (int) coordenada.charAt(1) - 48;
            }



            // MARCAMOS CON UNA 'X' EL TABLERO SI TOCA EL BARCO Y CON UNA 'W' SI TOCA AGUA
            if (tableroPC[fila][columna+1] == 'X') {

                tableroDisparos[fila][columna+1] = 'T';

                contadorBarcosHundidos++;
                totalBarcosPC--;
                System.out.println();
                Visualizar.tableroDisparosJugador(tableroDisparos);
                System.out.println();
                System.out.println("¡HAS TOCADO UN BARCO! (BARCOS DEL PC RESTANTES: " +totalBarcosPC+ ")");
                System.out.println();

            } else {

                tableroDisparos[fila][columna+1] = 'W';

                System.out.println();
                Visualizar.tableroDisparosJugador(tableroDisparos);
                System.out.println();
                System.out.println("NO HAS TOCADO NINGUN BARCO CONTRARIO (BARCOS DEL PC RESTANTES: " +totalBarcosPC+ ")");
                System.out.println();
                pc(tableroDisparosPC, tablero, tableroPC, tableroDisparos);

            }

        } while (contadorBarcosHundidos!=10);

        System.out.println("--------- ¡ HAS GANADO, HAS HUNDIDO TODOS LOS BARCOS DEL PC ! ---------");

    }

    /**
     *
     * @param tableroDisparosPC es el tablero del PC donde marca en que coordenada dispara
     * @param tablero es el tablero del jugador (donde coloca sus barcos)
     */
    public static void pc (char[][] tableroDisparosPC, char[][] tablero, char[][] tableroPC, char[][] tableroDisparos) {

        int fila, columna, contadorBarcosHundidos = 0, totalBarcos = 10;


        do {

            fila = (int) (Math.random() * (74 - 65));
            columna = (int) (Math.random() * 10);

            //COMPROBAMOS QUE NO REPITA LA MISMA COORDENADA
            while (tableroDisparosPC[fila][columna+1] != '~') {

                fila = (int) (Math.random() * (74 - 65));
                columna = (int) (Math.random() * 10);

            }


            // MARCAMOS CON UNA 'X' EL TABLERO SI TOCA EL BARCO Y CON UNA 'W' SI TOCA AGUA
            if (tablero[fila][columna+1] == 'X') {

                tableroDisparosPC[fila][columna+1] = 'T';
                totalBarcos--;
                contadorBarcosHundidos++;
                System.out.println("---------  EL PC HA DISPARADO Y HA TOCADO UN BARCO (BARCOS DEL JUGADOR RESTANTES: " +totalBarcos+ ") ---------");
                System.out.println();


            } else {

                tableroDisparosPC[fila][columna+1] = 'W';
                System.out.println("---------  EL PC HA DISPARADO Y NO HA TOCADO NINGUN BARCO (BARCOS DEL JUGADOR RESTANTES: " +totalBarcos+ ") ---------");
                System.out.println();
                jugador(tableroDisparos, tableroPC, tableroDisparosPC, tablero);
            }

        } while (contadorBarcosHundidos!=10);

        System.out.println("--------- ¡ HAS PERDIDO ! EL PC HA HUNDIDO TODOS TUS BARCOS ---------");



    }


}
