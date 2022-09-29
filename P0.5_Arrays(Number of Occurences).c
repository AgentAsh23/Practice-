#include <stdio.h>
int main()
{
    int arr[5][2]={{0,0},{0,0},{0,0},{0,0},{0,0}};
    printf("Enter 5 integers: ");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i][0]);
    }
    for(int i=0;i<5;i++)
    {
       int check=0;
       for(int j=0;j<5;j++)
       {
           if(arr[i][0]==arr[j][0] && arr[j][1]>0)
           {
               check=1;
               break;
           }
       }
       if(check==0)
       {
           for(int k=0;k<5;k++)
           {
               if(arr[i][0]==arr[k][0])
               {
                   arr[i][1]++;
               }
           }
            printf("Number of Occurences %d is %d\n",arr[i][0],arr[i][1]);
       }
      
    }
    return 0;
}
      
    }
    return 0;
}
