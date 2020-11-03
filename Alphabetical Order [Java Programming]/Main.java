import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        String str[] = new String[count];
        scan.nextLine();
        for(int i = 0; i < count; i++)
        {
            str[i] = scan.next();
        }
        for (int i = 0; i < count; i++) 
        {
             //Try out your code here
          for(int j=i+1;j<count;j++)
          {
            if(str[j].compareTo(str[i])<0)
            {
              String s=str[j];
              str[j]=str[i];
              str[i]=s;
            }
          }
        }
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + " ");
        }
    }
}

   