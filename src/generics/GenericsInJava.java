package generics;

class Student<T>{
    T student;

    public Student(T std){
        this.student = std;
    }

    public T getObject(){
        return this.student;
    }
}

public class GenericsInJava {
    public static void main(String[] args) {
        
        // Reusing the same class with same functionality but for different tasks/problems/classes
        
        Student<Integer> tanvi = new Student<Integer>(10);
        System.out.println(tanvi.getObject());
        
        Student<String> parag = new Student<String>("Parag");
        System.out.println(parag.getObject());
    }    
}
