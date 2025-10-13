import java.util.ArrayList;
import java.util.Arrays;

public class Bubble extends Thread {

    public int[] arrayNumeros;
    public Bubble(int[] arrayNumeros) {
        this.arrayNumeros=arrayNumeros;
    }
    @Override
    public void run() {
        long tiempoInicial = System.nanoTime();
        System.out.println("Empezo a correr Bubble");

        int n = arrayNumeros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayNumeros[j] > arrayNumeros[j + 1]) {
                    int temp = arrayNumeros[j];
                    arrayNumeros[j]=arrayNumeros[j + 1];
                    arrayNumeros[j + 1]=temp;
                }
            }
        }
        long tiempoFinal = System.nanoTime();
        long duracionSegundos = (tiempoFinal- tiempoInicial)/1000000;
        System.out.println("Bubble Termino de ordenar Duracion en segundos: " + duracionSegundos);
        System.out.println("Lista: " + Arrays.toString(arrayNumeros)+"\n");
    }
}
