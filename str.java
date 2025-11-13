public class str {
    public static void main(String[] args){
        String a = "Hello";
        String b = "hello";
        System.out.println(a);
         System.out.println(a.toUpperCase());
          System.out.println(a.toLowerCase());
          System.out.println(a.length());
          System.out.println(a.charAt(0));
          if(a.equalsIgnoreCase(b)){
            System.out.println("both the strings are equal");
          }
          else{
            System.out.println("they are not equal");
          }
}
}

