package clases;

import java.util.Scanner;

	public class GestorSocios {
		public static void run(Scanner scan) {
			int opcion_menu;
					
			do {
				Menu.mostrarMenuSocios();
				opcion_menu = Integer.parseInt(scan.nextLine());
				
				switch (opcion_menu) {
				case 1:
					System.out.println("Has elegido insertar libro");
					
					break;
				case 2:
					System.out.println("Has elegido eliminar libro");
					
					break;
				case 3:
					System.out.println("Has elegido ver libros");
					
					break;
				case 0:
					System.out.println("ADIOS");
					break;
				default:
					System.out.println("Opcion incorrecta!");
				}
	
			} while (opcion_menu != SALIR);
		}
}
