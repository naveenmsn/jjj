import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int aa=s.nextInt();
int b=aa;
int reverse=0,remainder;
while(a>0)
{
remainder=aa%10;
reverse=reverse*10+remainder;
aa=aa/10;
}
if(reverse==b)
System.out.println("is a palindrome number");
else
System.out.println("its not a palindrome number");
}
}