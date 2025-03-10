#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    set<int> s;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        s.insert(x);
    }

    for (auto i : s) cout << i << "\n";

    return 0;
}