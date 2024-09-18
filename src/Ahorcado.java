import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        String PalabraSecreta ="yoquese";
        int intMaximo = 10;
        int intento=0;
        boolean palAdivinada= false;

        char[] letAdivinada= new char[PalabraSecreta.length()];

        for (int i = 0; i < letAdivinada.length; i++) {
            letAdivinada[i]='_';
            
        }

        while (!palAdivinada && intento< intMaximo) {
            System.out.println("Palabra a adivinar"+ String.valueOf(letAdivinada)+" ("+PalabraSecreta.length()+") ");
            System.out.println("Introduce una letra, pro favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));


            boolean letraCorrecta =false;
            for (int i=0; i< PalabraSecreta.length();i++){
                if(PalabraSecreta.charAt(i)== letra){
                    letAdivinada[i] =letra;
                    letraCorrecta = true;
                }
            } 
            if (!letraCorrecta){
                intento++;
                System.err.println("!Incorrecto! Te quedan"+(intMaximo-intento)+ "intentos.");
            }
            if(String.valueOf(letAdivinada).equals(PalabraSecreta)){
                palAdivinada=true;
                System.out.println("Felicidades acabas de adivinar la palabra secreta"+ (PalabraSecreta));

            }

            
        }
        if (!palAdivinada) {
            System.out.println("Te quedaste sin intentos perdiste!!!!GAME OVER"+(PalabraSecreta)+"Era la palabra");
        }
        scanner.close();
    }
}
