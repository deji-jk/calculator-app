import java.util.Scanner;
class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result =0;
        
        switch(operator) 
        {
            case '+':
                result =(double)num1+num2;
                break;
            case '-':
                result =(double)num1-num2;
                break;
            case '*':
                result =(double)num1*num2;
                break;
            case '/':
                result =(double)num1/num2;
                break;
            default:
                System.out.println("Invalid operator!");
          }
        
             System.out.println(num1+ " " +operator+ " " +num2 + " = " +result);
        
             scanner.close();
    }
}