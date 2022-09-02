#include<stdio.h>
int binarySearch(int num[],int x,int low,int high)
{
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(num[mid]==x)
        return mid;
        else if(num[mid]<x)
        low=mid+1;
        else
        high=mid-1;
    }
    return -1;
}
int main()
{
    int num[10];
    int a,b,c,n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&num[i]);
    }
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    int result1=binarySearch(num,a,0,n-1);
    int result2=binarySearch(num,b,0,n-1);
    int result3=binarySearch(num,c,0,n-1);
    printf("%d\n",result1);
    printf("%d\n",result2);
    printf("%d\n",result3);
    return 0;
}
