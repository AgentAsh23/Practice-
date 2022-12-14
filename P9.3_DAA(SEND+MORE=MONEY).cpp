#include <iostream>
using namespace std;

int main() 
{
    int count=0;
    for(int S=0;S<10;S++)
        for(int E=0;E<10;E++)
        for(int N=0;N<10;N++)
        for(int D=0;D<10;D++)
        for(int M=0;M<10;M++)
        for(int O=0;O<10;O++)
        for(int R=0;R<10;R++)
        for(int Y=0;Y<10;Y++)
        {
        int SEND=1000*S+100*E+10*N+D;
        int MORE=1000*M+100*O+10*R+E;
        int MONEY=10000*M+1000*O+100*N+10*E+Y;
        if((S!=E)&&(S!=N)&&(S!=D)&&(S!=M)&&(S!=O)&&(S!=R)&&(S!=Y)&&(E!=N)&&(E!=D)&&(E!=M)&&(E!=O)&&(E!=R)&&(E!=Y)&&(N!=D)&&(N!=M)&&(N!=O)&&(N!=R)&&(N!=Y)&&(D!=M)&&(D!=O)&&(D!=R)&&(D!=Y)&&(M!=O)&&(M!=R)&&(M!=Y)&&(O!=R)&&(O!=Y)&&(R!=O)&&(R!=Y)&&(O!=Y))
       {
        if(MONEY==(SEND+MORE))
        {
            cout<<"S="<<S<<" E="<<E<<" N="<<N<<" D="<<D<<" M="<<M<<" O="<<O<<" R="<<R<<" Y="<<Y<<endl;
            cout<<MONEY<<endl;
            count++;
        }
      }
    }
    cout<<"Number of Solutions= "<<count<<endl;
    return 0;
}
