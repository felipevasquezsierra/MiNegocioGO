package service.validators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypeValidator {

    static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt){
        while(true) {
            try {
                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Solo se aceptan numeros enteros");
            }
        }
    }

    public static Double validateDouble(String prompt){
        while(true) {
            try {
                System.out.println(prompt);
                Double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Solo se aceptan numeros decimales");
            }
        }
    }

    public static String validateString(String prompt){
        while(true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            if(!value.isEmpty()){
                return value;
            }
        }
    }
}
