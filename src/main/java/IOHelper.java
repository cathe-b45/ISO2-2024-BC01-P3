import java.util.Scanner;

public class IOHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Intente nuevamente.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número decimal inválido. Intente nuevamente.");
            }
        }
    }

    public static boolean leerBooleano(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("true") || entrada.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(entrada);
            } else {
                System.out.println("Valor inválido. Introduzca 'true' o 'false'.");
            }
        }
    }

    public static void escribirCadena(String mensaje) {
        System.out.println(mensaje);
    }
}
