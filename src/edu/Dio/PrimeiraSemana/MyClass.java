package edu.Dio.PrimeiraSemana;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("What´s your first name?");
        String firstName = scanner.nextLine();
            System.out.println("What´s your second name?");
        String secondName = scanner.nextLine();

        String completeName = completeName(firstName, secondName);
            System.out.println(completeName);

        scanner.close();
    }
    public static String completeName(String firstName, String secondName){
        return "Hello "+firstName.concat(" ").concat(secondName);
    }
}
