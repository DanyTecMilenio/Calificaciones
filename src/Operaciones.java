public class Operaciones {
    public float prom;
    public String calif;

    public void calcular_promedio (float n1, float n2, float n3, float n4, float n5) {
        prom = (n1 + n2 + n3 + n4 + n5) / 5;
    }
    public void evaluar_estado () {
        if (prom <= 50) {
            calif = "F";
        }else{
            if (prom >= 51 && prom <= 60) {
                calif = "E";
            }else{
                if (prom >= 61 && prom <=70) {
                    calif = "D";
                }else{
                    if (prom>=71 && prom <= 80) {
                        calif = "C";
                    }else{
                        if (prom >= 81 && prom <= 90) {
                            calif = "B";
                        }else{
                            calif = "A";
                        }
                    }
                }
            }
        }

                }
                public void mostrar_mensajes(String nombre) {
        System.out.println("CALIFICACIONES UNIVERSIDAD TECMILENIO");
        System.out.println ("Nombre del alumno: " + nombre);
        System.out.println ("Su promedio es: " + prom);
        System.out.println ("Calificación: " + calif);
                }



}