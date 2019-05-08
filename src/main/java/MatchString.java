//6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
//        methods.
//        Input : She sells seashells by the seashore
//        Given word: se
//        Output :
//        Found at: 4 - 6
//        Found at: 10 - 12
//        Found at: 27 – 29

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchString
{
    public void match()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scanner.nextLine();

        System.out.println("Enter the string whos occurance you want to find");
        String str1=scanner.nextLine();

        Pattern pattern = Pattern.compile(str1);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.print("Found at: ");
            System.out.print(matcher.start()+" - ");
            System.out.println(matcher.end());
        }
    }

    public static void main(String[] args)
    {
        MatchString matchString=new MatchString();
        matchString.match();
    }
}
