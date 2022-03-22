package ie.gmit.single;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Validates the user object
public class ValidUserCheck {

    public boolean checkUserDetails(User user){
        return isValidUser(user);
    }

    boolean isValidUser(User user) {
        if(!ValidUserInput.isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!ValidUserInput.isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        if(!ValidEmailCheck.isValidEmail(user.getEmail())) {
            return false;
        }
        return true;
    }

}
