import java.util.Scanner;

public class CalificacionesProm {

    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);

        Operaciones operar = new Operaciones ();

        System.out.println("Nombre del alumno(a): ");
        String nombre =captura.next();

        System.out.println("ingrese calificacion1: ");
         float calif1= captura.nextFloat();
        System.out.println("ingrese calificacion2: ");
         float calif2= captura.nextFloat();
        System.out.println("ingrese calificacion3: ");
         float calif3= captura.nextFloat();
        System.out.println("ingrese calificacion4: ");
        float calif4= captura.nextFloat();
        System.out.println("ingrese calificacion5: ");
        float calif5= captura.nextFloat();

        operar.calcular_promedio(calif1, calif2, calif3, calif4, calif5);
        operar.evaluar_estado();
        operar.mostrar_mensajes(nombre);



    }
}
