
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Practical {

    public static void main(String[] args) {
        String str = "hello my name is dhruvin , dhruvin study in computer engineeing , dhruvin is programmer , dhruvin is currently in 2nd year , dhruvin are form surat dhruvin study in anand dhruvin in charusat university dhruvin collage namme is chandubhai s patel institute of technology dhruvin collage short form is CSPIT.";
        Pattern ptn = Pattern.compile("dhruvin ");
        Matcher match = ptn.matcher(str);
        while(match.find())
        {
            System.out.println("dhruvin at index : " + match.start() +" and word is : " + match.group());
        }
    }
}
