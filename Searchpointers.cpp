// Online C++ compiler to run C++ program online
#include<iostream>
using namespace std;
bool search(char *a, char target)
{
    int n=sizeof(a)/sizeof(a[0]);
    for(int i=0;i<n;i++)
    {
        if(*(a+i)==target)
        {
            return true;
        }
    }
    return false;
}
int main()
{
    char a[]= "hello";
    char target='e';
    int n=sizeof(a)/sizeof(a[0]);
    if(search(a,target))
    {
        cout<<"present"<<endl;
    }
    else
    {
        cout<<"absent";
    }
}

#include <iostream>
using namespace std;
bool search(int* a, int target,int n)
{
    for (int i = 0; i < n; i++)
    {
        if (*(a + i) == target)
        {
            return true;
        }
    }
    return false;
}
int main()
{
    int a;
    cin>>a;
    int arr[a];
    for(int i=0;i<a;i++)
    {
        cin>>arr[i];
    }
    int n = sizeof(arr)/sizeof(arr[0]);  
    int target;
    cout << "Enter the target character: ";
    cin >> target;

    if (search(arr, target,n))
    {
        cout << "present" << endl;
    }
    else
    {
        cout << "absent" << endl;
    }

    return 0;
}
