import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: el metodo retorna un arreglo de enteros vacios linea 21
    // solucion cambiar el return para que regrese la variable 'areglo'
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo; // Arreglo correctamente arreglado
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: el error encontrado el el ordenamiento que tiene el codigo
    // solucion cambiar el ordenamiento de menor a mayor

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: el error encontrado es en el for ya que le estaba igualanado al cero
    // Soucion: hacer que j se valla comparando con i
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0 ; j < n -1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];

                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: el error  encontrado en seleccion  no retorna nada
    // solucion cambiar el return para que regrese la variable 'arreglo'
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j--) {
                if (arreglo[indiceMinimo] > arreglo[j]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[i];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[indiceMinimo] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i > 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; j >= 0 && arreglo[j] > actual; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j;

            while (i > 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i++;
            }
            arreglo[i + 1] = key;
        }
        return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 };
    }

}
