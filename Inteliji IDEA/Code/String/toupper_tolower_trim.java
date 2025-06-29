public class toupper_tolower_trim {
    public static void main(String[] args) {

        // main string
        String name = "Computer";
        System.out.println(name);

        // operation for length
        int size = name.length();
        System.out.println(size);

        // operation for lower
        String lower = name.toLowerCase();
        System.out.println(lower);

        // operation for upper
        String upper = name.toUpperCase();
        System.out.println(upper);

        // operation for trim
        String name_1 = "       CSE     ";
        System.out.println(name_1);
        String trm = name_1.trim();
        System.out.println(trm);

        // operation for substring (start only)
        String sub = name.substring(3);
        System.out.println(sub);

        // operation for substring (start,end[start -> end-1])
        String ste = name.substring(2,4);
        System.out.println(ste);

        // operation for replace(char)
        String rep_char = name.replace('u','r');
        System.out.println(rep_char);

        // operation for replace(string)
        String rep_string = name.replace("om","pu");
        System.out.println(rep_string);

        // operation for startsWith
        System.out.println(name.startsWith("Com"));
        System.out.println(name.startsWith("C"));       // don't use char... only use string
        System.out.println(name.startsWith("COm"));
        System.out.println(name.startsWith("Cut"));
        System.out.println("\n\n");

        // operation for endsWith
        System.out.println(name.endsWith("ter"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("tER"));
        System.out.println(name.endsWith("toer"));
        System.out.println("\n\n");


        // operation of checking finding character which is place in this index
        System.out.println(name.charAt(2));

        // operation of finding character starting index
        System.out.println(name.indexOf("pu"));
        System.out.println(name.indexOf('t'));

        String newName = "Competition";
        // operation for finding character starting index checking forward to a specific index(return 1st detect index)
        System.out.println(newName.indexOf("t",6));
        System.out.println(newName.indexOf("s",6)); // don't match value, it's return -1
        System.out.println(newName.indexOf("ti",3));
        System.out.println(newName.indexOf("to",3)); // don't match value, it's return -1
        System.out.println("\n\n");

        // operation for finding character ending
        System.out.println(newName.lastIndexOf("t"));
        System.out.println(newName.lastIndexOf("ti"));
        System.out.println(newName.lastIndexOf("s")); // don't match value, it's return -1

        // operation for finding character ending index checking back to a specific index(return last detect index)
        System.out.println(newName.lastIndexOf("ti",6));
        System.out.println(newName.lastIndexOf("ti",7)); // eta back vabe check korbe tobe jeta khujte bola hoice setar 1st aphabate pawa gelei tokhon check korbe forward vabe j ami jei string/char(majorly string) ti khujci seta ase kin
        System.out.println(newName.lastIndexOf("ti",3));
        System.out.println(newName.lastIndexOf("s",3));
        System.out.println("\n\n");

        // operation for equals checking[Case sensitive]
        System.out.println(name.equals("Computer"));
        System.out.println(name.equals("coMputer"));
        System.out.println(name.equals("Compute"));
        System.out.println("\n\n");

        // operation for equals checking[Avoid case sensitive]
        System.out.println(name.equalsIgnoreCase("Computer"));
        System.out.println(name.equalsIgnoreCase("comPutEr"));
        System.out.println(name.equalsIgnoreCase("Compute"));

        // operation for size(length)
        String new_n = "I am a CSE student.";
        System.out.println(new_n.length());

    }
}
