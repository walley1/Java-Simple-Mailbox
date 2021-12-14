import java.util.*;
/**
* This class will model an inbox that stores messages.  
* @author Austin Walley
* @version 9/16/21
*/
public class Mailbox
{
    private ArrayList<Message> messages;

    public Mailbox() 
    {
        messages = new ArrayList<Message>();
    }

    public void addMessage(Message m) 
    {
        messages.add(m);
    }

    public Message getMessage(int index)
    {
        if(index<0 || index>messages.size())
             return null;
        return messages.get(index);
    }

    public Message removeMessage(int index)
    {
        return messages.remove(index);
    }

}
