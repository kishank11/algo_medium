import java.util.*;

class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here
        Arrays.sort(array);

        List<Integer[]> triplets = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    Integer[] newTriplet = { array[i], array[left], array[right] };
                    triplets.add(newTriplet);
                    left++;
                    right--;

                } else if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        int[] x = { 1, 2, 3, 4, 5, 6 };
        triplets = threeNumberSum(x, 6);
        System.out.println(triplets.get(0));
    }

}