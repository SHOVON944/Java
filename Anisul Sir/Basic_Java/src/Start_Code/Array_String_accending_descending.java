package Start_Code;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Array_String_accending_descending {
    public static void main(String[] args){
        int number[] = {5, 10, 15, 12, 6, 3, 15};
        Arrays.sort(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println("");
        
        for(int i=number.length -1; i>=0; i--){
            System.out.print(number[i] + " ");
        }
        System.out.println("\n\n");
        
        // 2nd methood
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(5);
        number1.add(22);
        number1.add(16);
        number1.add(9);
        number1.add(6);
        number1.add(1);
        // sort
        Collections.sort(number1);
        System.out.println("Acsending order: " + number1);
        
        // sort(descending order)
        Collections.sort(number1, Collections.reverseOrder());
        System.out.println("Acsending order: " + number1);
        
        
        String name[] = {"Shovon", "Shuvo", "Ariyan", "Tias", "Tisa"};
        Arrays.sort(name);
        for(int i=0; i<name.length; i++){
            System.out.print(name[i] + " ");
        }
        System.out.println("");
        
        for(int i=name.length-1; i>=0; i--){
            System.out.print(name[i] + " ");
        }
        System.out.println("");
    }
}
