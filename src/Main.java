import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your points(1-9):");
		int a = in.nextInt();
		
		if(a>=1 && a<=3){
			System.out.println(a*5 + " are your bonus points.");
		}else if(a>=4 && a<=6){
			System.out.println(a*10 + " are your bonus points.");
		}else if(a>=7 && a<=9){
			System.out.println(a*50 + " are your bonus points.");
		}else{
			System.out.println("You entered impossible sum of points.");
		}

	}

}
