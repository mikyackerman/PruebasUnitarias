# INSTITUTO TECNOLOGICO DE MEXICALI

## Introducción

Para este trabajo miraremos cuatro problemas distintos, los cuales son
"Formula General", "Serie Fibonacci", "Número Primo" y "Suma de números".

Utilizaremos JUnit para revisar si nuestros codigos estan correctos y sin
fallos para distintos tipos de valores que se llegaran a ingresar al 
momento de evaluarlos en nuestros metodos.

## Tabla de contenido

- Formula General
- Serie Fibonacci
- Número Primo
- Suma de Numeros

## Formula General

El primer programa a probar es el de "Formula General" en el 
cual se ingresan tres valores (a,b,c) y se evaluan con la misma 
formula general la cual nos dara dos resulatos, en este caso
llamados "X1" y "X2".

El siguiente codigo en java nos sirve para resolver ese problema:

> public double formulaGeneral(int a, int b, int c) {
d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			System.out.println("La solucion no es real");
		} else {
			x1 = (-b + Math.sqrt(d)) / 2 * a;
			x2 = (-b - Math.sqrt(d)) / 2 * a;
			System.out.println("\n");
			System.out.printf("La solucion general es:\n" + "x1: %f\n" + "x2: %f", x1, x2);
		}
		return x1;
	}
	public double formulaGeneralX2(int a, int b, int c) {
		d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			System.out.println("La solucion no es real");
		} else {
			x1 = (-b + Math.sqrt(d)) / 2 * a;
			x2 = (-b - Math.sqrt(d)) / 2 * a;
		}
		return x2;
	}

Una vez creado nuestro codigo crearemos una clase JUNIT en la 
cual haremos nuestras pruebas unitarias para probar con 
distintos casos para ver si tenemos algun error.

Este es el codigo de prueba:

>	@Test
	public void formulaGeneralX1() {
		double est=7.0;
		Operaciones testGeneral = new Operaciones();
		double resultado = testGeneral.formulaGeneral(1,-3,2);
		assertEquals(est,resultado,5.0);
	}
	@Test
	public void formulaGeneralX2() {
		double est=7.0;
		Operaciones testGeneral = new Operaciones();
		double resultado = testGeneral.formulaGeneralX2(1,-3,2);
		assertEquals(est,resultado,6.0);
	}
	
En la parte de nuestro codigo que dice:

>	double est=7.0;
	Operaciones testGeneral = new Operaciones();
    double resultado = testGeneral.formulaGeneral();

>   double resultado = testGeneral.formulaGeneralX2();
    assertEquals(est,resultado,6.0);

Es donde se realizaran todas las pruebas, ingresando entre los parentesis"()" 
los numeros que queremos evaluar, en la formula hay una raiz cuadrada,
si al evaluarse nos da un resultado negativo dentro de ella, nos dira
que no hay solucion.

Crearemos un valor estimado y le daremos un rango para evaluar
si los resultados que obtuvimos estan en ese rango, entre menor sea
el rango con mas exactitud tendremos nuestro resultado, en este caso
tendremos un estimado de 7 con un rango de diferencia de (+6,-6).

Para esta prueba utilizaremos los valores (1,-3,2),(7,-3,2).
Para el ejemplo:
- (1,-3,2)

La prueba nos dice que es correcto ya que los resultados son:
X1 = 2
X2 = 1

En el caso del ejemplo:
- (7,-3,-2)

Nos da como resultado una falla en la prueba mas un mensaje que dice:
"La solucion no es real".

---

## Serie Fibonacci

Nuestro siguiente problema es el de la serie Fibonacci en el cual
ingresaremos un numero, este numero sera la cantidad de valores que
nos mostrara la serie Fibonacci guardando el ultimo resultado en
una variable.

> public int fibonacci(int n) {
    aFib = 0;
	bFib = 1;
	if (n > 0 && n <= 40) {
		for (int i = 0; i < n; i++) {
				aFib = bFib;
				bFib = fib;
				fib = aFib + bFib;
				System.out.print(fib+",");
			}
		} else if (n <= 0) {
			System.out.println("La serie debe tener al menos mayor a 0");
		} else if (n > 40) {
			System.out.println("La serie debe ser menor a 40 numeros para evitar que la pc EXPLOTE!!");
		}
		System.out.println("\n");
		return fib;
	}

