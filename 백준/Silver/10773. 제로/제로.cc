#include <iostream>
#include <stack>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	int k;
	stack<int> s;
	cin >> k;

	for (int i = 0; i < k; i++) {
		int n;
		cin >> n;
		if (n == 0) s.pop();
		else s.push(n);
	}

	int sum = 0;
	while (!s.empty()) {
		sum += s.top();
		s.pop();
	}
	cout << sum;

	return 0;
}