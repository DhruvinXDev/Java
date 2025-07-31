
import java.util.Arrays;
import java.util.StringTokenizer;



class Palidrom
{
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Incidunt www aut maxime asperiores vero veniam eveniet dad laudantium Manam suscipit obcaecati porro ror rem consequuntur nisi magnam temporibus ducimus, similique officia magni www necessitatibus sunt! aasaa ";
        String fre = new String();
        
        StringTokenizer token = new StringTokenizer(str);
        while(token.hasMoreTokens())
        {
            String ext = token.nextToken();
            char[] e = ext.toCharArray();
            char[] t = new char[ext.length()];
            int i = 0, j=ext.length()-1;
            while(i<ext.length())
            {
                t[i]= e[j];
                j--;
                i++;
            }
            String s = new String(t);
            if(s.equalsIgnoreCase(ext) && s.length() > 1)
            {
                System.out.println("palidrom string is : "+ ext);
                fre += ext + " ";
                
            }
        }
        System.out.println("");
        System.out.println("Palidrom String sentance string is : " + fre);
        System.out.println("");
        String[ ] token1 = fre.split(" ");
        Arrays.sort(token1);
        for(int i = 0 ; i < token1.length -1 ;i++)
        {
            int count = 1 ;
            
                if(token1[i].equalsIgnoreCase(token1[i+1]))
                {
                    count++;
                    i = i+1;
                }
            System.out.println("String "+ token1[i]+ " : " + count);
        }
        

    }
}