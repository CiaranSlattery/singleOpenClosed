package ie.gmit.single;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailCheck {

    //check string for valid email address - this is not for prod.
    //Just for demo. This fails for lots of valid emails.
    static boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
}
