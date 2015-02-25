public class MyStack {
   private int maxSize;
   private String[] stackArray;
   private int top;
   
   public MyStack(int s) {
      maxSize = s;
      stackArray = new String[maxSize];
      top = -1;
   }
   
   public void push(String j) {
      stackArray[++top] = j;
   }
   
   public String pop() {
	  if(top!=-1)
		  return stackArray[top--];
	  else return null;
   }
   
   public String peek() {
	   if(top!=-1)
		   return stackArray[top];
	   return null;
   }
   
   public boolean isEmpty() {
      return (top == -1);
   }
   
   public boolean isFull() {
      return (top == maxSize - 1);
   }
  
}