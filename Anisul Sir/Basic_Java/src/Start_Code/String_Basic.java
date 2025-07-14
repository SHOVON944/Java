package Start_code;

public class String_Basic {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "hello";
        String s4 = "";
        System.out.println(s1);
        int size = s1.length();
        System.out.println("Size of s1: " + size);
        
        //chekck equal
        if(s1.equals(s2)){  // s1.contains(s2) as same as. boelean use kora jabe
            System.out.println("Equals");
        } else{
            System.out.println("Not  Equals");
        }
        
        // check equal ignore case sensitive
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("It is equal.");
        } else{
            System.out.println("It is not equal.");
        }
        
        // is Empty !
        boolean check = s4.isEmpty();
        System.out.println("s4 is empty!: " + check);
        
        
        // add string(name type), as like conCatinasion
        String first = "Clash Of ";
        String last = "Clans";
        String full = first + last;
        System.out.println("Full name : " + full);
        
        // using concat
        String full_n = first.concat(last);
        System.out.println("The name is :  " + full_n + 1);
        
        // full string uppercase
        String upper = first.toUpperCase();
        System.out.println("First name uppercase: " + upper);
        
        // full string lowercase
        String lower = last.toLowerCase();
        System.out.println("First name lowercase: " + lower);
        
        // checking what is the first character
        boolean a = first.startsWith("Clas");
        System.out.println("first String first char/string is A ! : " + a);
        
        // checking what is the last character
        boolean b = last.endsWith("ns");
        System.out.println("first String last char/string is ns ! : " + b);
        
        String[] names= {"SHOVON", "SHUVO", "TIAS", "ARIYAN", "TAHSIN"};
        for(int i=0; i<names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println("");
        
        String game = "Clash of Clans";
        // checking index position character
        char ch = game.charAt(0);
        System.out.println("Ch: " + ch);
        
        // cheking index character ASCII value
        int ascii_value = game.codePointAt(0);
        System.out.println("ASCII value is: " + ascii_value);
        
        // checking charter index position
        int position = game.indexOf("of");
        System.out.println("Position is: " + position);
        position = game.indexOf("C");
        System.out.println("Position is: " + position);
        
        // remove front and back space
        String game_one = "   Clash Royal    ";
        System.out.println(game_one);
        String game_oneEdit = game_one.trim();
        System.out.println(game_oneEdit);
        
        
        String number = "01705-199367";
        System.out.println(number);
        
        // replace
        String n1 = number.replace('0', '1');
        System.out.println("Replace : " + n1);
        
        // spliting
        String n2[] = number.split("-");
        for(String s:n2){
            System.out.println(s);
        }
    }
}
