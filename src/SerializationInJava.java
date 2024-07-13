import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable{
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getStudentDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

}


public class SerializationInJava implements Serializable {
    public static void main(String[] args) {
        Student std = new Student("Parag", 21, "Bengaluru");
        String filename = "C:\\Users\\Dell\\OneDrive\\Desktop\\Advance JAVA\\Advance_java\\test.txt";

        FileOutputStream fileOutput = null;  // For writing into the file
        ObjectOutputStream objOutput = null;   // For creating an object

        // SERIALIZATION
        try{
            fileOutput = new FileOutputStream(filename);
            objOutput = new ObjectOutputStream(fileOutput);
            objOutput.writeObject(std);  // write the object `std` into the filename

            fileOutput.close();
            objOutput.close();

            System.out.println("Object has been serialized! " + std);
        }catch(IOException ex){
            System.out.println("IO Exception is caught!");
        }

        // DESERIALIZATION
        FileInputStream fileInp = null;
        ObjectInputStream objInp = null;

        try {
            fileInp = new FileInputStream(filename);
            objInp = new ObjectInputStream(fileInp);

            Student object = (Student) objInp.readObject();

            System.out.println("Object is been deserialized! " + object);

            objInp.close();
            fileInp.close();


        } catch (Exception e) {
            // TODO: handle exception
        }





    }    

}
