import java.util.Scanner;

public class Phrase {
        String readSentence(){
                Scanner read = new Scanner(System.in);
                System.out.print("Informe uma frase: ");
                String alreadyRead = read.next();
                System.out.println();
                return alreadyRead;
        }
}
