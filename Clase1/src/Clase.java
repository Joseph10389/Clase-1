import java.util.Scanner;

public class Clase 
{
    //**** atributos ***
    static String nombreVideojuego;
    
    //arreglo de nombres:
    static String nombresJugadores[];
    
    //matriz de puntajes:
    static int puntaje[][];
    
    //promedios:
    static float promPuntos, promHP;
    
    //constante para el numero de jugadores:
    final static int NUM_JUGADORES = 10;
    
    //métodos  
    public static void main(String[] args) 
    {
        PedirNombreVideojuego();
        PedirInfoTabla();
        CalcularProm();
        MostrarProm();
    }
    
    public static void LeerDatos() 
    {
        Scanner lectorConsola = new Scanner(System.in); 
        nombresJugadores = new String[NUM_JUGADORES];
        puntaje = new int[NUM_JUGADORES][2]; // 2 puntajes por jugador
        
        for(int i = 0; i < NUM_JUGADORES; i++)
        {
            System.out.println("Ingrese el nombre del jugador " + (i+1) + ":");
            nombresJugadores[i] = lectorConsola.next();
            
            System.out.println("Ingrese el puntaje del jugador " + (i+1) + ":");
            puntaje[i][0] = lectorConsola.nextInt(); // se ingresa el puntaje
            
            System.out.println("Ingrese el puntaje HP del jugador " + (i+1) + ":");
            puntaje[i][1] = lectorConsola.nextInt(); // se ingresa el puntaje HP
        }
    }   
    
    private static void PedirNombreVideojuego() 
    {
        //se crea objeto para leer por consola;
        Scanner lectorConsola = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del videojuego:");
        nombreVideojuego = lectorConsola.next();
        
    }
    
    //tarea
    private static void PedirInfoTabla() 
    {
        LeerDatos();
    }
    
    //tarea
    private static void CalcularProm() 
    {
        float sumPuntos = 0, sumHP = 0;
        for (int i = 0; i < NUM_JUGADORES; i++) {
            sumPuntos += puntaje[i][0]; // Suma de los puntajes
            sumHP += puntaje[i][1]; // Suma de los puntajes HP
        }
        promPuntos = sumPuntos / NUM_JUGADORES; // Promedio de los puntajes
        promHP = sumHP / NUM_JUGADORES; // Promedio de los puntajes HP
    }
    
    //tarea
    private static void MostrarProm() 
    {
        System.out.println("Promedio de puntajes: " + promPuntos);
        System.out.println("Promedio de puntajes HP: " + promHP);
    }
}
