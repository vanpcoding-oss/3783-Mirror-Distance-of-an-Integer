class Solution:

    # Function to reverse a number
    def reverse(self, n: int) -> int:
        new_num = 0
        
        while n != 0:
            new_num = new_num * 10 + (n % 10)
            n //= 10
        
        return new_num

    # Function to calculate mirror distance
    def mirror_distance(self, n: int) -> int:
        rev = self.reverse(n)
        return abs(n - rev)


# Example usage
obj = Solution()
n = 1234
print(obj.mirror_distance(n))  # Output: 3087
