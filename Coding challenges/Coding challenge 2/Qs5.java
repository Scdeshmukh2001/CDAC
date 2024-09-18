import java.util.*;

public class Qs5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Window size: " + k);
        List<Double> medians = findSlidingWindowMedian(nums, k);
        System.out.println("Medians: " + medians);
    }

    public static List<Double> findSlidingWindowMedian(int[] nums, int k) {
        List<Double> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            if (maxHeap.isEmpty() || nums[i] <= maxHeap.peek()) {
                maxHeap.add(nums[i]);
            } else {
                minHeap.add(nums[i]);
            }

            balanceHeaps(minHeap, maxHeap);

            if (i >= k - 1) {
                if (maxHeap.size() == minHeap.size()) {
                    result.add(((double) maxHeap.peek() + minHeap.peek()) / 2);
                } else {
                    result.add((double) maxHeap.peek());
                }

                int elementToRemove = nums[i - k + 1];
                if (elementToRemove <= maxHeap.peek()) {
                    maxHeap.remove(elementToRemove);
                } else {
                    minHeap.remove(elementToRemove);
                }

                balanceHeaps(minHeap, maxHeap);
            }
        }

        return result;
    }

    private static void balanceHeaps(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
}
