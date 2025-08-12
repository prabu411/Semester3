#include<iostream>
#include<string>
using namespace std;

void nativesearch(string text,string pattern){
    int n=text.size();
    int m=pattern.size();
    for(int i=0;i<=n-m;i++){
        int j;
        for(j=0;j<m;j++)
            if(text[i+j]!=pattern[j])
            break;
    if(j==m)
    cout<<"pattern found at index"<<i<<endl;

    }
}
int main(){
    nativesearch("ABABAB","ABA");
    return 0;
}

