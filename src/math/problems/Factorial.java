package math.problems;

public class
Factorial {
    public static long fact( long n) {


        if (n > 1)
            return n * fact(n - 1);
        else
            return 1;}


        public static void main (String[]args){
            /*
             * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
             * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
             *
             */
            //using iteration
            int number = 5;
            long factor = 1;
            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }
            System.out.println("factorial of " + number + " is" + " " + factor);


            //using recursion


            System.out.println("The factorial " + fact(5));


        }
    }
