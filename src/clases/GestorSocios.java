package clases;

import java.util.Scanner;

	public class GestorSocios {
		public static void run(Scanner scan) {
			int opcion_menu;
					
			do {
				Menu.mostrarMenuSocios();
				opcion_menu = Integer.parseInt(scan.nextLine());
				
				switch (opcion_menu) {
				case Menu.VER_SOCIOS:
					System.out.println("Has elegido ver socios");
					
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
