package programas;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void main(String[] args) {

		Operaciones ope = new Operaciones();
	//	ope.prueba();
		

	}

	double a = 0, b = 0, c = 0, d = 0, x1 = 0, x2 = 0, prim;
	int suma = 0, numero, x, opcion, n, fib, aFib, bFib, resta;
	String opcionNull = " ", nNull, primNull, aNull, bNull, cNull;
	
	
	public int resta(int restaa, int restab){
		resta = restaa - restab;
		return resta;
		
		
	}

	/*

	public void prueba() {

		do {
			opcionNull = JOptionPane.showInputDialog(null, "Selecciona una opcion \n" + "\n 0. Salir"
					+ "\n 1. Formula General" + "\n 2. Serie Fibonacci" + "\n 3. Numero Primo" + "\n 4. Sumatoria");

			if (opcionNull == null) {
				System.exit(0);
			} else {

				try {
					Integer.parseInt(opcionNull);
				} catch (NumberFormatException ex) {
					System.out.println("Debe elegir una de las opciones anteriores");
					prueba();
				}

				opcion = Integer.parseInt(opcionNull);

			}
			switch (opcion) {

			case 0:
				System.exit(0);

			case 1:
				formulaGeneral();

			case 2:
				fibonacci();

			case 3:
				primo();

			case 4:
				sumaNumeros();

			default:
				System.out.println("Debe elegir una de las opciones anteriores");

			}

		} while (opcion != 0);

	}

*/
	//regresar de int a void
	public double formulaGeneral(int a, int b, int c) {

		/*

		aNull = JOptionPane.showInputDialog("Dame el corficiente de a");
		bNull = JOptionPane.showInputDialog("Dame el corficiente de b");
		cNull = JOptionPane.showInputDialog("Dame el corficiente de c");

		if (aNull == null || bNull == null || cNull == null) {
			System.exit(0);

		}

		try {
			Double.parseDouble(aNull);
			Double.parseDouble(bNull);
			Double.parseDouble(cNull);
		} catch (NumberFormatException ex) {
			System.out.println("Debe dar los 3 valores numericos correspondientes");
			formulaGeneral();
		}

		a = Double.parseDouble(aNull);
		b = Double.parseDouble(bNull);
		c = Double.parseDouble(cNull);
		
		*/

		d = Math.pow(b, 2) - 4 * a * c;

		if (d < 0) {

			System.out.println("La solucion no es real");
		} else {
			x1 = (-b + Math.sqrt(d)) / 2 * a;
			x2 = (-b - Math.sqrt(d)) / 2 * a;

			System.out.println("\n");
			System.out.printf("La solucion general es:\n" + "x1: %f\n" + "x2: %f", x1, x2);
		}
		//prueba();
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
		//prueba();
		return x2;
		
	}
	
	

	//cambiar de int a void
	public int fibonacci(int n) {

		/*nNull = JOptionPane.showInputDialog("Tamanio de la serie fibbonaci (menor a 40)");

		if (nNull == null) {
			System.exit(0);
		}

		try {
			Integer.parseInt(nNull);
		} catch (NumberFormatException ex) {
			System.out.println("Solo numeros enteros porfavor y no tan grandes");
			fibonacci();
		}

		*/
		
		aFib = 0;
		bFib = 1;

		
		
		/* n = Integer.parseInt(nNull); */
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
		// fib = 0;
		System.out.println("\n");
		return fib;
		
	}

	
	//cambiar de int a void
	public boolean primo(int prim) {

	/*	primNull = JOptionPane.showInputDialog("Dame el numero a verificar si es primo (menor a 2000000000)");

		if (primNull == null) {
			System.exit(0);
		}

		try {
			Integer.parseInt(primNull);
		} catch (NumberFormatException ex) {
			System.out.println("Solo numeros enteros porfavor y menores a 2000000000");
			primo();
		}

		prim = Integer.parseInt(primNull);

   */
		boolean bandera=false;
		if (prim == 0) {
			System.out.println("Es primo \n");
			bandera = true;

		} else if (prim > 2000000000) {
			System.out.println("El numero debe ser menor a 2000000000 para evitar errores");
			//primo();
		} else if (prim % 2 == 0 || prim < 0) {
			bandera = false;
			System.out.println("No es primo \n");

		} else {
			bandera = true;
			System.out.println("Es primo \n");
		

		}
		return bandera;
		//prueba();
		
	}

	//cambiar de int a void
	public int sumaNumeros(int n) {

		/*
		nNull = JOptionPane.showInputDialog("Cuantos numeros quieres sumar (menor a 7500000)");

		if (nNull == null) {
			System.exit(0);
		}

		try {
			Integer.parseInt(nNull);
		} catch (NumberFormatException ex) {
			System.out.println("Solo numeros enteros porfavor y menores a 7500000");
			sumaNumeros();
		}

		n = Integer.parseInt(nNull);
		*/
		if (n > 0) {
			for (int i = 0; i <= n; i++) {

				suma = suma + i;

			}
			
			System.out.println("La suma de los numeros es " + suma);
		} else {
			System.out.println("La cantidad de numeros a sumar debe ser mayor a 0");
			//sumaNumeros();
		}
		return suma;
	}
}
