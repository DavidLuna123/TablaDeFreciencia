import java.util.Arrays;

public class TablaDeFrecuencia {

    private int[] EXE = {};
    double[] FrecRelativa;
    double[] resultado;
    int[] limteA;
    int[] limteB;
    int[] frecuencias;
    int[] Xc;
    int k;
    int totalfrec;
    double g;
    int[] FrecAcumulada;
    double[] RelativaAcumulada;


    TablaDeFrecuencia(int[] exe) {
        this.EXE = exe;
    }


    public void showData() {
        System.out.print("\n");
        System.out.println("==Nuestros 40 datos==");
        System.out.println("" + Arrays.toString(EXE));
        System.out.print("\n");
        System.out.println("===Frecfuencia===");

    }
    public void tabla() {
        System.out.println("             limites ");
        System.out.println("Clase\t/Inferior\t/Superior\t/Frecuencia\t/Punto Medio\t/Frec Acumulada\t/Frec Relativa\t/Frec.Rela Acumulada\t/Porcentaje");
        System.out.println("======================================================================================================================");

        // Imprimir los datos de las clases
        for (int i = 0; i < k; i++) {
            // Mostrar cada fila con los datos de cada columna
            System.out.print((i + 1) + "\t\t\t");
            System.out.print(limteA[i] + "\t\t\t");
            System.out.print(limteB[i] + "\t\t\t");
            System.out.print(frecuencias[i] + "\t\t\t\t");
            System.out.print(Xc[i] + "\t\t");
            System.out.print(FrecAcumulada[i] + "\t\t\t\t");
            System.out.printf("%.4f\t\t\t", FrecRelativa[i]);  // Mostrar la frecuencia relativa con 4 decimales
            System.out.printf("%.4f\t\t\t\t", RelativaAcumulada[i]); // Mostrar la frecuencia acumulada relativa con 4 decimales
            System.out.printf("%.2f%%\n", FrecRelativa[i] * 100);  // Mostrar el porcentaje
        }

        System.out.println("\n");
    }

    public void FrecuenciaAbsoluta() {
        Arrays.sort(EXE);
        totalfrec = 0;
        int a = EXE[0];
        int r = EXE[EXE.length - 1] - EXE[0];
        k = (int) Math.round(1 + (3.322 * Math.log10(EXE.length)));
        int c = (int) Math.round((double) r / k);
        int b = a + c - 1;
        limteA = new int[k];
        limteB = new int[k];
        frecuencias = new int[k];
        resultado = new double[k];

        for (int i = 0; i < k; i++) {//

            limteA[i] = a;
            limteB[i] = b;

            a = b + 1;
            b = a + c - 1;
        }
        for (int i = 0; i < EXE.length; i++) {//

            for (int x = 0; x < k; x++) {
                if (EXE[i] >= limteA[x] && EXE[i] <= limteB[x]) {
                    frecuencias[x] += 1;
                    totalfrec += 1;
                }
            }

        }

        for (int x = 0; x < frecuencias.length; x++) {
            System.out.println(frecuencias[x]);
        }
        System.out.print("\n");
        System.out.println(" Limite inferior");
        for (int x = 0; x < limteA.length; x++) {
            System.out.println(limteA[x]);
        }
        System.out.print("\n");
        System.out.println(" Limite superior");
        for (int x = 0; x < limteB.length; x++) {
            System.out.println(limteB[x]);
        }


        System.out.print("\n");

    }

    public void PuntoMedio() {
        System.out.println("===Punto Medio===");
        Xc = new int[k];

        for (int i = 0; i < k; i++) {
            Xc[i] = limteA[i] + limteB[i] / 2;
        }

        for (int i = 0; i < Xc.length; i++) {
            System.out.println(Xc[i]);
        }

        System.out.print("\n");
    }

    public void FrecuenciaAcumulada() {
        System.out.println("==Frecuencia Acumulada==");
        FrecAcumulada = new int[k];

        for (int i = 0; i < k; i++) {
            if (i >= 1) {
                FrecAcumulada[i] = FrecAcumulada[i - 1];
            }
            FrecAcumulada[i] += frecuencias[i];
        }
        for (int i = 0; i < FrecAcumulada.length; i++) {
            System.out.println(FrecAcumulada[i]);
        }

        System.out.print("\n");
    }

    public void FrecuenciaRelativa() {
        System.out.println(" ==Frecuencia Relativa==");
        FrecRelativa = new double[k];

        for (int i = 0; i < k; i++) {
            FrecRelativa[i] = (double) frecuencias[i] / totalfrec;
        }

        for (int i = 0; i < FrecRelativa.length; i++) {
            System.out.println(FrecRelativa[i]);
        }

        System.out.print("\n");

    }

    public void RelativaAcumulada() {
        System.out.println(" ==Frecuencia Acumulada Relativa==");
        RelativaAcumulada = new double[k];

        for (int i = 0; i < k; i++) {
            if (i >= 1) {
                RelativaAcumulada[i] = RelativaAcumulada[i - 1];
            }
            RelativaAcumulada[i] += FrecRelativa[i];
        }
        for (int i = 0; i < RelativaAcumulada.length; i++) {
            System.out.println(RelativaAcumulada[i]);
        }
        System.out.print("\n");
    }

    public void porcentaje() {
        System.out.println("===Porcentaje cuyo resultado da 100%===");
        double[] f = new double[k];

        for (int i = 0; i < k; i++) {
            f[i] = FrecRelativa[i] * 100;
        }
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        System.out.println("\n");

    }



    }













