class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;

        while (i < n1 && j < n2) {
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];

            if (id1 == id2) {
                result.add(new int[]{id1, val1 + val2});
                i++;
                j++;
            } else if (id1 < id2) {
                result.add(new int[]{id1, val1});
                i++;
            } else {
                result.add(new int[]{id2, val2});
                j++;
            }
        }
        while (i < n1) {
            result.add(nums1[i++]);
        }
        while (j < n2) {
            result.add(nums2[j++]);
        }

        return result.toArray(new int[result.size()][]);
    }
}