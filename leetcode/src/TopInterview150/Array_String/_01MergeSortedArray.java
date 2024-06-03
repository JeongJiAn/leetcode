package TopInterview150.Array_String;

public class _01MergeSortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in1nums1 = { 1, 2, 3, 0, 0, 0 }, in1nums2 = {2, 5, 6};
        int[] in2nums1 = { 1 }, in2nums2 = {};
        int[] in3nums1 = { 0 }, in3nums2 = { 1 };
        solution.merge(in1nums1, 3, in1nums2, 3);
        solution.merge(in2nums1, 1, in2nums2, 0);
        solution.merge(in3nums1, 0, in3nums2, 1);
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] temp = new int[m];
            int idx1 = 0, idx2 = 0;
            for (int i = 0; i < m; i++) {
                temp[i] = nums1[i];
            }
            for (int i = 0; i < n + m; i++) {
                if (idx1 == m) {
                    nums1[i] = nums2[idx2];
                    idx2++;
                }
                else if (idx2 == n) {
                    nums1[i] = temp[idx1];
                    idx1++;
                }
                else {
                    if (temp[idx1] > nums2[idx2]) {
                        nums1[i] = nums2[idx2];
                        idx2++;
                    } else {
                        nums1[i] = temp[idx1];
                        idx1++;
                    }
                }
            }
            for (int i = 0; i < n + m; i++) {
                System.out.print(nums1[i] + " ");
            }
            System.out.println();
        }
    }
}
