#include<iostream>
using namespace std;
int vow(string s)
{
    int a=0;
    int b=0;
    for(char c:s)
    {
    if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'|| c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
    {
        a++;
    }
    else
    {
        b++;
    }
    }
    cout<<"VOW:"<<a<<"   "<<"CONS:"<<b;
    return 0;
}
int main()
{
    string check;
    cin>>check;
    int ans=vow(check);

    return 0;
}