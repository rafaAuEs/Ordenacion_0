import java.util.ArrayList;
import java.util.Arrays;

public class Insertion extends Thread {

    public int[] arrayNumeros;
    public Insertion(int[] arrayNumeros) {
        this.arrayNumeros=arrayNumeros;
    }
    @Override
    public void run() {
        long tiempoInicial = System.nanoTime();
        System.out.println("Empezo a correr Insertion");

        int n = arrayNumeros.length;
        for (int i = 1; i < n; i++) {
            int key = arrayNumeros[i];
            int j = i - 1;
            while (j >= 0 && arrayNumeros[j] > key) {
                arrayNumeros[j+1]=arrayNumeros[j];
                j = j - 1;
            }
            arrayNumeros[j+1]=key;
        }
        long tiempoFinal = System.nanoTime();
        long duracionSegundos = (tiempoFinal- tiempoInicial)/1000000;
        System.out.println("Insertion Termino de ordenar Duracion en segundos: " + duracionSegundos);
        System.out.println("Lista: " + Arrays.toString(arrayNumeros)+"\n");
    }
}