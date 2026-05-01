import java.util.Scanner;
class Mathematics{
	int firstNum;
	int secondNum;
	
	void addition(){
		int result=firstNum+secondNum;
		System.out.println("addition of firstNum & secondNum: "+result);
	}
	void subtract(){
		int result=firstNum-secondNum;
		System.out.println("subtraction of firstNum & secondNum: "+result);
	}
	void multiply(){
		int result=firstNum-secondNum;
		System.out.println("multiplication of firstNum & secondNum: "+result);
	}
	void division(){
		int result=firstNum/secondNum;
		System.out.println("division of firstNum & secondNum: "+result);
	}
	void takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 1st number: ");
		firstNum=sc.nextInt();
		System.out.print("enter 2nd number: ");
		secondNum=sc.nextInt();
	}
}