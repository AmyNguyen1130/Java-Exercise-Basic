
import java.util.Arrays;

public class Exersice1 {


    public static void main(String[] args) {
        sortString();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static char[] convertToArray (String str){
        char[] charArray = str.toCharArray();
        return charArray;
    }

    public static void sortString(){
        String[] strArray = {"is2", "pa6" ,"Thi1s", "T4est", "3a", "th5"};
        String temp = "";
        int max = -1;
        for (int i = 0; i < strArray.length; i++){
            char[] itemToArray = convertToArray(strArray[i]);
            for(int j = 0; j <= itemToArray.length -1; j++){
                if(isNumeric(String.valueOf(itemToArray[j])) == true){
                    if(itemToArray[j] < max){
                        temp = strArray[i];
                        strArray[i] = strArray[i - 1];
                        strArray[i - 1] = temp;
                        i -= 2;
                    } else {
                        max = itemToArray[j];
                    }
                }
            }
        }
        System.out.println("array:" + Arrays.toString(strArray));
    }
}
