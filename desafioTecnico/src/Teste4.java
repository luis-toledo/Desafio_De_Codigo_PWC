public class Teste4 {

    public static void main(String[] args) {
        String phrase = "hello. how are you? I'm fine, thank you.";
        char[] chars = phrase.toCharArray();


        for (int i = 0; i < chars.length; i++){
            if (i == 0){
                chars[i] = Character.toUpperCase(chars[i]);
            }

            if ( (chars[i] == '?' || chars[i] == '.' || chars[i] == '!') && ( i <= ( phrase.length()  - 2) )) {
                chars[i + 2] = Character.toUpperCase(chars[i + 2]);
            }
            
        }
        System.out.println(chars);
    }

}
