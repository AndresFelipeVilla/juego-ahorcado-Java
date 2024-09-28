import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        

        //Clase Scanner que permie de los usuarios escriba
        Scanner scanner = new Scanner(System.in);  

        //Declaraciones y Asignaciones 
        String palabrasecreta = "Intelegencia";  
        int intentosMaximo = 10; 
        int intentos = 0; 
        boolean palabrasAdivinada = false; 

        //Arreglos 
        char[] letrasAdivinadas = new char[palabrasecreta.length()]; 
        
        //Estructura de control - Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_'; 
        }
        
        while (!palabrasAdivinada && intentos < intentosMaximo) {
                                                    //Esto se utiliza cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabrasecreta.length() + " Letras)"); 
            
            System.out.println("Introduce una letra, por favor");

            //Se utilizo la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));   

            boolean letraCorrecta = false;  

            for (int i = 0; i < palabrasecreta.length(); i++) {
                //Estructura de control - condicional 
                if (palabrasecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 

                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Inorrecto!! Te quedan" + (intentosMaximo - intentos) + "intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabrasecreta)) {
                palabrasAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta "  + palabrasecreta);                      
            }

            if (!palabrasAdivinada) {
                System.out.println("Que pena te has quedado sin intentos! GAME OVER");
            }

       }

       scanner.close(); 
    }
}
