#include <iostream>
#include <cmath>
using namespace std;

class Solution {
public:

    // Function to reverse a number
    int reverse(int n) {
        int newNum = 0;

        while (n != 0) {
            newNum = newNum * 10 + (n % 10);
            n /= 10;
        }

        return newNum;
    }

    // Function to calculate mirror distance
    int mirrorDistance(int n) {
        int rev = reverse(n);
        return abs(n - rev);
    }
};

int main() {
    Solution obj;
    int n = 1234;
    cout << obj.mirrorDistance(n);  // Output: 3087
    return 0;
}
