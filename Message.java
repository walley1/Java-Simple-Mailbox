/**
 * Add class comment and @tags 
This class models an email message. It will have a sender, a recipient, and message text.
@author Austin Walley
@version 9/16/21
*/
public class Message
{
    /**
     * Declare and initialize 3 instance variables.
    */
    private String recipient;
    private String sender;
    private String messageText; 
    
    /**
     * Create a constructor.
     * @param recipient of message
     * @param sender of message
    */
    public Message(String recipient, String sender)
    {
        this.recipient = recipient;
        this.sender = sender;
        this.messageText = "";
    }
    
    /**
     * Write a mutator method, append.
     * @param newText of message
    */
    public void append(String newText)
    {
        this.messageText = messageText + newText + "\n";
    }
    /**
     * Write a toString method.
     * @return entire message
    */
    public String toString()
    {      
        return "From:" +this.sender+"\n"+ "To:" +this.recipient+"\n" +this.messageText+"\n";     
    }
    /**
     * Prints toString method.
    */
    public void print()
    {
        System.out.println(toString());
    }
    //All done!
}
