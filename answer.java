class Solution {

    // Function to reverse a number
    public int reverse(int n) {
        int newNum = 0;

        while (n != 0) {
            newNum = newNum * 10 + (n % 10);
            n = n / 10;
        }

        return newNum;
    }

    // Function to calculate mirror distance
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(n - rev);
    }

    // Optional main for testing
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 1234;
        System.out.println(obj.mirrorDistance(n)); // Output: 3087
    }
}
