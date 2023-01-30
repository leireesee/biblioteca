package clases;

public class Menu {
	
	final static int GESTIONAR_LIBROS = 1;
	final static int GESTIONAR_SOCIOS = 2;
	final static int GESTIONAR_PRESTAMOS = 3;
	final static int SALIR = 0;
	
	final static int INSERTAR_LIBRO = 1;
	final static int ELIMINAR_LIBRO = 2;
	final static int VER_LIBROS = 3;
	
	final static int VER_SOCIOS = 1;
	
	final static int REALIZAR_PRESTAMO = 1;
	
	
	
	public static void mostrarMenuPrincipal() {
		System.out.println("------MENU-------");
		System.out.println(GESTIONAR_LIBROS +". gestionar libros");
		System.out.println(GESTIONAR_SOCIOS + ". gestionar socios");
		System.out.println(GESTIONAR_PRESTAMOS + ". gestionar prestamos");
		System.out.println(SALIR + ". Salir");
		
		System.out.println("Introduce una opcion");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("Has elegido gestionar libros");
		System.out.println(INSERTAR_LIBRO +". insertar libro");
		System.out.println(ELIMINAR_LIBRO +". eliminar libro");
		System.out.println(VER_LIBROS +". ver libros");
		
		System.out.println("Introduce una opcion");
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("Has elegido gestionar socios");
		System.out.println(VER_SOCIOS +". ver libros");
		
		System.out.println("Introduce una opcion");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("Has elegido gestionar prestamos");
		System.out.println(REALIZAR_PRESTAMO +". ver libros");
		
		System.out.println("Introduce una opcion");
		
	}
}
