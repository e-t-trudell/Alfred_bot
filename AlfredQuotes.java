import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "You have returned!";
    }
    
    public String guestGreeting(String name) {
        return "Welcome back " + name;
    }
    // Ninja bonus set guestGreeting method
    // myString = DateFormat.getDateInstance().format(myDate);
    public String guestGreeting(String name, String dayPeriod) {
        
        return "Good "  + dayPeriod  +  name;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation == "Alexis" ){
            return "Right away sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation == "Alfred"){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
        
    }
}
