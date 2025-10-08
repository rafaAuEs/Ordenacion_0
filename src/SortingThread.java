import java.util.ArrayList;

public abstract class SortingThread extends Thread{
    public ArrayList<Integer> arrayNumeros;
    public String nombreAlgoritmo;
    public long tiempoEjecucion;

    public SortingThread(ArrayList<Integer> arrayNumeros, String nombre){
        this.arrayNumeros = new ArrayList<>(arrayNumeros);
        this.nombreAlgoritmo = nombre;
    }

    public abstract void ordenar();

    @Override
    public void run(){
        long inicio = System.currentTimeMillis();
            ordenar();
            long fin = System.currentTimeMillis();
            this.tiempoEjecucion = fin - inicio;

            System.out.println(this.nombreAlgoritmo + "finalizo en: " + this.tiempoEjecucion);
    }
}
