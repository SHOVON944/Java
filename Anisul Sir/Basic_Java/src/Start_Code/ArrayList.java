package Start_Code;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args){
        ArrayList <Integer> number = new ArrayList<Integer>();
        
        // check size
        System.out.println("Size: " + number.size());        
        
        // add value
        number.add(20);
        number.add(40);
        number.add(30);
        System.out.println(number);
        
        // add value with help  of index, but not replace...increasing index
        number.add(2, 50);
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        // print with for each loop
        for(int i:number){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        // print with iterator
        Iterator it = number.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        
        // remove one element with help of index number
        number.remove(1);
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        // remove all number
        number.removeAll(number); // as same as number.clear();
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        // check array is empty!
        boolean check = number.isEmpty();
        System.out.println("Is number empty! : " + check);
        
        // add number
        number.add(30);
        number.add(10);
        number.add(20);
        
        // check  the number is an array !
        boolean found = number.contains(30);
        System.out.println("Contains 30 ! : " + found);
        
        // check index
        int index = number.indexOf(20);
        System.out.println("The index or 20 : " + index);
        
        //  replace value in specific index
        number.set(1, 50);
        System.out.println("The array is: " + number + " ");
        
        // check value with the help of index number
        int value = number.get(0);
        System.out.println("The value of 0th indes is: " + value);
        
        
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        
        number1.add(1);
        number1.add(2);
        number1.add(3);
        
        
        number2.add(4);
        number2.add(5);
        number2.add(6);
        
        
        number3.add(1);
        number3.add(2);
        number3.add(3);
        
        boolean n1n2 = number1.equals(number2);
        boolean n1n3 = number1.equals(number3);
        System.out.println("Number1 is equal to number2 ! : " + n1n2);
        System.out.println("Number1 is equal to number3 ! : " + n1n3);
        
    }
}
