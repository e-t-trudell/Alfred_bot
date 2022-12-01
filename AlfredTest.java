
public class AlfredTest {
    public static void main (String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testGuestGreeting2 = alfredBot.guestGreeting("Bruce Wayne", "morning");
        String testDateAnnoucement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");

        // Unxomment these out one at a time...
        // System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting2);
        // System.out.println(testDateAnnoucement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);

        // System.out.println(notRelevantTest);
    }
}
