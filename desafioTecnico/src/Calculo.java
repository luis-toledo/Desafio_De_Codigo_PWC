public class Calculo {
    private String phrase;
    private String[] arrayPhrase;
    private String reversePhrase;

    private String stringCompare;
    private char[] chars;

    private String longestPalindrome;

    private String subStr;

    private boolean ehPalindromo;



    public String reverseSentence(){

        phrase = "Hello, World! OpenAl is amazing.";
        arrayPhrase = phrase.split("(?<=\\s)|(?=\\s)");
        reversePhrase = "";

        for (int i = (arrayPhrase.length - 1); i >= 0; i--){
            reversePhrase = reversePhrase + arrayPhrase[i];
        }

        return reversePhrase;
    }

    public String deleteDuplicates(){
        phrase = "Hello, World!";
        chars = phrase.toCharArray();

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

        return phrase;

    }

    public String longestPalindromeSubstring(){
        phrase = "babad";
        stringCompare = phrase.toUpperCase();
        chars = stringCompare.toCharArray();
        int minSize = 2;
        longestPalindrome = new String(chars, 0, 2);
        subStr = "";
        int j = 0;


        for (int i = 0; i <= (chars.length - 3); i++){
            for ( j = i + 3; j <= chars.length; j++){
                subStr = stringCompare.substring(i, j);
                StringBuilder builder = new StringBuilder(subStr);
                String stringInverted = builder.reverse().toString();
                //System.out.println(subStr + " " + stringInverted);
                if (subStr.equals(stringInverted)){
                    if( subStr.length() > minSize){
                        longestPalindrome = subStr;
                        minSize = subStr.length();
                    }
                }
            }

        }
        return longestPalindrome;
    }


    public String capitalFirstLetter(){
        phrase = "hello. how are you? I'm fine, thank you.";
        chars = phrase.toCharArray();


        for (int i = 0; i < chars.length; i++){
            if (i == 0){
                chars[i] = Character.toUpperCase(chars[i]);
            }

            if ( (chars[i] == '?' || chars[i] == '.' || chars[i] == '!') && ( i <= ( phrase.length()  - 2) )) {
                chars[i + 2] = Character.toUpperCase(chars[i + 2]);
            }

        }
        phrase = new String(chars);
        return phrase;
    }

    public String anagramOfAPalindrome(){
        phrase = "racecar";
        chars = phrase.toUpperCase().toCharArray();
        int i = 0;
        int equal = 0;
        int count = 0;
        int checked = 0;
        ehPalindromo = true;
        for ( i = 0; i < chars.length; i++ ){
            equal = 1;
            for (int j = i + 1; j < chars.length; j++){
                if ( chars[i] == chars[j] ){
                    equal += 1;
                    checked += 1;
                }

            }
            if (checked + i == chars.length){
                break;
            }

            if ( equal % 2 != 0 ){
                count++;
            }

            if ( count > 1 ){
                ehPalindromo = false;
                break;
            }

        }

        if (ehPalindromo){
            phrase = "True";
        } else {
            phrase = "False";
        }

       return phrase;
    }


    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String[] getArrayPhrase() {
        return arrayPhrase;
    }

    public void setArrayPhrase(String[] arrayPhrase) {
        this.arrayPhrase = arrayPhrase;
    }

    public String getReversePhrase() {
        return reversePhrase;
    }

    public void setReversePhrase(String reversePhrase) {
        this.reversePhrase = reversePhrase;
    }

    public String getStringCompare() {
        return stringCompare;
    }

    public void setStringCompare(String stringCompare) {
        this.stringCompare = stringCompare;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public String getLongestPalindrome() {
        return longestPalindrome;
    }

    public void setLongestPalindrome(String longestPalindrome) {
        this.longestPalindrome = longestPalindrome;
    }

    public String getSubStr() {
        return subStr;
    }

    public void setSubStr(String subStr) {
        this.subStr = subStr;
    }

    public void setEhPalindromo(boolean ehPalindromo) {
        this.ehPalindromo = ehPalindromo;
    }

    public boolean isEhPalindromo() {
        return ehPalindromo;
    }
}

