import java.util.Scanner;
public class Simplinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner S1= new Scanner(System.in);
	int p= S1.nextInt();
	int n= S1.nextInt(), r= S1.nextInt();
	float si= p*n*r/100;
	System.out.print("the simpleinterest is :" +si);

	}

}
