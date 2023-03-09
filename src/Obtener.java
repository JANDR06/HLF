import java.util.Scanner;
public class Obtener {

    /**
     *
     * @param mensaje el numero entero que el jugador quiera en la misma linea
     * @return la opcion de escribir un entero en la misma linea
     */
    public static int obtenerEntero (String mensaje) {

        // METODO PARA QUE EL USUARIO NOS ESCRIBA UN NUMERO ENTERO EN LA MISMA LINEA
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        while(!sc.hasNextInt()){
            System.err.println("¡¡ ERROR, ESCRIBE UN NUMERO ENTERO !! ");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     *
     * @param mensaje el numero entero que el jugador quiera en la linea de abajo
     * @return la opcion de escribir un entero en la linea de abajo
     */
    public static int obtenerEnteroDebajo (String mensaje) {

        // METODO PARA QUE EL USUARIO NOS ESCRIBA UN NUMERO ENTERO EN LA LINEA DE ABAJO
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        while(!sc.hasNextInt()){
            System.err.println("¡¡ ERROR, ESCRIBE UN NUMERO ENTERO !! ");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     *
     * @param mensaje la cadena que el jugador quiera en la misma linea
     * @return la opcion de escribir una cadena en la  misma linea
     */
    public static String obtenerCadena (String mensaje) {

        // METODO PARA QUE EL USUARIO NOS ESCRIBA UNA CADENA EN LA MISMA LINEA
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.next();
    }

}

