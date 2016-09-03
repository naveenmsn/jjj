import java.util.*;

class Repeat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String se;
String s1=s.nextLine();
String s2=s.nextLine();
int temp1[]=new int[s1.length()];
int temp2[]=new int[s2.length()];
int k=-1,count1=0,count2=0;
for(int i=0;i<s1.length()-1;i++)
{
	for(int j=i+1;j<s1.length();j++)
	{
		if(s1.charAt(i)==s1.charAt(j))
		{
			temp1[++k]=i;
			temp1[++k]=j;
			count1+=2;
		}
	}
}
k=-1;
for(int i=0;i<s2.length()-1;i++)
{
	for(int j=i+1;j<s2.length();j++)
	{
		if(s2.charAt(i)==s2.charAt(j))
		{
			temp2[++k]=i;
			temp2[++k]=j;
			count2+=2;
		}
	}
}

for(int i=0;i<=count1;i++)
{	
	if(temp1[i]==temp2[i])
	{
		count1--;
	}
}
if(count1==0)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}
