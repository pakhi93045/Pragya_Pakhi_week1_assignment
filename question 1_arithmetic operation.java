import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Input first number- ");
		double a = sc.nextInt();
		System.out.println("Input second number- ");
		double b = sc.nextInt();
		
		double add = a+b;
		double sub = a-b;
		double mut = a*b;
		double div = 0;
		
		if(b!=0){
		    div = a/b;
		}
		else{
		    System.out.println("Divison by 0 is not possible");
		}
		
		System.out.println("Addition: "+add);
		System.out.println("Substraction: "+sub);
		System.out.println("Multiplication: "+mut);
		
		if(b!=0){
		    System.out.println("Division: "+div);
		}
	}
}
