import java.util.*;
public class Pangram 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String sample=sc.next();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<sample.size();i++)
        {
            hs.add(sample.chatAt(i));
        }
        if(hs.size()==26)
        System.out.println("Pangram");
        else
        System.out.println("Not Pangram");
    }
}
