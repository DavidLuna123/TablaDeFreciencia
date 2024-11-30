public class Main {

    /*Alumno Luna Garcia David
    * programa tabla de frecuencia
    * los datos de la tabla aparecn uno por uno arriba de la tabla generada hasta el final solo es
    * cuestion de subir y ya salu2 : )*/

    public static void main(String[] args) {

        int[] x ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,30,30,30,30,40,40,40,40,40,40,50,50,50,50,50,50,50,51,52,53,54,55,56,57,58,59,60};


    /*{82, 85, 86, 87, 87, 89, 89, 90, 91, 91, 92, 93, 94, 95,

    95, 95, 95, 95, 97, 98, 99, 99, 100, 100, 101,101,
    103, 103, 103, 104, 105, 105, 106, 107, 107,
    107, 109, 110, 110, 111};*/
        TablaDeFrecuencia operations = new TablaDeFrecuencia(x);

       operations.showData();
       operations.FrecuenciaAbsoluta();
       operations.FrecuenciaAcumulada();
       operations.FrecuenciaRelativa();
        operations.PuntoMedio();
        operations.RelativaAcumulada();
        operations.porcentaje();
        operations.tabla();

    }
}