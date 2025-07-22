
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Patten
{
    public static void main(String[] args) {
        String input = "acw123";
        Pattern patten = Pattern.compile("[a-z]+\\d+");
        Matcher matcher = patten.matcher(input);

        if(matcher.matches())
        {
            System.out.println("Pattern are match's ");
        }
        else
        System.out.println("Pattern are not match's ");
    }
}