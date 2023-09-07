#include<stdio.h>
bool is_pal(int n) {
    //if (n % 10 == 0) return 0;
    //int r = 0;
    //while (r < n) {
    //    r = 10 * r + n % 10;
    //    n /= 10;
    //}
    //return n == r || n == r / 10;
    if (n % 10 == 0) return 0;
        int r = 0;
        while (r < n) {
            r = 10 * r + n % 10;
            n /= 10;
        }
        while(n == r || n == r / 10)return 1;
        return 0;
}
int main(){
	int a;
	for(int i=1;i<=1000;i++)
	{
		if(is_pal(i)==1)
		{
			printf("%d\n",i);
		}
	}
}
