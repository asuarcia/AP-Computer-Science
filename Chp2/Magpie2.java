/* Aitor Suarez
   Chp 02
   Program 6 */

public class Magpie2 {
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);         
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting.";
        }
        else if (whichResponse == 1) {
            response = "Okay.";
        }
        else if (whichResponse == 2) {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3) {
            response = "What else could you tell me about that?";
        }
        else if (whichResponse == 4) {
            response = "Tell me more.";
        }
        else if (whichResponse == 5) {
            response = "Do you really think so?";
        }
        else if (whichResponse == 6) {
            response = "You don't say.";
        }
        return response;
    }

    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        
        if (statement.indexOf("math") >= 0 || statement.indexOf("science") >= 0) {
            response = "Is that your favorite class?";
        }
        else if (statement.indexOf("Newtown") >= 0) {
            response = "That sounds like a great school!";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
            response = "Tell me more about your pets.";
        }
        else {
            response = getRandomResponse();
        }
        
        return response;
    }
}
