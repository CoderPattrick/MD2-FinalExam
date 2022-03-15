package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidContactInfo {
    public final String regexName = "^[a-zA-Z]+(?:[\\s.]+[a-zA-Z]+)*$";
    public final String regexPhone = "^[0]\\d{7,}";
    public final String regexGender = "male|female";
    public final String regexAddress = "[\\w\\s]+";
    public final String regexDay = "\\d{1,2}";
    public final String regexMonth = "\\d{1,2}";
    public final String regexYear = "\\d{4}";
    public final String regexMail = "^[\\w]+[\\w]*@[\\w]+(\\.[\\w]+)$";

    boolean isValidInfo(String info,String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(info);
        return m.matches();
    }
    boolean isValidDate(int day,int month, int year){
        return true;
    }
}
class TestRegex{
    public static void main(String[] args) {
        ValidInput input =new ValidInput();
        CheckValidContactInfo checker = new CheckValidContactInfo();

        String regex = checker.regexDay;
        String test1 = input.inputAnyThing();
        boolean isValid = checker.isValidInfo(test1,regex);
        System.out.println("Valid? "+isValid);
    }
}
