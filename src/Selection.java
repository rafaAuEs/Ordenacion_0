import java.util.ArrayList;

public class Selection extends SortingThread {

    public Selection(ArrayList<Integer> originalArray) {
        super(originalArray, "Selection Sort");
    }

    @Override
    public void ordenar() {
        int n = arrayNumeros.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arrayNumeros.get(j) < arrayNumeros.get(minIdx)) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arrayNumeros.get(i);
                arrayNumeros.set(i, arrayNumeros.get(minIdx));
                arrayNumeros.set(minIdx, temp);
            }
        }
    }
}