public class Teste3 {
    public static void main(String[] args) {
        String stringInput = "radar";
        String stringCompare = stringInput.toUpperCase();
        char[] arraychars = stringCompare.toCharArray();
        int test2 = 2;
        String teste3 = new String(arraychars, 0, 2);
        String subStr = "";
        int j = 0;


        for (int i = 0; i <= (arraychars.length - 3); i++){
            for ( j = i + 3; j <= arraychars.length; j++){
                subStr = stringCompare.substring(i, j);
                StringBuilder builder = new StringBuilder(subStr);
                String invertido = builder.reverse().toString();
                //System.out.println(subStr + " " + invertido);
                if (subStr.equals(invertido)){
                    if( subStr.length() > test2){
                        teste3 = subStr;
                        test2 = subStr.length();
                    }
                }
            }

        }
       System.out.println(teste3 + " " + test2);
    }
}


/*
   count++;
           if ((i + 3) >= arraychars.length){
           break;
           }*/
