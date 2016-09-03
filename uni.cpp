#include<iostream>
using namespace std;
void find();
void sort();
int b[100],count=0;
int main()
{
char a[100];
cout<<"enter the size of the array:";
cin>>count;
cout<<"enter the "<<count<<" element(s):"<<endl;
for(int i=0;i<count;i++)
{	
	cin>>b[i];
}
sort();
find();
return 0;
}
void find()
{	
	for(int i=0;i<count;i++)
	{	
		if(i==b[i])
		{
			cout<<"The number "<<b[i]<<" is equal to its index "<<i<<endl;
		}	
	}
}
void sort()
{	
	for(int i=0;i<count;i++)
	{
		for(int j=0;j<count;j++)
		{	
			int c;
			if(b[i]<b[j])
			{
				c=b[i];
				b[i]=b[j];
				b[j]=c;
			}
		}
	}
}
