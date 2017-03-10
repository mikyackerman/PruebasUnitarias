

# Cafeteria Express


### Tabla de contenido



 * Introduccion
 * Grafos
 * Calculo de  tiempo
 * Tiempo de espera
 * Tipos de caminos

![](https://github.com/migueshock/Mi-CVU/blob/master/yo.jpg) 

--

### Introduccion.

Nuestro objetivo al realizar este proyecto es el de brindar opciones de comida preparada en la cafetería del Instituto Tecnológico De Mexicali para sus clientes en base al tiempo con el que cuentan dentro de su horario, para ello analizaremos el tiempo promedio que se tarda una persona común en trasladarse de cada uno de los edificios hasta la cafetería, así como los tiempos de preparación e ingesta de los alimentos, también consideraremos el tiempo de espera para ser atendido en mostrador con base en la hora estimada de arribo a la cafetería.

---

### Grafos.

En primer lugar analizamos el tiempo de traslado entre cada uno de los edificios con base a la distancia y ruta común entre ellos, con estos datos creamos un grafo no dirigido en el que todos los nodos se conectan a uno central (Cafetería), asignando como peso el tiempo estimado de camino entre cualquier edificio y la cafetería. Al tener ya el grafo descrito procederemos a ingresar los hechos a nuestro programa de Prolog, en el que lograremos la letra del edificio al tiempo estimado de traslado.

---

### Cálculo de tiempo.

Nos daremos también a la tarea de investigar los tiempos de preparación de algunos de los alimentos más comunes que son consumidos en la cafetería, así como el tiempo de ingesta, para ello consideraremos que algunos alimentos pueden ser consumidos al trasladarse por lo que a ellos les asignaremos como tiempo de ingesta 0 ya que no es necesario permanecer en la cafetería para consumirlos.

---


### Tiempo de espera.

Consideraremos también los tiempos estimados de espera de acuerdo a la hora en que ingresemos a la cafetería ya que existen momentos en el día en que contamos con un cuello de botella en mostrador.

---

### Tipos de caminos

#### Camino Directo

- L>C>L
- B>C>B
- A>C>A
- F>C>F
- V>C>V
- U>C>U
- G>C>G
- Q>C>Q
- D>C>D
- M>C>M
- X>C>X
- I>C>I
- H>C>H
- J>C>J

#### Camino Random

- L>C>B
- B>C>A
- A>C>F
- F>C>V
- V>C>U
- U>C>G
- G>C>Q
- Q>C>D
- D>C>M
- M>C>X
- X>C>I
- I>C>H
- H>C>J
- J>C>L




