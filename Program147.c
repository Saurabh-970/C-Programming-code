#include<stdio.h>
#include<stdlib.h>


typedef int * IPTR;
int Minimum(int Arr[], int iSize)
{
    int iCnt = 0, iMini = 0;   


    for(iMini = Arr[iCnt],iCnt = 0; iCnt <iSize; iCnt++)
    {
        if(Arr[iCnt] < iMini)
        {
            iMini = Arr[iCnt];
        }
    }
    return iMini;
}

int main()
{
    int iLength = 0;
    int iRet = 0;
    int iCnt = 0;
    IPTR iPtr = NULL;
    
    printf("Enter the number of elements : \n");
    scanf("%d",&iLength);

   

    //Step : Allocate the memory
    iPtr = (IPTR)malloc(iLength * sizeof(int));

    if(NULL == iPtr)
    {
        printf("Unable to allocate the memory\n");
        return -1;
    }

    printf("Enter the values :\n");
    
    for(iCnt =0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&iPtr[iCnt]);
    }

    //Step 2: Use the memory
   
    iRet = Minimum(iPtr,iLength);
    printf("Minimum number is : %d\n",iRet);
    
    //step 3 : Free the memory

    free(iPtr); 

    return 0;

}