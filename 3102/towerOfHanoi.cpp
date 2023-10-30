#include <bits/stdc++.h>
using namespace std;
void towerOfHanoi(int n, char a, char c, char b)
{
    if (n == 0) return;
    towerOfHanoi(n - 1, a, b, c);
    cout << "Move disk: " << n << " from rod: " << a << " to rod: " << c << endl;
    towerOfHanoi(n - 1, b, c, a);


}

int main()
{
    int n;
    cout << "Enter number of disk: ";
    cin >> n;
    towerOfHanoi(n, 'A', 'C', 'B');
}
