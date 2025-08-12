
#include<iostream>
#include<vector>
using namespace std;

int lpstable(string s) {
    int n = s.size();
    vector<int> lps(n, 0);
    int len = 0; 
    int i = 1;

    while (i < n) {
        if (s[i] == s[len]) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
    } for (int j = 0; j < n; j++) {
        cout << lps[j] << " ";
    }
    cout << endl;

    return 0; 

}
vector<int> search(string &s,string &txt){
    int n=txt.length();
    int m=s.length();
    vector<int> lps(m);
    vector<int> result;
    int j = 0; 
    lpstable(s);
    int i = 0;
    while(i<n-m){
        if(s[j] == txt[i]) {
            j++;
            i++;
        }
        if(j == m) {
            result.push_back(i - j);
            j = lps[j - 1];
        } else if(i < n && s[j] != txt[i]) {
            if(j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
}

int main() {
    string s;
    cout << "Enter the string: ";
    cin >> s;
    lpstable(s);
    return 0;
}

