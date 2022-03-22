package ie.gmit.single;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserInput {

    //Simply checks if value is null or empty..
    static boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    //check string for special characters
    static boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
}
