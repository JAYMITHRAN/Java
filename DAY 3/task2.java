import java.util.*;
class Friday {
    public static void main(String[] args) 
    {
        Scanner jarvis = new Scanner(System.in);

        double num1 = jarvis.nextDouble();
        double num2 = jarvis.nextDouble();

        char operator = jarvis.next().charAt(0);

        double result=0;

        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) 
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } 
                else 
                {
                    System.out.println("num2 is zero");
                }
                break;

            case '%':
                if (num2 != 0) 
                {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("num 2 = 0");
                }
                break;

            default:
                System.out.println("Invalid operator.");
                break;
        }

        jarvis.close();
    }
}
