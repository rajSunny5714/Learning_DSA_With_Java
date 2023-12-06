#include <iostream>
using namespace std;
int main() {
  // std::cout << "Hello World!\n";
  int n;
  cin >> n;
  int row = 1;
  while (row <= n) {
    int col = 1;
    while (col <= row) {
      char ch = 'a' + n - 1;
      cout << ch;
      col = col + 1;
    }
    cout << endl;
    row++;
  }
}