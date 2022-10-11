import  java.util.*;
public class Main {
    public static void duplicate_String(char word[])
    {
        int count=1;

        for(int i=0;i<word.length;i++)
        {
            for(int j=i+1;j<word.length;j++)
            {
                if(word[i]==word[j]&&word[i]!=' ')
                {
                    count++;
                    word[j]='0';
                }
                if(count>1&&word[i]!='0')
                {
                    System.out.println(word[i]);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your word\n");
        String word=sc.nextLine();
        char ch[]=word.toCharArray();
        duplicate_String(ch);
        System.out.println("Hello world!");
    }
}