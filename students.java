import java.util.stack;
import java.util.Stack;

public class StudentStack {
    public static void main(String[] args) {
        
        Stack<String> students = new Stack<>();

        students.push("Alice");
        students.push("Bob");
        students.push("Charlie");
        students.push("David");
        students.push("Eva");

        System.out.println("Stack after pushing 5 student names:");
        System.out.println(students);

        String poppedName = students.pop();
        System.out.println("\nPopped name: " + poppedName);
        System.out.println("\nStack after popping one name:");
        System.out.println(students);
    }
}
