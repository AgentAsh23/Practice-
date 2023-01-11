#include <iostream>
#include<cmath>
using namespace std;
long factorial(int n)  
{  
  if (n == 0)  
    return 1;  
  else  
    return(n * factorial(n-1));  
}  
int main() 
{
    int A1[10][100],A2[100][5],A3[5][50];
    int num=3;
    int p,q,r,s;
    printf("Enter the dimensions");
    scanf("%d",&p);
    scanf("%d",&q);
    scanf("%d",&r);
    scanf("%d",&s);
    int c2n=factorial(2*(num));
    int n_plus1=factorial(num+1);
    int n=factorial(num);
    long ways=round((c2n)/(n)*(n_plus1));
    printf("Number of ways=%d",ways);

    return 0;
}
