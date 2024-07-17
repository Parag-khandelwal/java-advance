package generics;

class Dual<T, S>{
    T object1;
    S object2;

    public Dual(T obj1, S obj2){
        this.object1 = obj1;
        this.object2 = obj2;
    }

    public void display(){
        System.out.println(object1);
        System.out.println(object2);
    }

}

public class DualGenericsExample {
    public static void main(String[] args) {
        Dual<Integer, Float> d1 = new Dual<>(100, 20.5f);
        Dual<String, Double> d2 = new Dual<>("Hello", 50.235d);

        d1.display();
        System.out.println();
        d2.display();
    }
}
