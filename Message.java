/**
* This class models an email message. It will have a sender, a recipient, and message text.
* @author Austin Walley
* @version 9/16/21
*/
public class Message
{
    private String recipient;
    private String sender;
    private String messageText; 

    public Message(String recipient, String sender)
    {
        this.recipient = recipient;
        this.sender = sender;
        this.messageText = "";
    }

    public void append(String newText)
    {
        this.messageText = messageText + newText + "\n";
    }

    public String toString()
    {      
        return "From:" +this.sender+"\n"+ "To:" +this.recipient+"\n" +this.messageText+"\n";     
    }

    public void print()
    {
        System.out.println(toString());
    }

}
