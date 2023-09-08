#include <iostream>
using namespace std;

int main() 
{
    float NOutfood,LW,CS,Fruit,Nsweet,Gate,fullstack,leetcode,codeChef,HRank,exercise,NTap,sleep;
    float life,a,b,c,d,e,f,g,h,i,j,k,l;
    cout<<"Enter days you haven't eaten outside food out of 7"<<endl;
    cin>>NOutfood;
    a=NOutfood/7;
    cout<<"Enter days you have drank 4 litres of water out of 7"<<endl;
    cin>>LW;
    b=LW/7;
    cout<<"Enter days you have taken cold showers out of 7"<<endl;
    cin>>CS;
    c=CS/7;
    cout<<"Enter days you have eaten Fruit out of 7"<<endl;
    cin>>Fruit;
    d=Fruit/7;
    cout<<"Enter days you haven't taken any sugar intake out of 7"<<endl;
    cin>>Nsweet;
    e=Nsweet/7;
    cout<<"Enter in minutes you have done your gate preparation"<<endl;
    cin>>Gate;
    f=Gate/1260;
    cout<<"Enter in minutes you have done your fullstack"<<endl;
    cin>>fullstack;
    g=fullstack/420;
    cout<<"Enter in minutes you have done your leetcode"<<endl;
    cin>>leetcode;
    g=leetcode/420;
    cout<<"Enter in minutes you have done your codeChef"<<endl;
    cin>>codeChef;
    h=codeChef/420;
    cout<<"Enter in minutes you have done your HackerRank"<<endl;
    cin>>HRank;
    i=HRank/420;
    cout<<"Enter in minutes you have done your exercise"<<endl;
    cin>>exercise;
    j=exercise/420;
    cout<<"Enter in days you have done your No Tap"<<endl;
    cin>>Ntap;
    k=Ntap/7;
    cout<<"Enter in minutes you have done your sleep"<<endl;
    cin>>sleep;
    l=sleep/2940;
    life=((a+b+c+d+e+f+g+h+i+j+k+l)/12)*100;
    cout<<life;
    return 0;
}
