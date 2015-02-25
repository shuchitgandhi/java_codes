import java.util.Scanner;

public class ChatRoom {
    public static void main(String args[])
    {
        String str;
        String name[];
        String chat[];
        String sender;
        String receiver;
        String message;
        int senderIndex;
        int receiverIndex;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the names ofthe people who are gonna participate in the chat:");
        str=input.nextLine();
        name=str.split(" ");
        User[] users=new User[name.length];
        for(int i=0;i<name.length;i++)
        {
            users[i]=new User(name[i]);
        }
        while(true)
        {
            str=input.nextLine();
            chat=str.split(" ",3);
            if(chat.length==1)
            {
                senderIndex=find(users,chat[0]);
                if(senderIndex!=-1)
                {
                    users[senderIndex].printLog();
                }
                else
                {
                    System.out.println("Not found!!!");
                }
            }
            else
            {
                sender=chat[0];
                receiver=chat[1];
                message=chat[2];
                senderIndex=find(users,sender);
                receiverIndex=find(users,receiver);
                if(senderIndex!=-1 &&receiverIndex!=-1)
                {
                    users[senderIndex].receiveMessageSent(message, receiver);
                    users[receiverIndex].receiveMessageReceived(message, sender);
                }
                else
                {
                    System.out.println("Not found");
                }
            }
        }
    }
    
    public static int find(User users[],String name)
    {
        for(int i=0;i<users.length;i++)
        {
            if(name.equalsIgnoreCase(users[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }

}