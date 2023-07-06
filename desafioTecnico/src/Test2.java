public class Test2 {
    public static void main(String[] args) {
        String phrase = "Hello, World!";
        char[] chars = phrase.toCharArray();

        for(int i = 0; i < chars.length; i++){
            for (int j = (i + 1); j < chars.length; j++){
                if ((chars[i] == chars[j]) && (chars[i] != '\0')){
                    chars[j] = '\0';
                }
            }
        }
        phrase = "";

        for (int i = 0; i < chars.length; i++){
            if (chars[i] != '\0'){
                phrase += chars[i];
            }

        }

        System.out.println(phrase);
    }
}