Para esta prueba utilizaremos los valores (6),(0) y (-1).

El sigueinte es el codigo JUNIT para las pruebas de la serie Fibonacci:

>	@Test
	public void testFibonacci() {
		System.out.println("Serie Fibonacci");
		Operaciones testFibonacci = new Operaciones();
		int resultado = testFibonacci.fibonacci(6);
		assertEquals(8,resultado);
		
En esta parte de codigo:

> testFibonacci.fibonacci();

Ingresaremos los valores antes mencionados y en:

> assertEquals(8,resultado);

Donde lo evaluaremos, donde "8" es el resultado que esperamos y
"resultado" el ultimo valor de la serie de Fibonacci, el cual lo
comparara para saber si son iguales.

Para el ejemplo:

- (6)

Nos indica que el resultado es correcto

En el caso de:

- (0)

Nos marca error en la prueba, seguido de un mensaje que dice
"almenos debe haber un numero en la serie".

y para:

- (-1)

Otro error el cual indica que debe ser un numero positivo.

---

## Número Primo

En este problema ingresaremos un numero "x" el cual evaluara
si es primo o no, en caso de ser primo nos regresara un valor
"true", caso contrario "false".

El siguiente es el codigo:

> public boolean primo(int prim) {
        boolean bandera=false;
		if (prim == 0) {
			System.out.println("Es primo \n");
			bandera = true;
		} else if (prim > 2000000000) {
			System.out.println("El numero debe ser menor a 2000000000 para evitar              errores");
			//primo();
		} else if (prim % 2 == 0 || prim < 0) {
			bandera = false;
			System.out.println("No es primo \n");
		} else {
			bandera = true;
			System.out.println("Es primo \n");
		}
		return bandera;
		
Para este ejemplo usaremos los valores de prueba (7),(8) y (-1).

Este es el codigo de la prueba unitaria:

> @Test
	public void testPrimo() {
		Operaciones testPrimo = new Operaciones();
		boolean resultado = testPrimo.primo(7);
		assertEquals(true,resultado);
	}
	
En nuestra parte de codigo que dice:

> 	assertEquals(true,resultado);

significa que siempre esperamos que sea un numero primo, dependiendo 
el caso nos dara diferentes resultados.

En el caso de:

- (7)

Nos evalua que es correcto junto con un mensaje de que "Es primo".

Para el caso de:

- (8)

Nos devuelve un "false" asi que la evaluacion nos dice que esta
mal y un mensaje de "No es primo".

Y para:

- (-1)

Otro error el cual nos da un mensaje de "Debe ingresar solo numeros
positivos". 

---

## Suma de Numeros

Para el ultimo problema haremos la suma de los numeros (1+2+3 hasta +N)


El siguiente es el codigo:

> public int sumaNumeros(int n) {
    if (n > 0) {
			for (int i = 0; i <= n; i++) {
				suma = suma + i;
			}
			System.out.println("La suma de los numeros es " + suma);
		} else {
			System.out.println("La cantidad de numeros a sumar debe ser mayor a            0");
		}
		return suma;
	}
	
Y este nuestro codigo de la prueba unitaria.

> @Test
	public void sumaNumeros() {
		Operaciones testSuma = new Operaciones();
		int resultado = testSuma.sumaNumeros(9);
		assertEquals(45,resultado);
	}
	
En la parte de codigo que dice:

> int resultado = testSuma.sumaNumeros(9);

ingresaremos hasta donde queremos que sume numeros en nuestra cadena

y en:

> assertEquals(45,resultado);

Siendo "45" el numero esperado y "resultado" la suma de todos los numeros
hasta el valor que hayamos elegido

Para esta prueba utilizaremos los valores de (-1) y (9).

Para el caso de:

- (9)

Nos marca que nuestra prueba paso con exito ya que al sumar de
1 hasta 9 nos da resultado "45".

Para el caso de:

- (-1)

Nos da un error en la prueba mas un mensaje que dice 
"La cantidad de numeros debe ser mayor a 0".























   
  
