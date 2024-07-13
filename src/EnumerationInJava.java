public class EnumerationInJava {
    public static void main(String[] args) {

        Color c1 = Color.RED;
        System.out.println("Red Enum name: " + c1.name());
        System.out.println("Red Enum value: " + c1.getValue());


        for(Color c : Color.values()){
            System.out.println("Enum names are: " + c.name());
            System.out.println("Enum values are: " + c.getValue());
        }
    }
}


enum Color {
    RED("red"), GREEN("green"), BLUE("Blue");

    private String value;

    Color(String v){
        this.value = v;
    }

    public String getValue(){
        return value;
    }
}
