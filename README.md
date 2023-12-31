# ***UD2-PRACTICA 1 - Simulador Productor Consumidor***

- Autor:
    - Nombre:
        - *Ana Isabel González Rosales*
    - Fecha:
        - Noviembre 2.023
    - git:
        - https://github.com/AnaIsabelValle/UD2-PRACTICA1-SimuladorProductorConsumidor

## Introducción:

![.\src\images\granjero.jpg](.\src\images\granjero.jpg)
## Análisis:

Este proyecto simula la interacción entre granjeros y clientes. Los granjeros plantan verduras, las almacenan en el restaurante y los clientes las consumen.

## Sintaxis:

1. Creación de paquetes:
    1. Paquete raíz llamado **net/salesianos**, incluye:

2. Creacción de clases:

    1. **Verduras**:
       * Contiene los métodos para elegir una verdura y tiempo de crecimiento aleatorio.
    2. **Granjero**:
        * Cada instancia de la clase Granjero, se comporta como un hilo independiente que planta verdura.
        * Representa al granjero plantando verdura. 
        * La clase se extiende Thread, para permitir la ejecución concurrente.
        * Método plantar verdura.
        * Método run, que itera sobre plantar verdura y mostrarlo.
    3. **Cliente**: 
       * Cada instancia de la clase Cliente, se comporta como un hilo independiente que consume verdura según las especificaciones.
       * El cliente consume verdura.
       * Método comer verdura, es el proceso de comer verdura por parte del cliente.
       * Genera un tiempo de crecimiento aleatorio.
       * El cliente itera sobre la cantidad de verduras que va a consumir, invocando el método comer verdura.
    4. **Restaurante**:
       * Simula un restaurante que almacena la verdura plantada por los granjeros y las consumidas por los clientes.
       * Utiliza la sincronización para gestionar el acceso concurrente. 
       * Método getArrayVerdura, obtiene la lista actual de verduras.
       * Método guardarVerdura, almacena una verdura y muestra un mensaje en el caso de que esté lleno.
       * Método consumirVerdura, consume una verdura del restaurante y muestra un mensaje si no hay verduras.
    5. La Clase ejecutable **Main**:
       * Se crea un objeto Restaurante llamado restaurante1 con una capacidad de 20 verduras de almacenamiento.
       * Se crea un objeto Granjero llamado granjero1 que planta una verdura y la almacena en el restaurante1.
       * Se crea un objeto Cliente llamado cliente1 que consume la verdura almacenada en el restaurante.
       * Arrancamos los hilos de los granjero1 y granjero2.
       * Arrancamos el hilo del cliente1.
       * Los hilos permiten que estas acciones se realicen de manera concurrente, ofreciendo un entorno simulado de producción y consumo de verduras en el restaurante.
       
   
   