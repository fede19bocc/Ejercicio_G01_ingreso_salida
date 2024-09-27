package entrada;

import java.util.Scanner;
import salida.SalidaConsola;

public class EntradaConsola  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas entradas al sistema quiere ingresar?");
        String cantidadEntradas = entrada.nextLine();
        
        for (int i=0; i < Integer.valueOf(cantidadEntradas); i++) {
            System.out.println("Tiene que ingresar un total de " + cantidadEntradas + " entradas por teclado");
            String textoEntrada = entrada.nextLine();

            SalidaConsola salida = new SalidaConsola(textoEntrada);
            salida.mostrar();
            System.out.println("Le quedan por ingresar " + (Integer.valueOf(cantidadEntradas) - (i+1)));
        }
}
}
