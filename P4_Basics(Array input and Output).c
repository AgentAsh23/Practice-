#include <stdio.h>
int main()
{
    int a[5];
    printf("Enter 5 integers: ");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Displaying 5 integers: ");
    for(int i=0;i<5;i++)
    {
        printf("%d\n",a[i]);
        
    }
}
