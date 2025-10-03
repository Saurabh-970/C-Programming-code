#include<stdio.h>
int main ()
{

    int Arr[4]= {10,29,30};

    int Brr[3\];
    Brr[2] = 30;
    Brr[0] = 10;
    Brr[1] = 20;

    printf("%d\n",Arr[0]); //10 
    printf("%d\n",Arr[1]); //29

    printf("%d\n",Brr[0]); //10
    printf("%d\n",Brr[1]); // 20

    return 0;
}