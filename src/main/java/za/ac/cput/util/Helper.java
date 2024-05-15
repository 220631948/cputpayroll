package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.UUID;

public class Helper {
    public static boolean isNullorEmpty (String s){
        return (s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static boolean isValidEmail(String email){
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        }
        catch (AddressException ex) {
            result = false;
        }
        return result;
    }
    public static void checkStringParam(String paramName, String paramValue){
        if (isNullorEmpty(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }
}
