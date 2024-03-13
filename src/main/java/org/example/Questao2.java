package org.example;

public class Questao2 {
    public static void main(String[] args) {
        int number = 21;
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        boolean found = false;

        System.out.print("Sequencia de fibonacci até o  " + number + ": ");

        while (nextNumber <= number) {
            System.out.print(nextNumber + " ");
            if (nextNumber == number) {
                found = true;
            }
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        if (found) {
            System.out.println("\n" + number + " é parte da sequencia de fibonacci");
        } else {
            System.out.println("\n" + number + " não é parte da sequencia de fibonacci");
        }
    }
}
