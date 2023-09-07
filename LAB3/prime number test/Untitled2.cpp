#include<stdio.h>
int prime(int i)
{
	if((i==1 || i%2 == 0 || i%3 == 0 || i%5==0 || i%7==0) && (i!=2 && i!=3 && i!=5 && i!=7))
	{
            return 0;
    }
    return i;
}

int main(){
	for(int i=0;i<=1000;i++)
	{
		if(prime(i)!=0)
		printf("%d ",prime(i));
	}
}
