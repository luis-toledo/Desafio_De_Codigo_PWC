import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Phrase str = new Phrase();

        while (true) {

            menu.printMenu();

            Scanner optMenu = new Scanner(System.in);
            int option = optMenu.nextInt();

            switch (option) {
                case 1:
                    System.out.println(str.readSentence());
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
            }


        }
    }

}
