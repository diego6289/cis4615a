import java.util.logging.Logger;
import java.util.regex.Pattern;

/* 
    Rule 00. Input Validation and Data Sanitization (IDS)
    IDS03-J. Do not log unsanitized user input.
    
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
