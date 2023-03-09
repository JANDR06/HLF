public class Principal {
    public static void main(String[] args) {

        char[][] tablero = new char[11][11];
        char[][] tableroPC = new char[11][11];
        char[][] tableroDisparos = new char[11][11];
        char[][] tableroDisparosPC = new char[11][11];
        int[] barcos = {4, 3, 2, 1};

        juego(tablero, tableroPC, tableroDisparos, tableroDisparosPC, barcos);
    }

    /**
     *
     * @param tablero es el tablero del jugador (donde coloca sus barcos)
     * @param tableroPC es el tablero del PC (donde coloca sus barcos)
     * @param tableroDisparos es el tablero del jugador donde marca en que coordenada dispara
     * @param tableroDisparosPC es el tablero del jugador donde marca en que coordenada dispara
     * @param barcos la cantidad y longitud de barcos de la partida
     */
    public static void juego(char[][] tablero, char[][] tableroPC, char[][] tableroDisparos, char[][] tableroDisparosPC, int[] barcos) {

        int respuesta;

        System.out.println("¡ BIENVENIDO AL JUEGO 'HUNDIR LA FLOTA' !");
        respuesta = Obtener.obtenerEnteroDebajo(" 1 - JUGAR  /  2 - SALIR");

        // LE PREGUNTAMOS AL USUARIO SI QUIERE JUGAR O NO (SI DECIDE QUE SI, EMPIEZA EL JUEGO)

        while (respuesta < 1 || respuesta > 2) {
            System.err.println("¡¡ ERROR, ESCRIBA UN NUMERO CORRECTO !!");
            respuesta = Obtener.obtenerEnteroDebajo(" 1 - JUGAR  /  2 - SALIR");
        }

        if (respuesta == 1) {

            System.out.println();
            System.out.println("************************************          INSTRUCCIONES          ***************************************");
            System.out.println();
            System.out.println("1 - El juego consiste en hundir la flota del contrincante. Para ello, debe colocar su propia flota de forma\n" + "    estratégica y encontrar y hundir con los disparos la flota contraria.");
            System.out.println("2 - Cada uno de los jugadores dispone de dos cuadrículas que ocultará al otro jugador: en una debe colocar\n" + "    sus barcos y en la otra irá anotando los resultados de los disparos que realiza en cada turno.");
            System.out.println("3 - Cada jugador debe colocar en uno de los cuadros los siguientes barcos en posición horizontal o vertical:");
            System.out.println("    · 1 barco que ocupa 4 posiciones.");
            System.out.println("    · 1 barco que ocupa 3 posiciones.");
            System.out.println("    · 1 barco que ocupa 2 posiciones.");
            System.out.println("    · 1 barco que ocupa 1 posiciones.");
            System.out.println("4 - Cada jugador dispone de un turno de disparo que se irá alternando. Para hacerlo dirá las coordenadas.\n" + "     Por ejemplo “B3”, significa que su disparo corresponde a la casilla que se encuentra en esa\n" + "     coordenada.");
            System.out.println("5 - Para indicar tanto las coordenadas de disparo como las de colocar tus barcos en el tablero, se deberán\n" + "     de indicar de la siguiente manera: 'B4'.");
            System.out.println("6 - Finalmente, gana el jugador que antes consigue hundir la flota del otro.");
            System.out.println();
            System.out.println("***********************************************************************************************************");
            System.out.println();

            Inicializar.tableroJugador(tablero);
            Inicializar.tableroDisparosJugador(tableroDisparos);
            Inicializar.tableroPC(tableroPC);
            Inicializar.tableroDisparosPC(tableroDisparosPC);

            Colocar.barcosPC(tableroPC, barcos);
            Colocar.barcosJugador(tablero, barcos);

            System.out.println("--------- ¡ ES HORA DE DERRUMBAR LA FLOTA DEL PC ! ---------");
            System.out.println();
            Disparo.jugador(tableroDisparos, tableroPC, tableroDisparosPC, tablero);


        } else {

            System.out.println("¡ TE ESPERAMOS EN OTRO MOMENTO !");

        }


    }
}

