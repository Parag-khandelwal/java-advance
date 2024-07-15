// Autoboxing means converting primitive datatype {ex:int} into an object class {ex:Integer}


public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        int px = 255;

        //Autoboxing =>
        Integer pixel = Integer.valueOf(px);
        System.out.println("Integer object value: " + pixel);

        //Auto-Unboxing =>
        int rev = pixel;
        System.out.println("Unboxing value: " + rev);

        
        Character ch = 'a';
        char c = ch;
        System.out.println("Character class => " + ch);
        System.out.println("Character dtype => " + c);

        // Same for all other primitive dtype and thier corrosponding wrapper classes.

    }
    
}