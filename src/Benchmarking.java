import java.util.Random;

public class Benchmarking {

    private MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

    public Benchmarking(){
        long iniciooMillis = System.currentTimeMillis();
        long inicioNano = System.nanoTime();

        System.out.println(iniciooMillis);
        System.out.println(inicioNano);

        metodosOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatoreo(1000000);
        Runnable tarea = () -> metodosOrdenamiento.burbujaTradicional(arreglo);

        double tiempoNano = medirConNano(tarea);
        System.out.println("Medir con nano --> "+tiempoNano);
        double tiempoMillis = medirConCurrentTime(tarea);
        System.out.println("Medir con milli --> "+tiempoMillis);

    }

    // Tiempo usado en nanoTime (en segundos)
    public double medirConNano(Runnable tarea){
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return (fin - inicio)/1000_000_000.0;

    }

    //Tiempo usado currentTimeMills (en segundos)
    public double medirConCurrentTime(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return (fin - inicio)/1000.0;
    }
    private  int[] generarArregloAleatoreo(int tamano){
        int [] arreglo = new int[tamano];
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = random.nextInt(100_000);
        }
        return arreglo;
    }
}
