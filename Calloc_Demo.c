#include<stdio.h>
#include<stdlib.h>

 int main()
{
    int length =  0;
    int *Arr = NULL;

    printf("enter the number of elements\n");
    scanf("%d", &length);

    //step one allocate the memory

    Arr = (int*)calloc(length , sizeof(int));
    if(Arr == NULL)
    {
     printf("unable to allocate memory\n");
    }
    else 
    {
    printf("memory gets allocated\n");
    }

    // step 2: use the memory

    // stepn3: free the memory

    free(Arr);
    return 0;
}