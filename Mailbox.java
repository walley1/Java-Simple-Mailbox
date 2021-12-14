import java.util.*;
/**
 * Add class comment and @tags 
This class will model an email mailbox that stores email messages.  
@author Austin Walley
@version 9/16/21
*/
public class Mailbox
{
   /**
    * Create one instance variable of type ArrayList<Message> to hold the messages.
   */
    private ArrayList<Message> messages;
    /**
     * Write a Constructor that takes no parameters.
    */
    public Mailbox() 
    {
        messages = new ArrayList<Message>();
    }
    /**
     * Write a mutator method.
     * @param m of message
    */
    public void addMessage(Message m) 
    {
        messages.add(m);
    }
    /**
     * Write an accessor method.
     * @return message in Arraylist if it falls within index
     * @param index of Arraylist
    */
    public Message getMessage(int index)
    {
        if(index<0 || index>messages.size())
             return null;
        return messages.get(index);
    }
    /**
     * Write a mutator method.
     * @param index of any given message in the ArrayList
     * @return messages.remove(index)
    */
    public Message removeMessage(int index)
    {
        return messages.remove(index);
    }
    //All done!
}
