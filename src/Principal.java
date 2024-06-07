import com.alura.desafio.CoversorMoneda.ConsultaMoneda;
import com.alura.desafio.CoversorMoneda.ConversionMoneda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        String menu = """
                *************************************************
                 *** Sea Bienvenido/a al Conversor de Moneda ***
                 Seleccione la opcion que prefiera:
                 1 - Dolar ==>> Peso Argentino
                 2 - Peso Argentino ==>> Dolar
                 3 - Dolar ==>> Real Brasileño
                 4 - Real Brasileño ==>> Dolar
                 5 - Dolar ==>> Peso Colombiano
                 6 - Peso Colombiano ==>> Dolar
                 7 - Otra Conversion 
                 8 - Salir
                *************************************************
                """;

        while (opcion != 8){
            System.out.println(menu);
            opcion = lectura.nextInt();
            lectura.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ConversionMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConversionMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConversionMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConversionMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConversionMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConversionMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConversionMoneda.convertirMasMonedas(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del programa, Gracias por utilizar nuestros Servicios");
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
        }
    }
}
