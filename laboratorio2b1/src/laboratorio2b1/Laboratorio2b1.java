/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2b1;
import java.util.Scanner;

/**
 *
 * @author Edgar Guamo M
 */
public class Laboratorio2b1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Laboratorio 2 Bimestre 1
        Condiciones:
            usar un solo print 
            usar String.format
            El uso de clases es optativo
        */
        // Variables usadas para ingresar los datos básicos  (bucle 1)
        Scanner teclado = new Scanner (System.in);
        String demo = ""; // Variable que contendra todos los datos a imprimir 
        String nombre;
        double sueldo = 0; 
        int nhijos = 0; //número de hijos
        //variables asignadas por progamador para el funcionamiento del alg.
        int contador = 0;
        boolean fin = true; // variable para que el bucle siga 
        int n_reporte = 001; // contador usado número de reporte 
        int pregunta;
        
        // variables usadas para preguntar pasajes, bar ,salidas, (bucle 2)
        double pasaje = 0;
        double bar = 0;
        double salida = 0;
        String al_fal; // usada asignar la cadena alcanza o falta 
        double total1 =0; // v usada para sumar los gastos por pasaje
        double total2 = 0; // v usada para sumar los gastos por bar 
        double total3 = 0; // v usada pra sumar los gastos por salidas
        double total4; // v usada para sumar los totales 
        
        demo = "Reporte Gastos de Padres de Familia";
        // bucle 1 Ejecuta el programa hasta que el usario lo detenga 
        while (fin){ 
            // Peticion de datos que se repiten una vez por reporte
            System.out.println("Por favor, ingrese el nombre del Padre de "
                    + "Familia");
            nombre = teclado.nextLine();
            System.out.println("A continuación ingrese su sueldo semanal");
            sueldo = teclado.nextInt();
            System.out.println("Seguidamente, ingrese la cantidad de hijos"
                    + " que tiene");
            nhijos = teclado.nextInt();
            
            demo = String.format("%s\nReporte %d \n\nNombre padre de Familia:"
                    + "%s \nSueldo Semanal: %.2f \nNúmero de Hijos: %d\n "
                    + "\nReporte de Gastos \nPersona \t Pasajes \t Bar \t\t "
                    + "Salidas"
                    ,demo, n_reporte, nombre, sueldo, nhijos);
            // bucle 2 usado para ingresar los gastos y sumarlos  
            while (contador < nhijos){ 
                contador ++; // incremento del contador
                //Peticion de datos que se repiten varias veces en el reporte
                System.out.printf("Por Favor ingrese el pasaje que se da al"
                        + " hijo %d\n", contador);
                pasaje = teclado.nextFloat();
                System.out.printf("A continuación ingrese el valor que da"
                        + " para el bar al hijo %d\n", contador);
                bar = teclado.nextFloat();
                System.out.printf("Finalmente ingrese el gasto que tiene "
                        + "por salidas de su hijo %d\n", contador);
                salida = teclado.nextFloat();
                demo = String.format("%s \nHijo %d \t\t $ %.2f \t$ %.2f\t\t$ "
                        + "%.2f\n", demo, contador ,pasaje, bar, salida);
                // suma de los gastos por tipo 
                total1 = total1 + pasaje;
                total2 = total2 + bar;
                total3 = total3 + salida;
                
            }
            total4 = total1 + total2 + total3; // suma de todos los gastos 
            if ( sueldo < total4){ // Estructura condicional 
                al_fal = "falta";
            } else {
                al_fal = "alcanza";
            }
            demo = String.format("%s \nTotales \t $ %.2f \t $ %.2f \t $ %.2f "
                    + "\nEl padre de familia %s le %s el dinero samanal, "
                    + "para sus gastos \n\nFin reporte %d \n\n "
                    , demo, total1, total2, total3, nombre, al_fal, n_reporte);            
            n_reporte ++;
            // mensaje al usuario para seguir en el bucle o imprimir 
            System.out.println("Por favor presione 1 si desea seguir o 2 si "
                    + "quiere salir del programa");
            pregunta = teclado.nextInt();
            teclado.nextLine();// limpieza de buffer
            //Recordatorio poner el limpiador en la ultima entrada 
            if (pregunta ==2){
                fin = false;
            }
            
        // Re-inicialización de variables 
        contador = 0;  
        total1 = 0;
        total2 = 0;
        total3 = 0;
        
        }
        // impresión del demo
        System.out.println(demo);    
    }
    
}
