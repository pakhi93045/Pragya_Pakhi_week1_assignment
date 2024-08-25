import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter first number: ");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter second number: ");
	    int b = sc.nextInt();
	    
	    System.out.println("Select an operation: +, -, *, /");
	    char op = sc.next().charAt(0);
	    
	    double res;
	    
	    switch(op){
	        case '+':
	            res = a+b;
	            System.out.println("Result: "+res);
	            break;
	       
	        case '-':
	            res = a-b;
	            System.out.println("Result: "+res);
	            break; 
	            
	        case '*':
	            res = a*b;
	            System.out.println("Result: "+res);
	            break; 
	            
	        case '/':
	            if(b!=0){
	            res = a/b;
	            System.out.println("Result: "+res);
	            }else{
	                System.out.println("Dision by 0 is not possible");
	            }
	            break; 
	            
	       default:
	       System.out.println("Invalid operator");
	       break;
	    }
	}
}
