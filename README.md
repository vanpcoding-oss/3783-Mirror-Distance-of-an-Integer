# 🚀 VanCoders - Daily LeetCode Challenge

## 📅 Day 1: Mirror Distance of a Number

Welcome to **VanCoders** — where we solve **LeetCode problems daily** to improve problem-solving and coding skills.

---

## 🧠 Problem Statement

Given an integer `n`, compute the **mirror distance** of the number.

### 🔍 Definition:
1. Reverse the digits of the number.
2. Find the absolute difference between the original number and its reversed form.

### 📌 Formula:

Mirror Distance = |n - reverse(n)|


---

## 💡 Example


Input: n = 1234
Reverse: 4321
Output: |1234 - 4321| = 3087


---

## 🛠 Approach

1. Extract digits using modulo (`n % 10`)
2. Build reversed number
3. Compute absolute difference

---

## 💻 Implementation (C++)

```cpp
#include <iostream>
#include <cmath>
using namespace std;

class Solution {
public:
    int reverse(int n) {
        int newNum = 0;
        while (n != 0) {
            newNum = newNum * 10 + (n % 10);
            n /= 10;
        }
        return newNum;
    }

    int mirrorDistance(int n) {
        int rev = reverse(n);
        return abs(n - rev);
    }
};

int main() {
    Solution obj;
    int n = 1234;
    cout << obj.mirrorDistance(n);
    return 0;
}
⚡ Complexity Analysis
Operation	Complexity
Reverse Number	O(log n)
Overall	O(log n)
🎯 Key Concepts
Number manipulation
Modulo and division
Absolute difference
Basic math logic
📺 Watch Full Explanation

👉 Check out today's video on our YouTube channel:
VanCoders

🔥 Stay Consistent

We post daily LeetCode solutions to help you:

Crack coding interviews
Strengthen DSA
Build consistency
📌 Connect With Us
⭐ Star this repo if you find it helpful
📌 Follow for daily updates
💬 Share with your friends
🧩 Keep Coding. Keep Growing.
💙 — Team VanCoders

---

If you want, I can also:
- Make a **template for all future days (Day 2, Day 3…)**
- Add **badges + GitHub stats**
- Optimize it for **SEO / YouTube traffic**
