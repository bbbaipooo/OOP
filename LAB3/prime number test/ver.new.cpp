#include<stdio.h>
int prime(int n)
{
	for (int i = 2; i <= n-1; i++) { 
        if (n % i == 0) { 
           return 0;
        }
	}
	return 1;
}
int main(){
	for(int j=2;j<=1000;j++)
	{
		if(prime(j)!=0)
		printf("%d ",j);
	}
}
