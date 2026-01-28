public class MyClass {
    public static void main(String[] args) {
        String firstName = "Isaque";
        String secondName = "Dutra";
        String completeName = completeName(firstName, secondName);
        System.out.println(completeName);
    }
    public static String completeName(String firstName, String secondName){
        return "Hello "+firstName.concat(" ").concat(secondName);
    }
}
