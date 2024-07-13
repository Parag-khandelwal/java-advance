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

    transient int notToBeSerialized; // transient variables are those which will not be serialized along with the object. Used when we dont want to serialize any variable or property of a class.

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getStudentDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        return "\n";
    }

}


public class SerializationInJava implements Serializable {
    public static void main(String[] args) {
        Student std = new Student("Parag", 21, "Bengaluru");
        std.notToBeSerialized = 350;

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

            System.out.println("Object has been serialized! " + std.getStudentDetails());
        }catch(IOException ex){
            System.out.println("IO Exception is caught!");
        }

        // DESERIALIZATION
        FileInputStream fileInp = null;
        ObjectInputStream objInp = null;

        try {
            fileInp = new FileInputStream(filename);
            objInp = new ObjectInputStream(fileInp);

            Student object = (Student) objInp.readObject(); // readObject method does not know that it is a student type object so we typecast it using (Student)
            // THE CLASS INFORMATION IS LOST UPON SERIALIZATION SO WE TYPECAST IT.

            System.out.println("Object is been deserialized! " + object.getStudentDetails());
            System.out.println("Not to be serialized object value is: " + object.notToBeSerialized); // the value will be 0 bcoz it was a transient variable
            objInp.close();
            fileInp.close();


        } catch (IOException ex) {
            System.out.println("IO Exception occured, " + ex);
        } catch (Exception ex){
            System.out.println("Exception occured, " + ex);
        }

    }    

}
