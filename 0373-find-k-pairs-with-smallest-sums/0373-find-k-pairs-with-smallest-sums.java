class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        Queue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> a[0] - b[0]);
        for(int i = 0; i < nums1.length; i++) {
            pq.offer(new int[] {nums1[i] + nums2[0], i, 0});
        }

        List<List<Integer>> result = new ArrayList<>();
        while(k-- > 0 && !pq.isEmpty()) {
            int[] elements = pq.poll();
            result.add(new ArrayList<>(Arrays.asList(nums1[elements[1]], nums2[elements[2]])));
            if(elements[2] + 1 < nums2.length) {
                pq.offer(new int[] {
                    nums1[elements[1]] + nums2[elements[2] + 1], 
                    elements[1], elements[2] + 1
                });
            }
        }
        return result;
    }
}