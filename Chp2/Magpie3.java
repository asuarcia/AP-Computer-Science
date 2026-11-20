/* Aitor Suarez
   Chp 02
   Program 7 */

public class Magpie3{
   /**
    * Take a statement with "I want ." and transform it into "I would like, too!"
    * @param statement the user statement, assumed to contain 
    *  "I want"
    * @return the transformed statement
    */
   private String transformIWantStatement(String statement){
      // Your code for Program 7 Part b goes here
      statement = statement.trim();
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals(".")){
         statement = statement.substring(0, statement.length() - 1);
      }
      int psn = findPhrase(statement, "I want", 0);
      String restOfStatement = statement.substring(psn + 6).trim();
      return "I would like " + restOfStatement + " too!";
   }

   /**
    * Take a statement with "Would you like to _ with me?" and transform it into 
    * "When would you like me to _ with you?"
    * @param statement the user statement, assumed to contain "Would you like 
    * to" and "with me"
    * @return the transformed statement
    */
   private String transformWouldYouLikeStatement(String statement){
      // Your code for Program 7 Part c goes here
      statement = statement.trim();
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals("?")){
         statement = statement.substring(0, statement.length() - 1);
      }
      int psnOfStart = findPhrase(statement, "would you like to", 0);
      int psnOfEnd = findPhrase(statement, "with me", psnOfStart + 17);
      String restOfStatement = statement.substring(psnOfStart + 17, psnOfEnd).trim();
      return "When would you like me to " + restOfStatement + " with you?";
   }
	
   /**
    * Gives a response to a user statement
    * @param statement the user statement
    * @return a response based on the rules given
    */
   public String getResponse(String statement){
      String response = "";
      if (statement.indexOf("math") >= 0 || 
         statement.indexOf("science") >= 0){
         response = "Is that your favorite class?";
      }
      else if (statement.indexOf("Newtown High School") >= 0) {
         response = "Newtown High School is the best school!";
      }
      else if (statement.indexOf("hamburger") >= 0){
         response = "That sounds yummy, tell me more.";
      }

      // Responses which require transformations
      else if (findPhrase(statement, "I want", 0) >= 0){
         response = transformIWantStatement(statement);
      }
      else if (findPhrase(statement, "Would you like", 0) >= 0){
         response = transformWouldYouLikeStatement(statement);
      }
      else{
         response = getRandomResponse();
      }
         return response;
   }


   /**
    * Search for one word in phrase. The search is not case sensitive. This 
    * method will check that the given goal is not a substring of a longer 
    * string (so, for example, "I know" does not contain "no").
    * @param statement the string to search
    * @param goal the string to search for
    * @param startPos the character of the string to begin the search at
    * @return the index of the first occurrence of goal in statement or -1 if 
    * it's not found
    */
   
   private int findPhrase(String statement, String goal, int startPos){
      //answer the questions posed as comments for Program 7 part a
      String phrase = statement.trim().toLowerCase();
      goal = goal.toLowerCase();

      // The only change to incorporate the startPos is in the line below
      int position = phrase.indexOf(goal, startPos);

      // Refinement--what is this doing?
      // Answer: As long as the goal string is found in phrase (position >= 0), this loop checks that it is a standalone word/phrase and not hidden inside another word. If it is inside another word, it keeps searching further down the string.
      while (position >= 0){
         // What is this doing?
         // Answer: It grabs the single character immediately before and immediately after the found goal phrase (defaulting to a space " " if the goal is at the very start or end of the string) so it can check if those characters are letters.
         String before = " ", after = " ";
         if (position > 0){
            before = phrase.substring(position - 1, position);
         }
         if (position + goal.length() < phrase.length()) {
            after = phrase.substring(position + goal.length(), position + goal.length() + 1);
         }

         // why are we testing against phrase.length()?
         // Answer: Testing (position + goal.length() < phrase.length()) prevents a StringIndexOutOfBoundsException by making sure there actually is at least one character after the goal word before trying to extract it with substring.
         if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))){
            return position;
         }

         // The last position didn't work, so let's find the next, if there is one.
         position = phrase.indexOf(goal, position + 1);
      }
      return -1; //why do we need this return? Will it ever execute?
      // Answer: Java requires every execution path in a non-void method to return an int, so this satisfies the compiler. Yes, it executes whenever the goal word is never found in the statement (or only appears inside longer words).
   }

   /**
    * Get a default greeting 	
    * @return a greeting
    */	
   public String getGreeting() {
      return "Hello, let's talk. Type in \"Bye\" to end our chat";
   }


   /**
    * Pick a default response to use if nothing else fits.
    * @return a non-committal string
    */
   private String getRandomResponse(){
      final int NUMBER_OF_RESPONSES = 6;

      int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
      String response = "";

      if (whichResponse == 0){
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
         response = "Where did you hear that?";
      } 
      else if (whichResponse == 5){
         response = "Please, go on.";
      }

      return response;
   }
}
