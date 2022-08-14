#include <stdio.h>
int main()
{
    int arr[5];
    int new_arr[5];
    printf("Enter 5 integers: ");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<5;i++)
    {
       int check=0;
       for(int j=0;j<5;j++)
       {
           if(arr[i]==new_arr[j])
           {
               check=1;
               break;
           }
       }
       if(check==0)
       {
           new_arr[i]=arr[i];
           int count=0;
           for(int k=0;k<5;k++)
           {
               if(arr[i]==arr[k])
               {
                   count++;
               }
           }
            printf("Number of Occurences %d is %d\n",arr[i],count);
       }
      
    }
    return 0;
}
