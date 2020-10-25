import java.util.logging.Logger;
import java.util.regex.Pattern;

/* 
    IDS03-J. Do not log unsanitized user input.
    
    Vulnerability: Allowing unvalidated user input to be logged can result in forging of 
    log entries, leaking secure information, or storing sensitive data in a manner that violates 
    a local law or regulation.

    Solution (Sanitized User) This compliant solution sanitizes the username before logging it, 
    preventing injection attacks.
*/

public class R00_IDS03_J {
    public static void main(String args[]) 
    {
        boolean loginSuccessful = true;
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        String username = "guest";
        
        if (loginSuccessful) 
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        else 
            logger.severe("User login failed for: " + sanitizeUser(username));
    }

    public static String sanitizeUser(String username) 
    {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}