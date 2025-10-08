import java.util.ArrayList;

public class Insertion extends SortingThread {

    public Insertion(ArrayList<Integer> originalArray) {
        super(originalArray, "Insertion Sort");
    }

    @Override
    public void ordenar() {
        int n = arrayNumeros.size();
        for (int i = 1; i < n; i++) {
            int key = arrayNumeros.get(i);
            int j = i - 1;
            while (j >= 0 && arrayNumeros.get(j) > key) {
                arrayNumeros.set(j + 1, arrayNumeros.get(j));
                j = j - 1;
            }
            arrayNumeros.set(j + 1, key);
        }
    }
}