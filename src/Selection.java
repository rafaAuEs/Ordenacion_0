import java.util.ArrayList;
import java.util.Arrays;

public class Selection extends Thread {

    public int[] arrayNumeros;
    public Selection(int[] arrayNumeros) {
        this.arrayNumeros=arrayNumeros;
    }

    @Override
    public void run() {
        long tiempoInicial = System.nanoTime();
        System.out.println("Empezo a correr Selection");
        int n = arrayNumeros.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arrayNumeros[j] < arrayNumeros[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arrayNumeros[i];
                arrayNumeros[i]=arrayNumeros[minIdx];
                arrayNumeros[minIdx]= temp;
            }
        }
        long tiempoFinal = System.nanoTime();
        long duracionSegundos = (tiempoFinal- tiempoInicial)/1000000;
        System.out.println("Selection Termino de ordenar Duracion en segundos: " + duracionSegundos);
        System.out.println("Lista: " + Arrays.toString(arrayNumeros)+"\n");
    }
}