class Solution {
    // time: O(n1 + n2)
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int []> li = new ArrayList<>();
        int i = 0, j = 0, n1 = nums1.length, n2 = nums2.length;

        while(i < n1 && j < n2){
            if(nums1[i][0] == nums2[j][0]){
                li.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i ++;
                j ++;
            } else if(nums1[i][0] < nums2[j][0]){
                li.add(nums1[i]);
                i ++;
            } else {
                li.add(nums2[j]);
                j ++;
            }
        }

        while(i < n1){
            li.add(nums1[i]);
            i ++;
        }
        while(j < n2){
            li.add(nums2[j]);
            j ++;
        }
        return li.toArray(int[][] :: new);
    }
}