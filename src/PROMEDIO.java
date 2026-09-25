/*ALVAREZ RODRIGUEZ GADIEL RAMON
 * TECNOLOGICO DE PACHUCA
 * 26201024
 * EJERCICIO: APROBADO REPROBADO
 * 25/09/26*/

import java.util.Scanner;//Libreria

public class PROMEDIO {

    public static void main(){
        final int PROMEDIO = 70;
        String nombre;
        double calif = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificación");
        calif = scanner.nextDouble();
        if (calif >= PROMEDIO) {
            System.out.println(nombre + " tiene " + calif + " de calificacion final y esta aprobado");
        }
        else {
            System.out.println(nombre + " tiene " + calif + " de calificacion y esta reprobado");
            System.out.println("Para aprobar necesita " +(PROMEDIO - calif) + " de calificacion ");
        }//Finsi
    }
}//Fin Algoritmo
