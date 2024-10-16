#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    int d;
    int flag=0;
    d=(b*b-(4*a*c));
    if(d>0)
    {
    double rootno1,rootno2;
        rootno1=(-b+sqrt(d))/2*a;
        rootno2=(-b-sqrt(d))/2*a;
        cout<<rootno1<<" "<<rootno2;
    }
    else
    {
        cout<<"No real roots";
    }
}