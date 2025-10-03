#include<stdio.h>
int main ()
{
    int Arr[4] = {10,20,30,40};
    printf("Arr : %d\n",Arr); //100
    printf("&Arr :%d\n",&Arr); //100
    printf("&(Arr[0]):%d\n",&(Arr[0])); //100

    return 0;

}