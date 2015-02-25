public class User {
    private String name;
    private int totalReceived;
    private int totalSent;
    private String chatsSent[];
    private String chatsReceived[];
    
    public User(String name)
    {
        this.name=name;
        chatsSent=new String[100];
        chatsReceived=new String[100];
        totalReceived=0;
        totalSent=0;
    }
    
    public void receiveMessageSent(String str,String receiver)
    {
        chatsSent[totalSent]=receiver+" : "+str;
        totalSent++;
    }
    
    public void receiveMessageReceived(String str,String sender)
    {
        chatsReceived[totalReceived]=sender+" : "+str;
        totalReceived++;
    }

    public void printLog()
    {
        System.out.println("Messages sent by "+this.name+" are:");
        for(int i=0;i<totalSent;i++)
        {
            System.out.println(chatsSent[i]);
        }
        System.out.println();
        System.out.println("The messages received by "+this.name+" are:");
        for(int i=0;i<totalReceived;i++)
        {
            System.out.println(chatsReceived[i]);
        }
        System.out.println();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}