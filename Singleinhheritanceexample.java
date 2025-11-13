public class Singleinheritanceexample{
    public static void main(String[] args) {
        Dog d = new Dog();
               d.eat(); 
        d.bark();  
    }
}
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dogs can bark");
    }
}