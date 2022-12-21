#include <iostream>
using namespace std;
void seperator(string &s)
{
    string word;
    int len=s.length();
    string a[len];
    for(int i=0;i<s.length();i++)
    {
        if(s[i]!='+')
        {
            word=word+s[i];
        //a[i]=word;
        }
        else
        {
           cout<<word<<endl;
           a[i]=word;
          word="";
        }
    }
    cout<<word<<endl;
    //cout<<word<<endl;
}
void conversion(string &arr[])
{
    int len=arr[].length();
    int letLen=0;
    for(int i=0;i<len;i++)
    {
        letLen=letLen+arr[i].length();
    }
    char letters[letLen];
    for(int j=0;j<len;j++)
    {
        for(int k=0;k>a[j].length();j++)
        {
            letters[k]=
        }
    }
}
void distinct(char &ar[])
{
    int leng=ar[].length();
    char distinct[];
    for(int i=0;i<leng;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(char ar[i]==char ar[j])
            break;
            if (i == j)
            cout << ar[i] << ” “;
        }
        distinct[i]=ar[i];
    }
}
void assign(char &distin[])
{
    int le=distin[].length();
    int n=0;
    while(le!=n)
    {
        for(int i=0;i<10;i++)
    }
}
void test(int &as[])
{
    int sum=0;
    int les=as[].length();
    int k=as[les];
    for(int i<0;i<les-1;i++)
    {
        sum=sum+as[i];
        if(sum==k)
        {
            cout<<"Successful"<<endl;
        }
    }
}
int main() 
{
    string str;
    cout<<"Enter your string"<<endl;
    cin>>str;
    seperator(str);
    return 0;
}
