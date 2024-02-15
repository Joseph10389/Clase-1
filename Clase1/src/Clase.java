import java.util.Scanner;

public class Clase 
{
	//**** atributos ***
		static String nombreVideojuego;
		
		//arreglo de nombres:
		static String nombresJugadores[];
		
		//matriz de puntajes:
		int puntaje [][];
		
		//promedios:
		float promPuntos, promHP;
		
		//constante para el numero de jugadores:
		final int NUM_JUGADORES = 10;
		
		//métodos	
	public static void main(String[] args) 
	{
		

	}
		
		public static void LeerDatos() 
		{
			
		}	
		
		private static void PedirNombreVideojuego() 
		{
			//se crea objeto para leer por consola;
			Scanner lectorConsola = new Scanner(System.in); 
			System.out.println("Ingrese el nombre del videojuego:");
			nombreVideojuego = lectorConsola.next();
			
		}
		
		private static void PedirInfoTabla() 
		{
			
		}
		
		private static void CalcularProm() 
		{
			
		}
		
		private static void MostrarProm() 
		{
			
		}
	

}
