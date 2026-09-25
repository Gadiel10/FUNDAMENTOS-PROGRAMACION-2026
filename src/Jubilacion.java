/*ALVAREZ RODRIGUEZ GADIEL RAMON
 * TECNOLOGICO DE PACHUCA
 * 26201024
 * EJERCICIO: JUBILACION
 * 25/09/26*/

import java.util.Scanner;//Libreria

public class Jubilacion {

    public static void main(){
        final int EDAD_JUBILACION = 65;
        final int MAYORIA_EDAD = 21;
        String nombre;
        int edad = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();
        if (edad >= EDAD_JUBILACION) {
            System.out.println(nombre + " tiene " + edad + " años y esta listo para jubilarse");
        } else if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        }
            else {
            System.out.println( " es mayor de edad ");
                System.out.println(nombre + " tiene " + edad + " años y aun no se puede jubilar");
            System.out.println("Le faltan " +(EDAD_JUBILACION - edad) + " años para jubilarse ");
        }//Finsi
    }
}//Fin Algoritmo
