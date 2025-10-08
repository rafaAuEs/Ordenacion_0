import java.util.ArrayList;

public class Bubble extends SortingThread {

    public Bubble(ArrayList<Integer> originalArray) {
        super(originalArray, "Bubble");
    }

    @Override
    public void ordenar() {
        int n = arrayNumeros.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayNumeros.get(j) > arrayNumeros.get(j + 1)) {
                    int temp = arrayNumeros.get(j);
                    arrayNumeros.set(j, arrayNumeros.get(j + 1));
                    arrayNumeros.set(j + 1, temp);
                }
            }
        }
    }
}
