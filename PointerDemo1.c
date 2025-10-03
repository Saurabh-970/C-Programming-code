#include<stdio.h>
int main()
{
    int iValue = 11;
    char cValue = 'M';

    int *iPtr = &iValue;
    char *cPtr = &cValue;

    printf("size of iPtr is %d/n",sizeof(iPtr));
    printf("size of cPtr is :%d/n",sizeof (cPtr));

    return 0;
}