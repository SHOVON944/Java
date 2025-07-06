#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--){
        long long n;
        cin>>n;
        double checking = 0;
        bool found = false;
        int ans = 0;
        for(int i=1; i<=n; i++){
            checking =(float)n/(pow(2,i) - 1);
            if(floor(checking) == checking){
                cout<<i<<endl;
                break;
            }
        }
    }

    return 0;
}