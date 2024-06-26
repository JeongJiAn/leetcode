package TopInterview150.Array_String;

public class _02RemoveElement {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{3,2,2,3};
        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(nums1, 3));
        System.out.println(solution.removeElement(nums2, 2));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val && nums[i] != -1) {
                    k++;
                } else if (nums[i] != -1) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = -1;
                    if (nums[i] == val) {
                        i--;
                    } else if (nums[i] != -1) {
                        k++;
                    }
                }
            }

            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();

            return k;
        }
    }
}
