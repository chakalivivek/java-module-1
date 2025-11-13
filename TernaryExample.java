public class TernaryExample {
    public static void main(String[] args){
        int number = 10;
        String result = (number % 2 == 0)? "Even":"odd";
        System.out.println("the number"+ number + "is"+ result);
    }
}
