#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[4];
    for(int i=0;i<4;i++)
    {
        cin>>arr[i];
    }
    int p=arr[0];
    int q=arr[1];
    int r=arr[2];
    int s=arr[3];
    int x = (p*q*r)+(p*r*s);
    int y = (q*r*s)+(p*q*s);
    
    cout<<std::min(x,y);
    return 0;
}
