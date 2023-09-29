#include<bits/stdc++.h>
using namespace std;


bool isVowel(char c)
{
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A' ||c=='E'||c=='I'||c=='O'||c=='U')
        return true;
    return false;
}

int solve(vector<char> pID)
{
    int cnt = 0 ;
    for(char c : pID)
    {
        if(!isVowel(c))
            cnt++;
    }
    return cnt;
}

int main()
{
    vector<char> v('a','v','i','k','e','l');

    cout<<solve(v);
}