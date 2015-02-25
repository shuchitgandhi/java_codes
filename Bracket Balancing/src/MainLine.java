import java.io.File;
import java.util.Scanner;

public class MainLine {

	public static void main(String args[]) throws Exception { 
		Scanner s =new Scanner(new File("inputData.txt"));
		int N=s.nextInt();
		s.nextLine();
		CheckBrackets checkBalancedBrackets = new CheckBrackets(N);
		for(int i=0;i<N;i++){
			String input = s.nextLine();
			checkBalancedBrackets.setAndCheckBracketBalance(i, input);
		}
		checkBalancedBrackets.printOutput();
		
	}
}
