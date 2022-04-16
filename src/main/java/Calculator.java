import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
//    private static final Logger logger = LogManager.getLogger(String.valueOf(Calculator.class));
    public Calculator()
    {

    }
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        int choice;
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Scientific Calculator!!!");
        while (true)
        {
            System.out.print("Choose to perform operation \n 1.Square Root \n 2.Factorial \n 3.Natural Logarithm \n 4.Power function \n 5.Exit");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square Root of " + num1 + " = " + cal.squareRoot(num1));
                    break;

                case 2:
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    double result = cal.factorial(num1);
                    System.out.println("Factorial of " + num1 + " = " + result);
                    break;
                case 3:
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + num1 + " = " + cal.logarithm(num1));
                    break;
                case 4:
                    System.out.println("Power Function:");
                    System.out.println("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Power :" + num1 + "^" + num2 + " = " + cal.power(num1,num2));
                    break;

                case 5:
                    System.out.println("Exiting....");
                    exit(0);
                default:
                    System.out.println("Invalid choice of operation");

            }
            System.out.println("\n");
        }
    }
    public double squareRoot(double var){
        System.out.print("Calculating Square Root of : " + var + "\n Result : " + Math.sqrt(var));
//        logger.info("Calculating Square Root of : " + var + "\n Result : " + Math.sqrt(var));
        return Math.sqrt(var);
    }
    public double factorial(double var){
        if(var < 0){
            System.out.print("Factorial of negative number is not possible!");
//            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= var; i++){
                fact *= i;
            }
            System.out.print("Factorial of the number : " + var + "\n Result is : " + fact);
//            logger.info("Factorial of the number : " + var + "\n Result is : " + fact);
            return fact;
        }
    }

    public double logarithm(double var){
        System.out.print("Calculating Natural Logarithm of : " + var + "\n Result : " + Math.log(var));
//        logger.info("Calculating Natural Logarithm of : " + var + "\n Result : " + Math.log(var));
        return Math.log(var);
    }
    public double power(double var1, double var2){
        System.out.print("Power : " + var1 + "^" + var2 + "/n Result : " + Math.pow(var1, var2));
//        logger.info("Power : " + var1 + "^" + var2 + "/n Result : " + Math.pow(var1, var2));
        return Math.pow(var1, var2);
    }

//    }

}

