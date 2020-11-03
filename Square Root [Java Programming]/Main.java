import java.util.Scanner;  
class Main   
{  
    public static void main(String[] args)    
    {   
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        System.out.println(squareRoot(n));  
    }  

public static double squareRoot(int num)   
{  
    
   //Try out your code here
   double prev;  
    double sqrt=num/2;  
    do   
    {  
        prev=sqrt;  
        sqrt=(sqrt+(num/sqrt))/2;  
    }   
    while((prev-sqrt)!= 0);  
    return sqrt;  
    }  
    
}  
