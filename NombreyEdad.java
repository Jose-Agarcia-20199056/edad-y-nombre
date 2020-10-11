package tr1;
import java.util.Scanner;
/**
 *
 * @author ginag
 */
public class Tr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaracion de variables
        String nombre;
        int edad;
        // clase scanner para capturar lo de nuestro teclado
        Scanner pantalla = new Scanner (System.in); 
        //mostrar las preguntas por pantalla 
        System.out.print("  Digite su nombre please: ");
        //leer la entrada de texto
        nombre = pantalla.nextLine();
        System.out.print("  Digite su edad please: ");
        edad = pantalla.nextInt();
        // mostrar y concatenar
        System.out.print("Su nombre es:"+nombre+ " Su edad es:"+edad);
    }
    
}
