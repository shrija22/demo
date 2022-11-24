import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,a=-1,b=1,c;
 Scanner S1 = new Scanner(System.in);
 int n=S1.nextInt();
for (i=0;i<=n;i++)
{
	//System.out.print(" "+i);
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
	
}
	}

}
