class ChatRoom {
    private static int MAX_CHAT_LOGS = 1000; // The size of the log list is decided to be 1000.
    private String []chatLogs = new String[MAX_CHAT_LOGS]; //a 1000-sized array of String objects "chatLogs" is created.  
    private int totalChats;

    // Our ChatRoom has no defining attributes for now
    public ChatRoom() {
    }

    // Store the user chat
    public void receiveUserChat(String message) {
// Fill out the method - explain your code (how do you make a ChatRoom object store the message?) 
    	chatLogs[totalChats++] = message ;
    }

    // Retreive the chat logs
    public void printLog() {
        // Fill out the method - explain your code (how do you make this object retrieve the log?)
    	int i;
    	
    	for(i = 0 ; i<totalChats ; i++)
    	{	
    		System.out.println(chatLogs[i]);
    	}
    }
}
