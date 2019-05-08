//1. Write a java program to count the total number of occurrences of a given character in a string
//   without using any loop?
//   For Example- Java is java again java again count number of occurrence of a in the given string

import java.util.Scanner;

public class CountCharacter
{
    public void count()
    {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the InputString:");
        String InputString=str.nextLine();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the character to be counted in the  string:");
        String InputCharacter= reader.nextLine();

        System.out.println("Length Of String:" + InputString.length());

        int charcount = InputString.length() - InputString.replaceAll(InputCharacter, "").length();
        System.out.println("Occurrence Of specific character in String: " + charcount);
    }

    public static void main(String[] args)
    {
        CountCharacter countCharacter=new CountCharacter();
        countCharacter.count();
    }
}
