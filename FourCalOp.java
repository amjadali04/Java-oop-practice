import java.util.Scanner;

public class FourCalOp {
    	public static void main(String[]args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter ur first number: ");
		int a = Sc.nextInt();
	System.out.println("Enter ur sceond number");
	int b = Sc.nextInt();
	System.out.println("Enter operation symbol");
	char ch = Sc.next().charAt(0);
	if(ch =='+') {
	System.out.println("addition = "+(a+b));
	}
	else if(ch =='-') {
	System.out.println("subtraction = "+(a-b));
	}
	else if(ch =='*') {
	System.out.println("multiplication= "+(a*b));
	}
	else if(ch == '/') {
	System.out.println("division = "+(float)a/b);
	}
	}

}

    

