
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Validate {

    private final String BINARY_VALID = "[0-1]*";
    private final String DECIMAL_VALID = "[0-9]*";
    private final String HEXADECIMAL_VALID = "[0-9A-F]*";

    public int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit.");
        int choice = checkInputChoice(1, 4);
        return choice;
    }

    public int checkInputChoice(int min, int max) {
        Scanner sc = new Scanner(System.in);
        String input;
        int inputChoice = 0;
        boolean condition = false;
        do {
            System.out.print("Enter your choice: ");
            try {
                input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input can not empty. Please enter the number in range [" + min + "-" + max + "]");
                    condition = false;
                } else {
                    inputChoice = Integer.parseInt(input);
                    if (inputChoice >= min && inputChoice <= max) {
                        condition = true;
                    } else {
                        System.out.println("Please enter number in range [" + min + "-" + max + "]");
                        condition = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("InValid Format. Please enter number in range [" + min + "-" + max + "]");
                condition = false;
            }
        } while (!condition);
            return inputChoice;
    }

    public int displayConvert(String base, String base1, String base2) {
        System.out.println("1. Convert from " + base + " to " + base1);
        System.out.println("2. Convert from " + base + " to " + base2);
        int choice = checkInputChoice(1, 2);
        return choice;
    }

    public String checkInputBinary() {
        Scanner sc = new Scanner(System.in);
        String inputBinary;     
        boolean condition = false;
        do {
            System.out.print("Enter number binary: ");
            inputBinary = sc.nextLine().replaceAll(" ", "");
            if (inputBinary.isEmpty()) {
                System.out.println("Input can not empty!");
                condition = false;
            } else {
                if (inputBinary.matches(BINARY_VALID)) {
                    condition = true;
                } else {
                    System.out.println("InValid format. Please enter 0 or 1");
                    condition = false;
                }
            }
        } while (!condition);
        return inputBinary;
    }

    public String checkInputDecimal() {
        Scanner sc = new Scanner(System.in);
        String inputDecimal;
        boolean condition = false;
        do {
            System.out.print("Enter number decimal: ");
            inputDecimal = sc.nextLine().replaceAll(" ", "");
            if (inputDecimal.isEmpty()) {
                System.out.println("Input can not empty!");
                condition = false;
            } else {
                if (inputDecimal.matches(DECIMAL_VALID)) {
                    condition = true;
                } else {
                    System.err.println("InValid format. Please enter number in range [0-9]");
                    condition = false;
                }
            }
        } while (!condition);
        return inputDecimal;
    }

    public String checkInputHexaDecimal() {
        Scanner sc = new Scanner(System.in);
        String inputHexaDecimal;
        boolean condition = false;
        do {
            System.out.print("Enter number hexadecimal: ");
            inputHexaDecimal = sc.nextLine().replaceAll(" ", "");
            if (inputHexaDecimal.isEmpty()) {
                System.out.println("Input can not empty!");
                condition = false;
            } else {
                if (inputHexaDecimal.matches(HEXADECIMAL_VALID)) {
                    condition = true;
                } else {
                    System.err.println("InValid format. Please enter [0-9] or [A-F]");
                    condition = false;
                }
            }
        } while (!condition);
        return inputHexaDecimal;
    }

}
