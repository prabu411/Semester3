#include <iostream>
#include <string>
using namespace std;

const int d = 256;
const int q = 100;

void RabinKarp(const string& text, const string& pattern) {
    int n = text.size();
    int m = pattern.size();
    if (m > n) {
        cout << "Not enough space for the same" << endl;
        return;
    }

    int h = 1;
    for (int i = 0; i < m - 1; i++)
        h = (h * d) % q;

    int p = 0;
    int t = 0;

       for (int i = 0; i < m; i++) {
        p = (d * p + pattern[i]) % q;
        t = (d * t + text[i]) % q;
    }


    int table[1000] = {0};

    for (int i = 0; i <= n - m; i++) {
        table[i] = t;
        if (p == t) {
            bool match = true;
            for (int j = 0; j < m; j++) {
                if (text[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                cout << "Pattern found at index: " << i << endl;
            }
        }
        if (i < n - m) {
            t = (d * (t - text[i] * h) + text[i + m]) % q;
            if (t < 0) t += q;
        }
    }
}

int main() {
    string s1, s2;
    cout << "Enter the first string: ";
    getline(cin, s1);
    cout << "Enter the second string: ";
    getline(cin, s2);
    RabinKarp(s1, s2);
    return 0;
}