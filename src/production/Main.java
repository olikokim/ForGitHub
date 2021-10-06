package production;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator, romannumber1, romannumber2;
        int  result, number1, number2, number3, number4;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        Scanner input1 = new Scanner (System.in);

        // ask users to enter numbers
        System.out.println("Enter first number");
        if (input1.hasNextInt()){int number1= input1.nextInt()}
        else {String romannumber1=input1.next().charAt(0)};


        System.out.println("Enter second number");
        if (input1.hasNextInt()){int number2= input1.nextInt()};
                else {String romannumber2=input1.next().charAt(0)};




        if (number1 <= 10 && number2 <= 10) {

            switch (operator) {

                // performs addition between numbers
                case '+' -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }

                // performs subtraction between numbers
                case '-' -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }

                // performs multiplication between numbers
                case '*' -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }

                // performs division between numbers
                case '/' -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                default -> System.out.println("Invalid operator!");
            }

            input.close();
        } else {
            System.out.println("Input error");
        }
    }

}



