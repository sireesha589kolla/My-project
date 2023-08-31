package solarCalculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
        float a,b;
        int n;
        Scanner sca=new Scanner(System.in); 
		System.out.println("Calculator");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		System.out.print("Choose one Operation: ");
		n= sca.nextInt();
				
		switch (n) {
        case 1:
            System.out.println("Addition");
            System.out.print("Enter First Number: ");
	        a= sca.nextFloat();
	        System.out.print("Enter Second Number: ");
            b= sca.nextFloat();	
            System.out.println("Result=" + sum(a, b));
            break;
        case 2:
            System.out.println("Subtraction");
            System.out.print("Enter First Number: ");
	        a= sca.nextFloat();
	        System.out.print("Enter Second Number: ");
            b= sca.nextFloat();	
            System.out.println("Result=" + subtract(a, b));
            break;
        case 3:
            System.out.println("Multiplication");
            System.out.print("Enter First Number: ");
	        a= sca.nextFloat();
	        System.out.print("Enter Second Number: ");
            b= sca.nextFloat();	
            System.out.println("Result=" + multiply(a, b));
            break;
        case 4:
            System.out.println("Division");
            System.out.print("Enter First Number: ");
	        a= sca.nextFloat();
	        System.out.print("Enter Second Number: ");
            b= sca.nextFloat();	
            if (b != 0) {
            	System.out.println("Result=" + divide(a, b));
            	break;
            } else {
            	System.out.println("Cannot divide by zero!");
            	break;
            }
        case 5:
             System.out.println("Exit...");
             break;
        default:
            System.out.println("Invalid choice!");
    }       
	          
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }
}
