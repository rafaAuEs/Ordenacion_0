import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumerosOriginal = new ArrayList<>();
        arrayNumerosOriginal.add(346);
        arrayNumerosOriginal.add(8498);
        arrayNumerosOriginal.add(12543);
        arrayNumerosOriginal.add(35342);
        arrayNumerosOriginal.add(2135);
        arrayNumerosOriginal.add(578);
        arrayNumerosOriginal.add(395349);
        arrayNumerosOriginal.add(436547);
        arrayNumerosOriginal.add(21545);
        arrayNumerosOriginal.add(55486);


        System.out.println("Iniciando Bubble Sort...");

        Bubble bubbleThread = new Bubble(arrayNumerosOriginal);
        Selection selectionThread = new Selection(arrayNumerosOriginal);
        Insertion insertionThread = new Insertion(arrayNumerosOriginal);

        bubbleThread.start();
        selectionThread.start();
        insertionThread.start();

        System.out.println("\nResultado Final");
        System.out.println("Bubble Sort tardó: " + bubbleThread.tiempoEjecucion + " ms");

    }
}