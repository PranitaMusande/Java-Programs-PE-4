//5. Write a program with the implementation of Regular Expression to find the presence of the name
//        Harry in a string.
//        Input: This is Harry.
//        Output: Is Harry here ? true
//        Input : This is Henry.
//        Output: Is Harry here ? False

import java.util.Scanner;

public class PresenceWord
{
    public void presence()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the sentence");
        String s = scanner.nextLine();

        System.out.println("Input the word to be searched");
        String s2 = scanner.nextLine();

        if(s.contains(s2))
        {
            System.out.println( s2 +" is present" + " True ");
        }
        else{

            System.out.println(s2 + " is not present" + " False ");
        }
    }

    public static void main(String[] args)
    {
        PresenceWord presenceWord=new PresenceWord();
        presenceWord.presence();
    }
}
