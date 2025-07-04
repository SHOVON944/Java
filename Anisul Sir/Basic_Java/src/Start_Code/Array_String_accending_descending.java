package Start_Code;
import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println("");
        
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
