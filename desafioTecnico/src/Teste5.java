public class Teste5 {
    public static void main(String[] args) {
        String phrase = "racecar";
        char[] arrayString = phrase.toUpperCase().toCharArray();
        int i = 0;
        int igual = 0;
        int count = 0;
        int teste = 0;
        boolean ehPalindromo = true;
        for ( i = 0; i < arrayString.length; i++ ){
            igual = 1;
            for (int j = i + 1; j < arrayString.length; j++){
                if ( arrayString[i] == arrayString[j] ){
                    igual += 1;
                    teste += 1;
                }

            }
            if (teste + i == arrayString.length){
                break;
            }

            if ( igual % 2 != 0 ){
                count++;
            }

            if ( count > 1 ){
                ehPalindromo = false;
                break;
            }

        }
        System.out.println( ehPalindromo );
    }
}
