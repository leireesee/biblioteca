package clases;

import java.util.Scanner;

public class GestorLibros {
	public static void run(Scanner scan) {
		int opcion_menu;
				
		do {
			Menu.mostrarMenuLibros();
			opcion_menu = Integer.parseInt(scan.nextLine());
			
			switch (opcion_menu) {
			case Menu.INSERTAR_LIBRO:
				System.out.println("Has elegido insertar libro");
				
				break;
			case Menu.ELIMINAR_LIBRO:
				System.out.println("Has elegido eliminar libro");
				
				break;
			case Menu.VER_LIBROS:
				System.out.println("Has elegido ver libros");
				
				break;
			case Menu.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != Menu.SALIR);
	}
}
