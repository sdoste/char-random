import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        // 1- El usuario tiene que acertar un número del 1 al 5, generado aleatoriamente. Le vas preguntando hasta que acierte.
        Scanner teclado =  new Scanner(System.in);
        Integer numeroGanador = (int)Math.floor(Math.random() * 5) + 1;
        System.out.println("Di un número del 1 al 5.");
        Integer userGuess = Integer.parseInt(teclado.nextLine()); 
        Integer intentos = 0;
        while (userGuess != numeroGanador){
            intentos++; 
            System.out.println("Número incorrecto. Di otro número del 1 al 5.");
            userGuess = Integer.parseInt(teclado.nextLine()); 
          }
        // Al final, decir en cuantos intentos lo ha conseguido.
        System.out.println("¡Correcto! Lo has adivinado en " + intentos + " intentos.");
        
        // 2- Tienes un color preseleccionado, por ejemplo el rojo, y le preguntas al usuario un color a ver si lo acierta (solo le preguntas una vez)
        String color = "amarillo";
        System.out.println("Adivina el color.");
        String colorGuess = teclado.nextLine();
        if (color.equals(colorGuess.toLowerCase())){
            System.out.println("¡Correcto! Era el color " + color);
        } else{
            System.out.println("¡Incorrecto!");
        }
        // 3- Se introduce una frase y se devuelve  el texto a la inversa. Ejemplo: olpmejE
        System.out.println("Introduce una frase para darle la vuelta.");
        String sentence = teclado.nextLine();
        String inversa = "";
        for (int i = sentence.length()-1; i >= 0; i--){
            inversa += String.valueOf(sentence.charAt(i));
        }
        System.out.println("Tu frase al revés sería: " + inversa);
        // 4- Pides un numero de telefono y le quitas, si hay, los espacios, los guiones y los puntos:  456-453-78 quedaria como 45645378
        System.out.println("Introduce tu nº de teléfono ");
        String userPhone =  teclado.nextLine();
        userPhone = userPhone.replaceAll("([\s-\\.]+)", "");
        System.out.println(userPhone);

        // 5- Se pide un texto. Decir si está compuesto solo de minúsculas, solo de mayúsculas o si combina mayúsculas y minúsculas.
        System.out.println("Dame un texto y te digo si está todo en minúsculas, mayúsculas, o mezclado.");
        String userTexto =  teclado.nextLine();
        if (userTexto.equals(userTexto.toLowerCase())){
            System.out.println("Tu texto solo contiene minúsculas.");
        } else if (userTexto.equals(userTexto.toUpperCase())){
            System.out.println("Tu texto solo contiene mayúsculas.");
        } else{
            System.out.println("Tu texto contiene mayúsculas y minúsculas.");
        }
    
    
    teclado.close();
    }
}
