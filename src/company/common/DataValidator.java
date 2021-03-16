package company.common;

import java.util.Scanner;

public class DataValidator {
    //The string is only correct when there are only numbers without symbols or letters  exceptions (1 dot is allowed) (1 + or 1 - is allowed at the start of the sentence)
    // and it can not be an empty string
    //error 1) letters or symnols found Done
    //error 2) more than 1 dot Done
    //error 3) string is empty Done
    //error4) string only has . or only has + / - Done
    //error5) +/- were found after another symbol Done
    public static double inputDouble() {
        boolean errorOccurred = false;
        String theString;
        do {
            errorOccurred = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a number: ");
            theString = scanner.nextLine();
            char[] charMas = theString.toCharArray();
            boolean dotCounter = false;
            if (theString.equals(".") || theString.equals("-") || theString.equals("+") || theString.isEmpty()) {
                errorOccurred = true;
            }
            if (theString.startsWith(".")) {
                dotCounter = true;
            }
            for (int i = 0; i < charMas.length; i++) {
                if (Character.isDigit(charMas[i])) {
                    continue;
                }
                if (i == 0 && (charMas[i] == '+' || charMas[i] == '-')) {
                    continue;
                } else if (charMas[i] == '.') {
                    if (dotCounter) {
                        errorOccurred = true;
                    } else {
                        dotCounter = true;
                    }
                } else {
                    errorOccurred = true;
                }
                if (errorOccurred) {
                    System.out.println("The string isn't possible to convert into int try again");
                }
            }
        } while (errorOccurred);
        double Convertion = Double.parseDouble(theString);
        return Convertion;
    }
}
