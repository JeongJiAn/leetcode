package TopInterview150.Array_String;

public class _03RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums1));
        System.out.println(solution.removeDuplicates(nums2));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0;

            if (nums.length == 1) {
                return 1;
            }

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    k++;
                } else if (nums[i] != -1) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = -1;
                    if (nums[i] == nums[i + 1]) {
                        i--;
                    } else if (nums[i] != -1) {
                        k++;
                    }
                }
            }

            if (k == nums.length - 1 && nums[k] != nums[k - 1] && nums[k] != -1) {
                k++;
            }

            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();

            return k;
        }
    }
}
