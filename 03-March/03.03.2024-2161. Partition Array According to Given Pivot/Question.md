# Partition Array According to Given Pivot

## Problem Description
Given a 0-indexed integer array `nums` and an integer `pivot`, rearrange `nums` to satisfy the following conditions:

1. Every element less than `pivot` appears before every element greater than `pivot`.
2. Every element equal to `pivot` appears in between the elements less than and greater than `pivot`.
3. The relative order of the elements less than `pivot` and the elements greater than `pivot` is maintained.

## Example
### Input:
```plaintext
nums = [9, 12, 5, 10, 14, 3, 10]
pivot = 10
```

### Output:
```plaintext
[9, 5, 3, 10, 10, 12, 14]
```

### Explanation:
- Elements `9, 5, 3` are less than the pivot, so they appear first.
- Elements `10, 10` are equal to the pivot and appear in the middle.
- Elements `12, 14` are greater than the pivot, so they appear last.
- The relative ordering of elements in each category is maintained.

## Constraints
- `1 <= nums.length <= 10^5`
- `-10^6 <= nums[i] <= 10^6`
- `pivot` is guaranteed to be an element of `nums`.