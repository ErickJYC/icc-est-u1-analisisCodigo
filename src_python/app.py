# import benchamarking as Ben
from benchamarking import Benchmarking
from metodos_Ordenamiento import MetodosOrdenamiento



if __name__ == "__main__":
    print("Funciona")
    # Benchmarking()

    # Instancias
    metodos = MetodosOrdenamiento
    benchmark = Benchmarking()

    tam = 1000
    arreglo_base = benchmark.bulli_arreglo(tam)

    mO = {
        "Burbuja" : metodos.sortByBubble,
        "Seleccion": metodos.sort_selleccion,
    }
    resultados = []
    for nombre, metodos in mO.items():
        tiempo = benchmark.medir_tiempo(metodos, arreglo_base)
        tuplaResultado = (tam, nombre, tiempo)
        resultados.append(tuplaResultado)

    for resultado  in resultados:
        tam,nombre,tiempo = resultado
        print(f"tamano: {tam}, Metodo: {nombre}, Tiempo: {tiempo:.6f} segundos")
        