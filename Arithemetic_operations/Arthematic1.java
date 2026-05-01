import java.util.Scanner;
class Arthematic1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int a=sc.nextInt();
		System.out.print("enter b number: ");
		int b=sc.nextInt();
		
		int sub=a-b;
		int multiply=a*b;
		
		System.out.println("subtraction of a and b: "+sub);
		System.out.println("multiplication of a and b: "+multiply);
	}
}