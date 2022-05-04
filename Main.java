import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args){

        int[] fibionacciArray = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        System.out.println(Arrays.toString(orderArray(fibionacciArray)));
    }

    public static int[] orderArray(int[] fibionacciArray){
        int pointer = 0;
        for (int i=1; i < fibionacciArray.length; i++){
            if(fibionacciArray[i] % 2 == 0 && fibionacciArray[pointer] % 2 == 1){
                int aux = fibionacciArray[pointer];
                fibionacciArray[pointer] = fibionacciArray[i];
                fibionacciArray[i] = aux;
                pointer++;
            }
        }

        return fibionacciArray;
    }
}
