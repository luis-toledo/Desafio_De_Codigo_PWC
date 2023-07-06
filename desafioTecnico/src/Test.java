public class Test {
    //EXERCICIO O1
    public static void main(String[] args) {
        String phrase = "Hello, Worid! OpenAl is amazing.";
        String[] arrayPhrase = phrase.split("(?<=\\\\s)|(?=\\\\s)");
        String reversePhrase = "";

        for (int i = (arrayPhrase.length - 1); i >= 0; i--){
            reversePhrase = reversePhrase + arrayPhrase[i];
        }
        System.out.println(reversePhrase);
    }

}
