import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean isNumeric(String input){
        Pattern p = Pattern.compile("[0-9]");
        Matcher  m = p.matcher(input);
        return  m.matches();
    }
    public static boolean isCorrectNumber(String input){
        Pattern p = Pattern.compile("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]");
        Matcher  m = p.matcher(input);
        return  m.matches();
    }
    public static boolean isLetters(String input){
        Pattern p = Pattern.compile("[a-zA-Z]*");
        Matcher  m = p.matcher(input);
        return  m.matches();
    }
}
