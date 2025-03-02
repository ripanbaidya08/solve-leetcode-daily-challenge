## Intuition:
The problem requires modifying an array based on specific rules:

- If two consecutive elements are equal, double the first one and set the second one to zero.
- Shift all nonzero elements to the left while maintaining their order, pushing zeros to the right.

This is similar to the "2048" game logic, where adjacent equal numbers merge into one and the rest shift accordingly.

## Approach:

### **First Pass (Modification Step)**
- Traverse the array and check adjacent elements.
- If `nums[i] == nums[i+1]`, update `nums[i]` to `nums[i] * 2` and set `nums[i+1] = 0`.

### **Second Pass (Shifting Non-Zero Elements)**
- Create a new array `res` of the same length as `nums`.
- Iterate through `nums`, adding all nonzero elements to `res` while maintaining their relative order.

## Time & Space Complexity:

- **Time Complexity:** **O(N)**
  - The first loop runs in **O(N)** time.
  - The second loop also runs in **O(N)** time.
  - Overall complexity remains **O(N)**.

- **Space Complexity:** **O(N)**
  - A separate array `res` of size **N** is used, leading to **O(N)** extra space.

## Code:
```java
class Solution {
    public int[] applyOperations(int[] nums) {
        // Step 1: Modify adjacent equal elements
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        
        // Step 2: Shift nonzero elements to the left
        int[] res = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                res[j++] = nums[i];
            }
        }
        return res;
    }
}
