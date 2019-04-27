/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraclase;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicioextraclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración de variables 
        int numero_Mensajes, auxiliar;
        double mes = 3.00, costo = 0, costo_final, tarifa_basica = 3.00;
        double tarif2 = 0.05 * 160, iva, adicional;
        // uso del scanner para entrada de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantida de mesajes enviados: ");
        numero_Mensajes = entrada.nextInt();

        System.out.printf("Mensajes enviados:%d\nTarifa Básica:%.2f\n", numero_Mensajes, mes);
        //condicional
        if (numero_Mensajes <= 40) {
            costo = tarifa_basica;
        } else {
            if (numero_Mensajes > 40 && numero_Mensajes <= 200) {
                auxiliar = numero_Mensajes - 40;
                costo = tarifa_basica + auxiliar * 0.05;
                adicional = auxiliar * 0.05;
                System.out.printf(" Valor adicional :%.2f", adicional);
            } else {
                if (numero_Mensajes > 200) {
                    auxiliar = numero_Mensajes - 200;
                    adicional = tarif2 + auxiliar * 0.10;
                    tarifa_basica = tarifa_basica + tarif2;
                    costo = tarifa_basica + auxiliar * 0.10;

                    System.out.printf(" Valor adicional:%.2f", adicional);
                }

            }
        }
        iva = costo * 0.12;
        costo_final = costo + iva;
        System.out.printf("\n Total :%.2f%n IVA:%.2f%n Costo final-total:%.2f%n", costo, iva, costo_final);
    }

}
