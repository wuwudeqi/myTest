class Solution {
    public  int removeElement(int[] nums, int val) {
        int n = nums.length;

        if (n < 1) {
            return n;
        }

        int slow = 0;
        int fast = 0;
        while (fast < n) {
            if (nums[fast] == val) {
                fast++;
                continue;
            }
            nums[slow++] = nums[fast++];
        }

        return slow;
    }

   public static void main (String[]args){
            Solution solution = new Solution();
            solution.removeElement(new int[]{1,2,2,3},2);
        }
    }