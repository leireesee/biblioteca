package clases;

import java.util.Scanner;

public class GestorBiblioteca {
	
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		int opcion_menu;
				
		do {
			Menu.mostrarMenuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());
			
			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				System.out.println("---------------------------------");
				break;
			case Menu.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != Menu.SALIR);
		scan.close();
	}
}
