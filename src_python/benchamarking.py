import random 
import time
from  metodos_Ordenamiento import MetodosOrdenamiento


class Benchmarking:
    def __init__(self):
        print('Bench inicializado')

    def ejemplo(self):
        
        self.mOordenamiento = MetodosOrdenamiento()
        arreglo = self.bulli_arreglo(1000)

        tarea = lambda: self.mOordenamiento.sortByBubble(arreglo)
        tiempoMillis = self.contar_con_current_time_milles(tarea)
        tiempoNano = self.contar_con_nano_time(tarea)

        print(f'tiempoMillos{tiempoMillis}')
        print(f'tiempoNano{tiempoNano}')




    def bulli_arreglo(self, tam):
        array = []
        for i in range(tam):
            numero = random.randint(0,99999)
            array.append(numero)
        return array
    
    # ejecutar tarea Tarea()
    

    def contar_con_current_time_milles(self, tarea):
        inicio = time.time()
        tarea()
        fin = time.time()
        return (fin - inicio)
    
    def contar_con_nano_time(self, tarea):
         inicio = time.time_ns()
         tarea()
         fin = time.time_ns()
         return (fin - inicio) / 1_000_000_000.0
    
    def medir_tiempo(self, tarea, array):
        inicio = time.perf_counter()
        tarea(array)
        fin = time.perf_counter()
        return fin - inicio
         