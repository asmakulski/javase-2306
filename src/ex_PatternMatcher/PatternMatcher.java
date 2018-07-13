package ex_PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("myPattern");
        Matcher matcher1 = pattern.matcher("Is there a pattern?");
        Matcher matcher2 = pattern.matcher("Is there myPattern?");
        Matcher matcher3 = pattern.matcher("myPattern");

        System.out.println("Matcher1 find: " + matcher1.find());
        System.out.println("Matcher1 matches: " + matcher1.matches());
        System.out.println("Matcher2 find: " + matcher2.find());
        System.out.println("Matcher2 matches: " + matcher2.matches());
        System.out.println("Matcher3 find: " + matcher3.find());
        System.out.println("Matcher3 matches: " + matcher3.matches());

    }
}
