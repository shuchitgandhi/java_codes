
public class CheckBrackets {

	final static int MAX_INPUT=100;
	MyStack stack[]=new MyStack[MAX_INPUT];
	String output[]=new String[MAX_INPUT];
	int totalInputs;
	
	public CheckBrackets(int N){
		totalInputs=N;
	}
	
	public void setAndCheckBracketBalance(int inputNo,String input){
		
		int inputLength = input.length();
		stack[inputNo]=new MyStack(inputLength);
		String bracket[]=input.split("",inputLength+2);
		output[inputNo]="";
		for(int i=1;i<=inputLength;i++){
			if(openBracketCheck(bracket[i]))
			{
				stack[inputNo].push(bracket[i]);
			}
			else
			{
				String newBracket=bracketInverter(bracket[i]);
				if(!stack[inputNo].isEmpty())
				{
					if(newBracket.equals(stack[inputNo].peek()))
					{
						stack[inputNo].pop();
					}
					else
					{
						output[inputNo]="NO";
						break;
					}
				}
				else output[inputNo]="NO";
			}
				
		}
		
		if(stack[inputNo].isEmpty() && !(output[inputNo].equals("NO")))
		{
			output[inputNo]="YES";
		}
		else output[inputNo]="NO";
		
	}

	public boolean openBracketCheck(String bracket){
		if(bracket.equals("{")||bracket.equals("(")||bracket.equals("[")||bracket.equals("<"))
			return true;
		else return false;
	}
	
	public String bracketInverter(String bracket){
		if(bracket.equals("}"))
			return "{";
		else if(bracket.equals(")"))
				return "(";
		else if(bracket.equals("]"))
				return "[";
		else if(bracket.equals(">"))
			return "<";
		return "a";
	}
	
	public void printOutput(){
		for(int i=0;i<totalInputs;i++){
			System.out.println(output[i]);
		}
	}
}
