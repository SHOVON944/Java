package Start_Code;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args){
        ArrayList <Integer> number = new ArrayList<Integer>();

        System.out.println("Size: " + number.size());        
        number.add(20);
        number.add(40);
        number.add(30);
        System.out.println(number);
        number.add(2, 50);
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        for(int i:number){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        Iterator it = number.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        
        number.remove(1);
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        number.removeAll(number);
        System.out.println(number);
        System.out.println("Size: " + number.size());
        
        
    }
}
